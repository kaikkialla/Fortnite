package com.example.fortnite.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fortnite.R;
import com.example.fortnite.model.idModel;
import com.example.fortnite.repository.idRepository;
import com.example.fortnite.utils.SearchViewObservable;
import com.jakewharton.rxbinding3.appcompat.RxSearchView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

import static com.example.fortnite.MainActivity.BackgroundScreens;
import static com.example.fortnite.MainActivity.sharedPreferences;
import static io.reactivex.android.schedulers.AndroidSchedulers.mainThread;

public class AccountsFragment extends Fragment {

    static ImageView bg;
    SearchView searchView;
    RecyclerView recyclerView;

    Disposable mDisposable;
    public static Adapter adapter;


    public static final String name = "100pingfeqide";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.accounts_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recyclerView);
        bg = view.findViewById(R.id.bg);
        searchView = view.findViewById(R.id.searchView);

        adapter = new Adapter(getActivity());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    public static void setBackground(int resid) {
        //bg.setImageResource(resid);
    }


    @Override
    public void onResume() {
        super.onResume();
        Presenter.setBackground();




        mDisposable = SearchViewObservable.fromView(searchView)
                .debounce(1, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(result -> {
                    idRepository.getInstance().getUser(result).observeOn(mainThread()).subscribe(user -> {
                        List<idModel> accounts = new ArrayList<>();
                        if(user.getPlatforms().size() != 0) {
                            for (int i = 1; i <= user.getPlatforms().size(); i++) {
                                accounts.add(user);
                            }
                            adapter.swap(accounts);
                            recyclerView.setAdapter(adapter);
                        }

                    });
                });
    }

    @Override
    public void onPause() {
        super.onPause();
        mDisposable.dispose();
    }




    public static class Presenter {
        public static Presenter instance;

        public static Presenter getInstance() {
            if (instance == null) {
                instance = new Presenter();
            }
            return instance;
        }

        public static void setBackground() {
            int id = sharedPreferences.getInt("image", 0);
            int image = BackgroundScreens[id];
            AccountsFragment.setBackground(image);
        }
    }




    class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
        public List<idModel> mAccounts = new ArrayList<>();
        Activity activity;


        public Adapter(Activity activity) {
            this.activity = activity;
        }

        public void swap(List<idModel> items) {
            mAccounts = items;
            adapter.notifyDataSetChanged();
        }

        public void setInfo(int pos, ViewHolder holder) {
            idModel account = mAccounts.get(pos);
            String username = account.getUsername().toString();
            String platform = account.getPlatforms().get(pos).toString();


            holder.username.setText(username);
            holder.platform.setText(platform);

        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(activity);
            View v = inflater.inflate(R.layout.accounts_recycler_view_item, parent, false );
            ViewHolder vh = new ViewHolder(v);
            return vh;
        }


        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            if (mAccounts.size() != 0) {
                setInfo(position, holder);
            }


            holder.itemView.setOnClickListener(view -> {
                Log.e("fmspifips", mAccounts.get(position).getUsername());
                FragmentManager fragmentManager = getFragmentManager();
                Fragment fragment = (Fragment) AccountInfoFragment.newInstanse(getUid(position), getPlatform(position));
                fragmentManager.beginTransaction().addToBackStack("account").replace(R.id.frame_layout, fragment).commit();
            });

        }


        public String getPlatform(int pos) {
            return mAccounts.get(pos).getPlatforms().get(pos);
        }

        public String getUid(int pos) {
            return mAccounts.get(pos).getUid();
        }


        @Override
        public int getItemCount() {
            return mAccounts.size();
        }




        public class ViewHolder extends RecyclerView.ViewHolder {
            View itemView;

            TextView username;
            TextView platform;


            public ViewHolder(View view) {
                super(view);
                this.itemView = view;

                this.username = view.findViewById(R.id.username);
                this.platform = view.findViewById(R.id.platform);
            }
        }
    }


}