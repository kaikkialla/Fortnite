package com.example.fortnite.fragments;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fortnite.R;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import static com.example.fortnite.MainActivity.BackgroundScreens;
import static com.example.fortnite.MainActivity.sharedPreferences;


public class Menu extends Fragment {


    FragmentActivity activity;
    ImageView bg;
    GridView gridview;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.menu_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        activity = getActivity();

        bg = view.findViewById(R.id.bg);
        gridview = view.findViewById(R.id.gridView);

        bg.setImageResource(BackgroundScreens[sharedPreferences.getInt("image", 0)]);

        gridview.setNumColumns(3);
        gridview.setAdapter(new MenuAdapter(activity));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                switch (i) {
                    case 0:
                        activity.getSupportFragmentManager().beginTransaction().addToBackStack("Tag").replace(R.id.frame_layout, new DailyShop()).commit();
                        break;
                    case 1:
                        activity.getSupportFragmentManager().beginTransaction().addToBackStack("Tag").replace(R.id.frame_layout, new AccountsFragment()).commit();
                        break;
                    case 2:

                        break;
                    default:
                        Snackbar.make(gridview, "Oops, something went wrong", Snackbar.LENGTH_SHORT).show();
                }
            }
        });

    }
}


class MenuAdapter extends BaseAdapter {
    private Context mContext;

    public MenuAdapter(Context c) {
        mContext = c;
    }

    public	Integer[] icons = { R.drawable.shop, R.drawable.stats, R.drawable.settings};
    public	String[] names = { "Daily Shop", "Player Statistics", "Server Status"};


    public int getCount() {
        return names.length;
    }

    public Object getItem(int position) {
        return names[position];
    }

    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ImageView icon;
        TextView name;

        if (convertView == null) {
            view = new View(mContext);
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            view = inflater.inflate(R.layout.menu_grid_view_item, parent, false);
        } else {
            view = convertView;
        }

        icon = view.findViewById(R.id.icon);
        name = view.findViewById(R.id.name);

        icon.setImageResource(icons[position]);
        name.setText(names[position]);
        return view;
    }
}
