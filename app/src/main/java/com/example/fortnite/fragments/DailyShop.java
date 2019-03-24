package com.example.fortnite.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.fortnite.MainActivity;
import com.example.fortnite.R;
import com.example.fortnite.model.ShopModel;
import com.example.fortnite.repository.ShopRepository;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.disposables.Disposable;

import static com.example.fortnite.MainActivity.BackgroundScreens;
import static com.example.fortnite.MainActivity.SCREEN_WIDTH_PX;
import static com.example.fortnite.MainActivity.density;
import static com.example.fortnite.MainActivity.sharedPreferences;
import static com.example.fortnite.fragments.DailyShop.adapter;
import static io.reactivex.android.schedulers.AndroidSchedulers.mainThread;


public class DailyShop extends Fragment {

    static ImageView bg;
    static RecyclerView recyclerView;
    public static ShopAdapter adapter;
    Disposable mDisposable;
    viewModel mViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.daily_shop_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mViewModel = ViewModelProviders.of(this).get(viewModel.class);

        adapter = new ShopAdapter(getActivity());
        bg = view.findViewById(R.id.bg);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }


    @Override
    public void onResume() {
        super.onResume();
        //Presenter.getInstance().setBackground();
        mViewModel.getTransactions(null).observe(getActivity(), items -> {
            // когда получили транзакции - обновляем список
            adapter.swap(items);
        });
    }


    @Override
    public void onPause() {
        super.onPause();
        if (mDisposable != null) {
            mDisposable.dispose();
            mDisposable = null;
        }
    }

    public static void setBackground(int i) {
        //bg.setImageResource(i);
    }
}



class Presenter {

    public static Presenter instance;

    public static Presenter getInstance() {
        if (instance == null) {
            instance = new Presenter();
        }
        return instance;
    }

    public void setBackground() {
        int id = sharedPreferences.getInt("image", 0);
        int image = BackgroundScreens[id];
        DailyShop.setBackground(image);
    }
}

    class viewModel extends ViewModel{
        private MutableLiveData<List<ShopModel.Item>> items = new MutableLiveData<>();
        private String query;
        private Disposable mDisposable;

        public LiveData<List<ShopModel.Item>> getTransactions(String query) {
            this.query = query; // сохраняем поисковый запрос (чтобы потом отфильтровать)
            subscribeTransactions(query); // подписываем на транзакции (если ещё не)
            return items;
        }

        private void subscribeTransactions(String query) {
            if (mDisposable != null) { // если уже подписались
                mDisposable.dispose(); // отписываемся
            }
            // переподписываемся на все транзакции
            mDisposable = ShopRepository.getInstance().getTransactions()
                    .subscribe(transactions -> {
                        // когда они приходят, фильтруем
                        final List<ShopModel.Item> filteredTransactions = new ArrayList<>();
                        for (ShopModel.Item transaction : transactions) {
                            if (transaction.getName().contains(query)) {
                                filteredTransactions.add(transaction);
                            }
                        }
                        // и кладём в контейнер
                        this.items.setValue(filteredTransactions);
                    });
        }
    }



class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder> {
    public List<ShopModel.Item> mItems = new ArrayList<>();
    Activity activity;


    public ShopAdapter(Activity activity) {
        this.activity = activity;
    }

    public void swap(List<ShopModel.Item> items) {
        mItems = items;
        adapter.notifyDataSetChanged();
    }

    public void setInfo(int pos, ViewHolder holder) {
        ShopModel.Item item = mItems.get(pos);
        ShopModel.Item.Item_ item_ = item.getItem();
        ShopModel.Item.Item_.Images images = item_.getImages();
        String bg = images.getTransparent();

        Glide.with(activity).load(bg).into(holder.mIcon);
        holder.mName.setText(item.getName());
        holder.mPrice.setText(String.valueOf(item.getCost()));
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(activity);
        View v = inflater.inflate(R.layout.shop_recycler_view_item, parent, false );
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams((int) (SCREEN_WIDTH_PX - 8 * MainActivity.density) / 2, (int) (SCREEN_WIDTH_PX - 8 * MainActivity.density) / 2);
        holder.mIcon.setLayoutParams(params1);
        holder.mName.setSelected(true);

        if (mItems.size() != 0) {
            setInfo(position, holder);
        }


        LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);


        if(position == mItems.size() - 1 | position == mItems.size() - 2) {
            if(position % 2 == 0) {
                params2.setMargins(0,0,8,0);
            } else params2.setMargins(0,0,0,0);
        } else {
            if(position % 2 == 0) {
                params2.setMargins(0,0,8,8);
            } else params2.setMargins(0,0,0,8);
        }
        holder.itemView.setLayoutParams(params2);



    }


    @Override
    public int getItemCount() {
        return mItems.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        View itemView;

        ImageView mIcon;
        TextView mName;
        TextView mPrice;


        public ViewHolder(View view) {
            super(view);
            this.itemView = view;

            mIcon = view.findViewById(R.id.icon);
            mName = view.findViewById(R.id.name);
            mPrice = view.findViewById(R.id.price);
        }
    }
}





