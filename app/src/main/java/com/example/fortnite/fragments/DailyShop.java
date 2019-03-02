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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.disposables.Disposable;

import static com.example.fortnite.MainActivity.BackgroundScreens;
import static com.example.fortnite.MainActivity.SCREEN_WIDTH_PX;
import static com.example.fortnite.MainActivity.sharedPreferences;
import static com.example.fortnite.fragments.DailyShop.adapter;
import static io.reactivex.android.schedulers.AndroidSchedulers.mainThread;


public class DailyShop extends Fragment {

    static ImageView bg;
    static RecyclerView recyclerView;
    public static ShopAdapter adapter;
    Disposable mDisposable;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.daily_shop_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new ShopAdapter(getActivity());
        bg = view.findViewById(R.id.bg);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }


    @Override
    public void onResume() {
        super.onResume();
        Presenter.getInstance().setBackground();
        mDisposable = ShopRepository.getInstance().getTransactions().observeOn(mainThread()).subscribe(transactions -> {
            adapter.swap(transactions);
        });
    }


    @Override
    public void onPause() {
        super.onPause();
        mDisposable.dispose();
    }

    public static void setBackground(int i) {
        bg.setImageResource(i);
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
        String bg = images.getBackground();

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
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams((int) (SCREEN_WIDTH_PX - 8 * MainActivity.density) / 2, (int) (SCREEN_WIDTH_PX - 8 * MainActivity.density) / 2);
        holder.mIcon.setLayoutParams(params);
        holder.mName.setSelected(true);

        if (mItems.size() != 0) {
            setInfo(position, holder);
        }
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





