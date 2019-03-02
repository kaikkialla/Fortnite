package com.example.fortnite.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fortnite.R;
import com.example.fortnite.repository.StatsRepository;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static io.reactivex.android.schedulers.AndroidSchedulers.mainThread;

public class AccountInfoFragment extends Fragment {

    static TextView textView;
    public static String uid;
    public static String platform;


    public static AccountInfoFragment newInstanse(String uid, String platform) {
        AccountInfoFragment fragment = new AccountInfoFragment();
        AccountInfoFragment.uid = uid;
        AccountInfoFragment.platform = platform;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.account_info_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.tv);
    }

    public static void setStats(String i) {
        textView.setText(i);
    }

    @Override
    public void onResume() {
        super.onResume();
        Presenter.setText(uid, platform);
    }




    public static class Presenter {
        public static Presenter instance;

        public static Presenter getInstance() {
            if (instance == null) {
                instance = new Presenter();
            }
            return instance;
        }

        public static void setText(String uid, String platform) {
            StatsRepository.getInstance().getStats(uid, platform).observeOn(mainThread()).subscribe(stats -> {
                if(platform == "pc") {
                    int Solokills = stats.getData().getKeyboardmouse().getDefaultsolo().getDefault().getKills();
                    int Duokills = stats.getData().getKeyboardmouse().getDefaultduo().getDefault().getKills();
                    int Squadkills = stats.getData().getKeyboardmouse().getDefaultsquad().getDefault().getKills();
                    AccountInfoFragment.setStats(platform + " / " + Solokills + " / " + Duokills + " / " + Squadkills);
                } else if(platform == "ps4") {
                    int Solokills = stats.getData().getKeyboardmouse().getDefaultsolo().getDefault().getKills();
                    int Duokills = stats.getData().getKeyboardmouse().getDefaultduo().getDefault().getKills();
                    int Squadkills = stats.getData().getKeyboardmouse().getDefaultsquad().getDefault().getKills();
                    AccountInfoFragment.setStats(platform + " / " + Solokills + " / " + Duokills + " / " + Squadkills);
                }

            });
        }
    }

}



/*

Сделать разные статистики для пк и консолей, добавить их в StatsModel
 */