package com.example.fortnite.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fortnite.R;
import com.example.fortnite.model.StatsModel;
import com.example.fortnite.repository.StatsRepository;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static io.reactivex.android.schedulers.AndroidSchedulers.mainThread;

public class AccountInfoFragment extends Fragment {


    public static String uid;
    public static Presenter.DeviceType platform;

    static TextView mname;
    static TextView mid;

    static TextView msolo_matches;
    static TextView msolo_kills;
    static TextView msolo_wins;
    static TextView msolo_kd;

    static TextView mduo_matches;
    static TextView mduo_kills;
    static TextView mduo_wins;
    static TextView mduo_kd;

    static TextView msquads_matches;
    static TextView msquads_kills;
    static TextView msquads_wins;
    static TextView msquads_kd;


    public static AccountInfoFragment newInstanse(String uid, Presenter.DeviceType platform) {
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
        mname = view.findViewById(R.id.name);
        mid = view.findViewById(R.id.id);

        msolo_matches = view.findViewById(R.id.solo_matches);
        msolo_kills = view.findViewById(R.id.solo_kills);
        msolo_wins = view.findViewById(R.id.solo_wins);
        msolo_kd = view.findViewById(R.id.solo_kd);

        mduo_matches = view.findViewById(R.id.duo_matches);
        mduo_kills = view.findViewById(R.id.duo_kills);
        mduo_wins = view.findViewById(R.id.duo_wins);
        mduo_kd = view.findViewById(R.id.duo_kd);

        msquads_matches = view.findViewById(R.id.squads_matches);
        msquads_kills = view.findViewById(R.id.squads_kills);
        msquads_wins = view.findViewById(R.id.squads_wins);
        msquads_kd = view.findViewById(R.id.squads_kd);
    }


    public static void setStats(StatsModel statsModel, StatsModel.Device device) {
        int solokills = device.getDefaultsolo().getDefault().getKills();
        int duokills = device.getDefaultduo().getDefault().getKills();
        int squadkills = device.getDefaultsquad().getDefault().getKills();

        int solomatches = device.getDefaultsolo().getDefault().getMatchesplayed();
        int duomatches = device.getDefaultduo().getDefault().getMatchesplayed();
        int squadmatches = device.getDefaultsquad().getDefault().getMatchesplayed();

        int solowins = device.getDefaultsolo().getDefault().getPlacetop1();
        int duowins = device.getDefaultduo().getDefault().getPlacetop1();
        int squadwins = device.getDefaultsquad().getDefault().getPlacetop1();


        mname.setText(statsModel.getEpicName());
        mid.setText(statsModel.getAccountId());

        msolo_matches.setText(matchesFormatter(solomatches));
        msolo_kills.setText(String.valueOf(solokills));
        msolo_wins.setText(String.valueOf(solowins));
        //msolo_kd.setText(String.valueOf(solokd));

        mduo_matches.setText(matchesFormatter(duomatches));
        mduo_kills.setText(String.valueOf(duokills));
        mduo_wins.setText(String.valueOf(duowins));
        //mduo_kd.setText(String.valueOf(duo_kd));

        msquads_matches.setText(matchesFormatter(squadmatches));
        msquads_kills.setText(String.valueOf(squadkills));
        msquads_wins.setText(String.valueOf(squadwins));
        //msquads_kd.setText(String.valueOf(squadkd));
    }

    public static String matchesFormatter(int i) {
        String matches = String.valueOf(i);
        int last = Integer.parseInt(String.valueOf(matches.charAt(matches.length() - 1)));

        String formatted = "";
        if (last == 1) {
            formatted = i + " матч";
            Log.e("gmsgs", formatted);
        } else if (last >= 2 && last <= 4) {
            formatted = i + " матча";
            Log.e("gmsgs", formatted);
        } else if (last >= 5 && last <= 9 || last == 0) {
            formatted = i + " матчей";
            Log.e("gmsgs", formatted);
        }
        return formatted;
    }


    @Override
    public void onResume() {
        super.onResume();
        Presenter.loadStats(uid, platform);
    }


    public static class Presenter {
        public static Presenter instance;

        public static Presenter getInstance() {
            if (instance == null) {
                instance = new Presenter();
            }
            return instance;
        }


        public static enum DeviceType {
            GAMEPAD, KEYBOARD_MOUSE
        }

        @SuppressLint("CheckResult")
        public static void loadStats(String uid, DeviceType deviceType) {
            StatsRepository.getInstance().getStats(uid).observeOn(mainThread()).subscribe((StatsModel stats) -> {

                String name = stats.getEpicName();
                String id = stats.getAccountId();

                StatsModel statsModel = new StatsModel();
                StatsModel.Device device = null;

                if (deviceType == DeviceType.GAMEPAD) {
                    device = stats.getData().getGamepad();
                } else if (deviceType == DeviceType.KEYBOARD_MOUSE) {
                    device = stats.getData().getKeyboardmouse();
                }

                int solokills = device.getDefaultsolo().getDefault().getKills();
                int duokills = device.getDefaultduo().getDefault().getKills();
                int squadkills = device.getDefaultsquad().getDefault().getKills();

                int solomatches = device.getDefaultsolo().getDefault().getMatchesplayed();
                int duomatches = device.getDefaultduo().getDefault().getMatchesplayed();
                int squadmatches = device.getDefaultsquad().getDefault().getMatchesplayed();

                int solowins = device.getDefaultsolo().getDefault().getPlacetop1();
                int duowins = device.getDefaultduo().getDefault().getPlacetop1();
                int squadwins = device.getDefaultsquad().getDefault().getPlacetop1();

                //double solokd = (double) solokills / (soloMatches - soloWins);
                //int duokd = duokills / (duoMatches - duoWins);
                //int squadskd = squadkills / (squadMatches - squadsWins);


                stats.setAccountId(id);
                stats.setEpicName(name);
                device.getDefaultsolo().getDefault().setKills(solokills);
                device.getDefaultduo().getDefault().setKills(duokills);
                device.getDefaultsquad().getDefault().setKills(squadkills);

                device.getDefaultsolo().getDefault().setMatchesplayed(solomatches);
                device.getDefaultduo().getDefault().setMatchesplayed(duomatches);
                device.getDefaultsquad().getDefault().setMatchesplayed(squadmatches);

                device.getDefaultsolo().getDefault().setPlacetop1(solowins);
                device.getDefaultduo().getDefault().setPlacetop1(duowins);
                device.getDefaultsquad().getDefault().setPlacetop1(squadwins);


                AccountInfoFragment.setStats(statsModel, device);
            });
        }
    }
}

