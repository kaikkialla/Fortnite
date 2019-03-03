package com.example.fortnite.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fortnite.R;
import com.example.fortnite.repository.StatsRepository;

import java.text.DecimalFormat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static io.reactivex.android.schedulers.AndroidSchedulers.mainThread;

public class AccountInfoFragment extends Fragment {

    static TextView textView;
    static TextView testTextView;
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
        testTextView = view.findViewById(R.id.testTv);
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

        @SuppressLint("CheckResult")
        public static void setText(String uid, String platform) {

            StatsRepository.getInstance().getStats(uid, platform).observeOn(mainThread()).subscribe(stats -> {
                StringBuilder sb = new StringBuilder();
                DecimalFormat decimalFormat = new DecimalFormat("##");

                sb.append("platform -" + platform + "\n");
                double Solokills = stats.getData().getKeyboardmouse().getDefaultsolo().getDefault().getKills();
                double Duokills = stats.getData().getKeyboardmouse().getDefaultduo().getDefault().getKills();
                double Squadkills = stats.getData().getKeyboardmouse().getDefaultsquad().getDefault().getKills();
                double totalKills = Solokills + Duokills + Squadkills;


                double soloMatches = stats.getData().getKeyboardmouse().getDefaultsolo().getDefault().getMatchesplayed();
                double duoMatches = stats.getData().getKeyboardmouse().getDefaultduo().getDefault().getMatchesplayed();
                double squadMatches = stats.getData().getKeyboardmouse().getDefaultsquad().getDefault().getMatchesplayed();
                double totalMatches = soloMatches + duoMatches + squadMatches;
                sb.append("solo kills -" + Solokills + "\n");
                sb.append("duo kills -" + Duokills + "\n");
                sb.append("squad kills -" + Squadkills + "\n");
                sb.append("total kills -" + totalKills + "\n");

                sb.append("solo matches played -" + soloMatches + "\n");
                sb.append("duo matches played -" + duoMatches + "\n");
                sb.append("squad  matches played -" + squadMatches + "\n");
                sb.append("total matches played -" + totalMatches + "\n");


                sb.append("solo kd -" + Solokills / soloMatches + "\n");
                sb.append("duo kd -" + Duokills / duoMatches+ "\n");
                sb.append("squad  kd -" + Squadkills / squadMatches + "\n");
                sb.append("total kd -" + (totalKills / totalMatches )+ "\n");


                /*
                sb.append("solo kd -" + decimalFormat.format(Solokills / soloMatches) + "\n");
                sb.append("duo kd -" + decimalFormat.format(Duokills / duoMatches) + "\n");
                sb.append("squad  kd -" + decimalFormat.format(Squadkills / squadMatches)+ "\n");
                sb.append("total kd -" + decimalFormat.format(totalKills / totalMatches )+ "\n");
                 */
                AccountInfoFragment.setStats(sb.toString());
            });
        }
    }
}




/*

Сделать разные статистики для пк и консолей, добавить их в StatsModel


if(platform.equals("pc")) {

}if(platform.equals("ps4")) {

}if(platform.equals("xb1")) {

}
*/