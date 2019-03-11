package com.example.fortnite.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fortnite.R;
import com.example.fortnite.model.StatsModel;
import com.example.fortnite.repository.StatsRepository;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static io.reactivex.android.schedulers.AndroidSchedulers.mainThread;

public class AccountInfoFragment extends Fragment {


    public static String uid;
    public static String platform;

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

    public static void setStats(String name,String id,
                                int solo_matches, int solo_kills, int solo_wins, int solo_kd,
                                int duo_matches, int duo_kills, int duo_wins, int duo_kd,
                                int squads_matches, int squads_kills, int squads_wins, int squads_kd) {

        mname.setText(name);
        mid.setText(id);

        msolo_matches.setText(matchesFormatter(solo_matches));
        msolo_kills.setText(String.valueOf(solo_kills));
        msolo_wins.setText(String.valueOf(solo_wins));
        msolo_kd.setText(String.valueOf(solo_kd));

        mduo_matches.setText(matchesFormatter(duo_matches));
        mduo_kills.setText(String.valueOf(duo_kills));
        mduo_wins.setText(String.valueOf(duo_wins));
        mduo_kd.setText(String.valueOf(duo_kd));

        msquads_matches.setText(matchesFormatter(squads_matches));
        msquads_kills.setText(String.valueOf(squads_kills));
        msquads_wins.setText(String.valueOf(squads_wins));
        msquads_kd.setText(String.valueOf(squads_kd));

    }

    public static String matchesFormatter(int i) {
        String matches = String.valueOf(i);
        int last = Integer.parseInt(String.valueOf(matches.charAt(matches.length() - 1)));

        String formatted = "";
        if(last == 1) {
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
        Presenter.loadPcStats(uid);
    }


    public static class Presenter {
        public static Presenter instance;

        public static Presenter getInstance() {
            if (instance == null) {
                instance = new Presenter();
            }
            return instance;
        }


/*
        @SuppressLint("CheckResult")
        public static void loadPcStats(String uid) {
            StatsRepository.getInstance().getStats(uid).observeOn(mainThread()).subscribe((StatsModel stats) -> {
                DecimalFormat decimalFormat = new DecimalFormat("##");

                //String name = stats.getEpicName().toUpperCase();
                String name = stats.getEpicName();
                String id = stats.getAccountId();

                int solokills = stats.getData().getKeyboardmouse().getDefaultsolo().getDefault().getKills();
                int duokills = stats.getData().getKeyboardmouse().getDefaultduo().getDefault().getKills();
                int squadkills = stats.getData().getKeyboardmouse().getDefaultsquad().getDefault().getKills();

                int soloMatches = stats.getData().getKeyboardmouse().getDefaultsolo().getDefault().getMatchesplayed();
                int duoMatches = stats.getData().getKeyboardmouse().getDefaultduo().getDefault().getMatchesplayed();
                int squadMatches = stats.getData().getKeyboardmouse().getDefaultsquad().getDefault().getMatchesplayed();

                int soloWins = stats.getData().getKeyboardmouse().getDefaultsolo().getDefault().getPlacetop1();
                int duoWins = stats.getData().getKeyboardmouse().getDefaultduo().getDefault().getPlacetop1();
                int squadsWins = stats.getData().getKeyboardmouse().getDefaultsquad().getDefault().getPlacetop1();

                int solokd = solokills / (soloMatches - soloWins);
                int duokd = duokills / (duoMatches - duoWins);
                int squadskd = squadkills / (squadMatches - squadsWins);

                AccountInfoFragment.setStats(name, id, soloMatches, solokills, soloWins,0,
                        duoMatches, duokills, duoWins, 0,
                        squadMatches, squadkills, squadsWins, 0);
            });
        }
*/
/*
        @SuppressLint("CheckResult")
        public static void loadConsoleStats(String uid) {
            StatsRepository.getInstance().getStats(uid).observeOn(mainThread()).subscribe((StatsModel stats) -> {
                DecimalFormat decimalFormat = new DecimalFormat("##");

                //String name = stats.getEpicName().toUpperCase();
                String name = stats.getEpicName();
                String id = stats.getAccountId();

                int solokills = stats.getData().getGamepad().getDefaultsolo().getDefault().getKills();
                int duokills = stats.getData().getGamepad().getDefaultduo().getDefault().getKills();
                int squadkills = stats.getData().getGamepad().getDefaultsquad().getDefault().getKills();

                int soloMatches = stats.getData().getGamepad().getDefaultsolo().getDefault().getMatchesplayed();
                int duoMatches = stats.getData().getGamepad().getDefaultduo().getDefault().getMatchesplayed();
                int squadMatches = stats.getData().getGamepad().getDefaultsquad().getDefault().getMatchesplayed();

                int soloWins = stats.getData().getGamepad().getDefaultsolo().getDefault().getPlacetop1();
                int duoWins = stats.getData().getGamepad().getDefaultduo().getDefault().getPlacetop1();
                int squadsWins = stats.getData().getGamepad().getDefaultsquad().getDefault().getPlacetop1();

                int solokd = solokills / (soloMatches - soloWins);
                int duokd = duokills / (duoMatches - duoWins);
                int squadskd = squadkills / (squadMatches - squadsWins);

                AccountInfoFragment.setStats(name, id, soloMatches, solokills, soloWins, 0,
                        duoMatches, duokills, duoWins, 0,
                        squadMatches, squadkills, squadsWins, 0);
            });
        }

    */

        enum DeviceType {
            GAMEPAD, KEYBOARD_MOUSE
        }

        @SuppressLint("CheckResult")
        public static void loadStats(String uid, DeviceType deviceType) {
            StatsRepository.getInstance().getStats(uid).observeOn(mainThread()).subscribe((StatsModel stats) -> {
                DecimalFormat decimalFormat = new DecimalFormat("##");

                String name = stats.getEpicName();
                String id = stats.getAccountId();

                StatsModel.Device device = null;
                if (deviceType == DeviceType.GAMEPAD) {
                    device = stats.getData().getGamepad();
                } else if (deviceType == DeviceType.KEYBOARD_MOUSE) {
                    device = stats.getData().getKeyboardmouse();
                }

                    int solokills = device.getDefaultsolo().getDefault().getKills();
                    int duokills = device.getDefaultduo().getDefault().getKills();
                    int squadkills = device.getDefaultsquad().getDefault().getKills();

                    int soloMatches = device.getDefaultsolo().getDefault().getMatchesplayed();
                    int duoMatches = device.getDefaultduo().getDefault().getMatchesplayed();
                    int squadMatches = device.getDefaultsquad().getDefault().getMatchesplayed();

                    int soloWins = device.getDefaultsolo().getDefault().getPlacetop1();
                    int duoWins = device.getDefaultduo().getDefault().getPlacetop1();
                    int squadsWins = device.getDefaultsquad().getDefault().getPlacetop1();

                    double solokd = (double) solokills / (soloMatches - soloWins);
                    int duokd = duokills / (duoMatches - duoWins);
                    int squadskd = squadkills / (squadMatches - squadsWins);

                    AccountInfoFragment.setStats(name, id, soloMatches, solokills, soloWins, 0,
                            duoMatches, duokills, duoWins, 0,
                            squadMatches, squadkills, squadsWins, 0);
                }
            });
        }
   }

}