package com.example.fortnite.fragments;


import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.fortnite.MainActivity;
import com.example.fortnite.R;
import com.example.fortnite.model.ShopItem;
import com.example.fortnite.service.Service;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.fortnite.MainActivity.BackgroundScreens;
import static com.example.fortnite.MainActivity.SCREEN_WIDTH_PX;
import static com.example.fortnite.MainActivity.sharedPreferences;
import static com.example.fortnite.fragments.DailyShop.adapter;
import static com.example.fortnite.fragments.DailyShop.gridview;
import static com.example.fortnite.fragments.Presenter.requestShop;
import static com.example.fortnite.fragments.Presenter.updateShop;


public class DailyShop extends Fragment {

    static ImageView bg;
    static GridView gridview;
    public static ShopAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.daily_shop_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        requestShop("en");
        updateShop(getContext());

        adapter = new ShopAdapter(getActivity());
        bg = view.findViewById(R.id.bg);
        gridview = view.findViewById(R.id.gridView);

        gridview.setNumColumns(2);
    }

    @Override
    public void onResume() {
        super.onResume();
        Presenter.getInstance().setBackground();
        requestShop("en");
    }

    public static void setBackground(int i) {
        bg.setImageResource(i);
    }
}


class Presenter{

    public static Presenter instance;

    public static Presenter getInstance() {
        if (instance == null) { instance = new Presenter(); }
        return instance;
    }

    public void setBackground() {
        int id = sharedPreferences.getInt("image", 0);
        int image = BackgroundScreens[id];
        DailyShop.setBackground(image);
    }


    public static void requestShop(String language) {
        Service.getInstance().getShop(language).enqueue(new Callback<ShopItem>() {
            @Override
            public void onResponse(Call<ShopItem> call, Response<ShopItem> response) {
                int rows = response.body().getRows();
                List<ShopItem.Item> itemList = response.body().getItems();

                if(rows == itemList.size()) {
                    adapter.swap(itemList);
                    gridview.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ShopItem> call, Throwable t) { }
        });
    }


    /*
        Надо переделать, т.к можно создать несколько потоков, которые будут одновременно обновлять информацию,
        ну и сделать так, чтобы обновлялось ровно в 3:00, а 3:00, 3:01... 3:59
     */


    public static void updateShop(final Context context) {
        final Calendar calendar = Calendar.getInstance();
        int delay = 60 - calendar.get(Calendar.SECOND);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                final Handler handler = new Handler();
                final Runnable Update = new Runnable() {
                    public void run() {
                        if(calendar.get(Calendar.HOUR_OF_DAY) == 3) {
                            requestShop("en");
                        }
                    }
                };
                Timer swipeTimer = new Timer();
                swipeTimer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        handler.post(Update);
                    }
                }, 5 * 60 * 1000, 5 * 60 * 1000);
            }
        }, delay * 1000);
    }
}



class ShopAdapter extends BaseAdapter {
    public List<ShopItem.Item> mItems = new ArrayList<>();
    private static Context context;
    private static ImageView mIcon;
    private static TextView mName;
    private static TextView mPrice;

    public ShopAdapter(Context c) {
        this.context = c;
    }


    public int getCount() {
        return mItems.size();
    }

    public Object getItem(int position) {
        return mItems.get(position);
    }

    public long getItemId(int position) {
        return position;
    }



    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            view = new View(context);
            LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            view = inflater.inflate(R.layout.shop_grid_view_item, parent, false);
        } else {
            view = convertView;
        }


        mIcon = view.findViewById(R.id.icon);
        mName = view.findViewById(R.id.name);
        mPrice = view.findViewById(R.id.price);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams((int)(SCREEN_WIDTH_PX - 8 * MainActivity.density) / 2, (int)(SCREEN_WIDTH_PX - 8 * MainActivity.density) / 2);
        mIcon.setLayoutParams(params);
        mName.setSelected(true);

        if(mItems.size() != 0) { setInfo(position);}
        return view;
    }

    public void swap(List<ShopItem.Item> items) {
        mItems = items;
        adapter.notifyDataSetChanged();
    }

    public void setInfo(int pos) {
        ShopItem.Item item = mItems.get(pos);
        ShopItem.Item.Item_ item_ = item.getItem();
        ShopItem.Item.Item_.Images images = item_.getImages();
        String bg = images.getBackground();

        Glide.with(context).load(bg).into(mIcon);
        mName.setText(item.getName());
        mPrice.setText(String.valueOf(item.getCost()));
    }
}
