package com.example.fortnite.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fortnite.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.fortnite.MainActivity.BackgroundScreens;
import static com.example.fortnite.MainActivity.sharedPreferences;

public class StatsFragment extends Fragment {

    ImageView bg;
    TextView textView;
    EditText editText;
    Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.stats_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bg = view.findViewById(R.id.bg);
        editText = view.findViewById(R.id.editText);
        textView = view.findViewById(R.id.textView);
        btn = view.findViewById(R.id.btn);

        bg.setImageResource(BackgroundScreens[sharedPreferences.getInt("image", 0)]);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = editText.getText().toString();
            }
        });


    }
}