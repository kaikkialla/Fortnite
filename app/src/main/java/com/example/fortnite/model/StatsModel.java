package com.example.fortnite.model;




import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class StatsModel {



    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("fnApiId")
    @Expose
    private Integer fnApiId;
    @SerializedName("epicName")
    @Expose
    private String epicName;
    @SerializedName("seasonWindow")
    @Expose
    private String seasonWindow;
    @SerializedName("devices")
    @Expose
    private List<String> devices = null;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("overallData")
    @Expose
    private OverallData overallData;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Integer getFnApiId() {
        return fnApiId;
    }

    public void setFnApiId(Integer fnApiId) {
        this.fnApiId = fnApiId;
    }

    public String getEpicName() {
        return epicName;
    }

    public void setEpicName(String epicName) {
        this.epicName = epicName;
    }

    public String getSeasonWindow() {
        return seasonWindow;
    }

    public void setSeasonWindow(String seasonWindow) {
        this.seasonWindow = seasonWindow;
    }

    public List<String> getDevices() {
        return devices;
    }

    public void setDevices(List<String> devices) {
        this.devices = devices;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public OverallData getOverallData() {
        return overallData;
    }

    public void setOverallData(OverallData overallData) {
        this.overallData = overallData;
    }






    public class Barrier {

        @SerializedName("12")
        @Expose
        private _12_ _12;

        public _12_ get12() {
            return _12;
        }

        public void set12(_12_ _12) {
            this._12 = _12;
        }

    }






    public class Bling {

        @SerializedName("duo")
        @Expose
        private Duo_________ duo;
        @SerializedName("squad")
        @Expose
        private Squad____________ squad;

        public Duo_________ getDuo() {
            return duo;
        }

        public void setDuo(Duo_________ duo) {
            this.duo = duo;
        }

        public Squad____________ getSquad() {
            return squad;
        }

        public void setSquad(Squad____________ squad) {
            this.squad = squad;
        }

    }







    public class Blitz {

        @SerializedName("solo")
        @Expose
        private Solo___________ solo;
        @SerializedName("squad")
        @Expose
        private Squad___________ squad;
        @SerializedName("duo")
        @Expose
        private Duo_______ duo;

        public Solo___________ getSolo() {
            return solo;
        }

        public void setSolo(Solo___________ solo) {
            this.solo = solo;
        }

        public Squad___________ getSquad() {
            return squad;
        }

        public void setSquad(Squad___________ squad) {
            this.squad = squad;
        }

        public Duo_______ getDuo() {
            return duo;
        }

        public void setDuo(Duo_______ duo) {
            this.duo = duo;
        }

    }






    public class Classic {

        @SerializedName("squad")
        @Expose
        private Squad_____ squad;
        @SerializedName("duo")
        @Expose
        private Duo___ duo;

        public Squad_____ getSquad() {
            return squad;
        }

        public void setSquad(Squad_____ squad) {
            this.squad = squad;
        }

        public Duo___ getDuo() {
            return duo;
        }

        public void setDuo(Duo___ duo) {
            this.duo = duo;
        }

    }







    public class Close {

        @SerializedName("duo")
        @Expose
        private Duo_ duo;
        @SerializedName("squad")
        @Expose
        private Squad__ squad;
        @SerializedName("solo")
        @Expose
        private Solo_ solo;

        public Duo_ getDuo() {
            return duo;
        }

        public void setDuo(Duo_ duo) {
            this.duo = duo;
        }

        public Squad__ getSquad() {
            return squad;
        }

        public void setSquad(Squad__ squad) {
            this.squad = squad;
        }

        public Solo_ getSolo() {
            return solo;
        }

        public void setSolo(Solo_ solo) {
            this.solo = solo;
        }

    }







    public class Close_ {

        @SerializedName("duo")
        @Expose
        private Duo_____________ duo;

        public Duo_____________ getDuo() {
            return duo;
        }

        public void setDuo(Duo_____________ duo) {
            this.duo = duo;
        }

    }







    public class Comp {

        @SerializedName("solo")
        @Expose
        private Solo________ solo;

        public Solo________ getSolo() {
            return solo;
        }

        public void setSolo(Solo________ solo) {
            this.solo = solo;
        }

    }







    public class Creative {

        @SerializedName("playonly")
        @Expose
        private Playonly playonly;

        public Playonly getPlayonly() {
            return playonly;
        }

        public void setPlayonly(Playonly playonly) {
            this.playonly = playonly;
        }

    }







    public class Data {

        @SerializedName("keyboardmouse")
        @Expose
        private Device keyboardmouse;
        @SerializedName("gamepad")
        @Expose
        private Device gamepad;

        public Device getKeyboardmouse() {
            return keyboardmouse;
        }

        public void setKeyboardmouse(Device keyboardmouse) {
            this.keyboardmouse = keyboardmouse;
        }

        public Device getGamepad() {
            return gamepad;
        }

        public void setGamepad(Device gamepad) {
            this.gamepad = gamepad;
        }

    }







    public class Default {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
        }

        public Integer getPlacetop5() {
            return placetop5;
        }

        public void setPlacetop5(Integer placetop5) {
            this.placetop5 = placetop5;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }








    public class DefaultModes {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("includedPlaylists")
        @Expose
        private List<String> includedPlaylists = null;

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public List<String> getIncludedPlaylists() {
            return includedPlaylists;
        }

        public void setIncludedPlaylists(List<String> includedPlaylists) {
            this.includedPlaylists = includedPlaylists;
        }

    }







    public class Default_ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }






    public class Default__ {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }






    public class Default___ {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

    }







    public class Default____ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

    }







    public class Default_____ {

        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }







    public class Default______ {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

    }







    public class Default_______ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }







    public class Default________ {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }







    public class Default_________ {

        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getPlacetop3() {
            return placetop3;
        }

        public void setPlacetop3(Integer placetop3) {
            this.placetop3 = placetop3;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop6() {
            return placetop6;
        }

        public void setPlacetop6(Integer placetop6) {
            this.placetop6 = placetop6;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

    }







    public class Default__________ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }






    public class Default___________ {

        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;

        public Integer getPlacetop3() {
            return placetop3;
        }

        public void setPlacetop3(Integer placetop3) {
            this.placetop3 = placetop3;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getPlacetop6() {
            return placetop6;
        }

        public void setPlacetop6(Integer placetop6) {
            this.placetop6 = placetop6;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

    }






    public class Default____________ {

        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }







    public class Default_____________ {

        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

    }







    public class Default______________ {

        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

    }







    public class Defaultduo {

        @SerializedName("default")
        @Expose
        private Default _default;

        public Default getDefault() {
            return _default;
        }

        public void setDefault(Default _default) {
            this._default = _default;
        }

    }






    public class Defaultduo_ {

        @SerializedName("default")
        @Expose
        private Default__________ _default;

        public Default__________ getDefault() {
            return _default;
        }

        public void setDefault(Default__________ _default) {
            this._default = _default;
        }

    }







    public class Defaultsolo {

        @SerializedName("default")
        @Expose
        private Default______ _default;

        public Default______ getDefault() {
            return _default;
        }

        public void setDefault(Default______ _default) {
            this._default = _default;
        }

    }







    public class Defaultsolo_ {

        @SerializedName("default")
        @Expose
        private Default_____________ _default;

        public Default_____________ getDefault() {
            return _default;
        }

        public void setDefault(Default_____________ _default) {
            this._default = _default;
        }

    }







    public class Defaultsquad {

        @SerializedName("default")
        @Expose
        private Default_________ _default;

        public Default_________ getDefault() {
            return _default;
        }

        public void setDefault(Default_________ _default) {
            this._default = _default;
        }

    }







    public class Defaultsquad_ {

        @SerializedName("default")
        @Expose
        private Default___________ _default;

        public Default___________ getDefault() {
            return _default;
        }

        public void setDefault(Default___________ _default) {
            this._default = _default;
        }

    }







    public class Deimos {

        @SerializedName("duo")
        @Expose
        private Duo duo;
        @SerializedName("solo")
        @Expose
        private Solo solo;
        @SerializedName("squad")
        @Expose
        private Squad_ squad;
        @SerializedName("50")
        @Expose
        private _50 _50;

        public Duo getDuo() {
            return duo;
        }

        public void setDuo(Duo duo) {
            this.duo = duo;
        }

        public Solo getSolo() {
            return solo;
        }

        public void setSolo(Solo solo) {
            this.solo = solo;
        }

        public Squad_ getSquad() {
            return squad;
        }

        public void setSquad(Squad_ squad) {
            this.squad = squad;
        }

        public _50 get50() {
            return _50;
        }

        public void set50(_50 _50) {
            this._50 = _50;
        }

    }







    public class Deimos_ {

        @SerializedName("duo")
        @Expose
        private Duo____________ duo;
        @SerializedName("solo")
        @Expose
        private Solo______________ solo;

        public Duo____________ getDuo() {
            return duo;
        }

        public void setDuo(Duo____________ duo) {
            this.duo = duo;
        }

        public Solo______________ getSolo() {
            return solo;
        }

        public void setSolo(Solo______________ solo) {
            this.solo = solo;
        }

    }







    public class Disco {

        @SerializedName("32")
        @Expose
        private _32 _32;

        public _32 get32() {
            return _32;
        }

        public void set32(_32 _32) {
            this._32 = _32;
        }

    }







    public class Disco_ {

        @SerializedName("32")
        @Expose
        private _32_ _32;

        public _32_ get32() {
            return _32;
        }

        public void set32(_32_ _32) {
            this._32 = _32;
        }

    }







    public class Duo {

        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlacetop5() {
            return placetop5;
        }

        public void setPlacetop5(Integer placetop5) {
            this.placetop5 = placetop5;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }







    public class Duo_ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getPlacetop5() {
            return placetop5;
        }

        public void setPlacetop5(Integer placetop5) {
            this.placetop5 = placetop5;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }







    public class Duo__ {

        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("score")
        @Expose
        private Integer score;

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlacetop5() {
            return placetop5;
        }

        public void setPlacetop5(Integer placetop5) {
            this.placetop5 = placetop5;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

    }







    public class Duo___ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }






    public class Duo____ {

        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

    }







    public class Duo_____ {

        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
        }

        public Integer getPlacetop5() {
            return placetop5;
        }

        public void setPlacetop5(Integer placetop5) {
            this.placetop5 = placetop5;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }







    public class Duo______ {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }







    public class Duo_______ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }







    public class Duo________ {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop5() {
            return placetop5;
        }

        public void setPlacetop5(Integer placetop5) {
            this.placetop5 = placetop5;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
        }

    }







    public class Duo_________ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
        }

    }







    public class Duo__________ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
        }

        public Integer getPlacetop5() {
            return placetop5;
        }

        public void setPlacetop5(Integer placetop5) {
            this.placetop5 = placetop5;
        }

    }







    public class Duo___________ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }







    public class Duo____________ {

        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("score")
        @Expose
        private Integer score;

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

    }







    public class Duo_____________ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }















    public class Final {

        @SerializedName("20")
        @Expose
        private _20 _20;
        @SerializedName("12")
        @Expose
        private _12 _12;

        public _20 get20() {
            return _20;
        }

        public void set20(_20 _20) {
            this._20 = _20;
        }

        public _12 get12() {
            return _12;
        }

        public void set12(_12 _12) {
            this._12 = _12;
        }

    }

    public class Flyexplosives {

        @SerializedName("squad")
        @Expose
        private Squad____ squad;

        public Squad____ getSquad() {
            return squad;
        }

        public void setSquad(Squad____ squad) {
            this.squad = squad;
        }

    }

    public class Vamp {

        @SerializedName("squad")
        @Expose
        private Squad__________ squad;

        public Squad__________ getSquad() {
            return squad;
        }

        public void setSquad(Squad__________ squad) {
            this.squad = squad;
        }

    }

    public class _33 {

        @SerializedName("default")
        @Expose
        private Default_________ _default;

        public Default_________ getDefault() {
            return _default;
        }

        public void setDefault(Default_________ _default) {
            this._default = _default;
        }

    }

    public class High {

        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }

    public class Music {

        @SerializedName("high")
        @Expose
        private High high;

        public High getHigh() {
            return high;
        }

        public void setHigh(High high) {
            this.high = high;
        }

    }

    public class _50v50he {

        @SerializedName("default")
        @Expose
        private Default______ _default;

        public Default______ getDefault() {
            return _default;
        }

        public void setDefault(Default______ _default) {
            this._default = _default;
        }

    }

/*
    public class Gamepad {
        @SerializedName("vamp")
        @Expose
        private Vamp vamp;
        @SerializedName("highexplosives")
        @Expose
        private Highexplosives highexplosives;
        @SerializedName("hover")
        @Expose
        private Hover hover;
        @SerializedName("deimos")
        @Expose
        private Deimos deimos;
        @SerializedName("defaultduo")
        @Expose
        private Defaultduo defaultduo;
        @SerializedName("hard")
        @Expose
        private Hard hard;
        @SerializedName("50v50")
        @Expose
        private _50v50 _50v50;
        @SerializedName("defaultsquad")
        @Expose
        private Defaultsquad defaultsquad;
        @SerializedName("blitz")
        @Expose
        private Blitz blitz;
        @SerializedName("flyexplosives")
        @Expose
        private Flyexplosives flyexplosives;
        @SerializedName("classic")
        @Expose
        private Classic classic;
        @SerializedName("snipers")
        @Expose
        private Snipers snipers;
        @SerializedName("disco")
        @Expose
        private Disco disco;
        @SerializedName("low")
        @Expose
        private Low low;
        @SerializedName("defaultsolo")
        @Expose
        private Defaultsolo defaultsolo;
        @SerializedName("solidgold")
        @Expose
        private Solidgold solidgold;
        @SerializedName("ground")
        @Expose
        private Ground ground;
        @SerializedName("trios")
        @Expose
        private Trios trios;
        @SerializedName("respawn")
        @Expose
        private Respawn respawn;
        @SerializedName("50v50he")
        @Expose
        private _50v50he _50v50he;
        @SerializedName("music")
        @Expose
        private Music music;
        @SerializedName("ww")
        @Expose
        private Ww ww;
        @SerializedName("slide")
        @Expose
        private Slide slide;
        @SerializedName("sword")
        @Expose
        private Sword sword;
        @SerializedName("bling")
        @Expose
        private Bling bling;
        @SerializedName("toss")
        @Expose
        private Toss toss;
        @SerializedName("barrier")
        @Expose
        private Barrier barrier;
        @SerializedName("playgroundv2")
        @Expose
        private Playgroundv2 playgroundv2;
        @SerializedName("steady")
        @Expose
        private Steady steady;
        @SerializedName("close")
        @Expose
        private Close close;
        @SerializedName("unvaulted")
        @Expose
        private Unvaulted unvaulted;
        @SerializedName("playground")
        @Expose
        private Playground playground;
        @SerializedName("33")
        @Expose
        private _33 _33;
        @SerializedName("soaring")
        @Expose
        private Soaring soaring;

        public Highexplosives getHighexplosives() {
            return highexplosives;
        }

        public void setHighexplosives(Highexplosives highexplosives) {
            this.highexplosives = highexplosives;
        }

        public Hover getHover() {
            return hover;
        }

        public void setHover(Hover hover) {
            this.hover = hover;
        }

        public Deimos getDeimos() {
            return deimos;
        }

        public void setDeimos(Deimos deimos) {
            this.deimos = deimos;
        }

        public Defaultduo getDefaultduo() {
            return defaultduo;
        }

        public void setDefaultduo(Defaultduo defaultduo) {
            this.defaultduo = defaultduo;
        }

        public Hard getHard() {
            return hard;
        }

        public void setHard(Hard hard) {
            this.hard = hard;
        }

        public _50v50 get50v50() {
            return _50v50;
        }

        public void set50v50(_50v50 _50v50) {
            this._50v50 = _50v50;
        }

        public Defaultsquad getDefaultsquad() {
            return defaultsquad;
        }

        public void setDefaultsquad(Defaultsquad defaultsquad) {
            this.defaultsquad = defaultsquad;
        }

        public Blitz getBlitz() {
            return blitz;
        }

        public void setBlitz(Blitz blitz) {
            this.blitz = blitz;
        }

        public Flyexplosives getFlyexplosives() {
            return flyexplosives;
        }

        public void setFlyexplosives(Flyexplosives flyexplosives) {
            this.flyexplosives = flyexplosives;
        }

        public Classic getClassic() {
            return classic;
        }

        public void setClassic(Classic classic) {
            this.classic = classic;
        }

        public Snipers getSnipers() {
            return snipers;
        }

        public void setSnipers(Snipers snipers) {
            this.snipers = snipers;
        }

        public Disco getDisco() {
            return disco;
        }

        public void setDisco(Disco disco) {
            this.disco = disco;
        }

        public Low getLow() {
            return low;
        }

        public void setLow(Low low) {
            this.low = low;
        }

        public Defaultsolo getDefaultsolo() {
            return defaultsolo;
        }

        public void setDefaultsolo(Defaultsolo defaultsolo) {
            this.defaultsolo = defaultsolo;
        }

        public Solidgold getSolidgold() {
            return solidgold;
        }

        public void setSolidgold(Solidgold solidgold) {
            this.solidgold = solidgold;
        }

        public Ground getGround() {
            return ground;
        }

        public void setGround(Ground ground) {
            this.ground = ground;
        }

        public Trios getTrios() {
            return trios;
        }

        public void setTrios(Trios trios) {
            this.trios = trios;
        }

        public Respawn getRespawn() {
            return respawn;
        }

        public void setRespawn(Respawn respawn) {
            this.respawn = respawn;
        }

        public Vamp getVamp() {
            return vamp;
        }

        public void setVamp(Vamp vamp) {
            this.vamp = vamp;
        }

        public _50v50he get50v50he() {
            return _50v50he;
        }

        public void set50v50he(_50v50he _50v50he) {
            this._50v50he = _50v50he;
        }

        public Music getMusic() {
            return music;
        }

        public void setMusic(Music music) {
            this.music = music;
        }

        public Ww getWw() {
            return ww;
        }

        public void setWw(Ww ww) {
            this.ww = ww;
        }

        public Slide getSlide() {
            return slide;
        }

        public void setSlide(Slide slide) {
            this.slide = slide;
        }

        public Sword getSword() {
            return sword;
        }

        public void setSword(Sword sword) {
            this.sword = sword;
        }

        public Bling getBling() {
            return bling;
        }

        public void setBling(Bling bling) {
            this.bling = bling;
        }

        public Toss getToss() {
            return toss;
        }

        public void setToss(Toss toss) {
            this.toss = toss;
        }

        public Barrier getBarrier() {
            return barrier;
        }

        public void setBarrier(Barrier barrier) {
            this.barrier = barrier;
        }

        public Playgroundv2 getPlaygroundv2() {
            return playgroundv2;
        }

        public void setPlaygroundv2(Playgroundv2 playgroundv2) {
            this.playgroundv2 = playgroundv2;
        }

        public Steady getSteady() {
            return steady;
        }

        public void setSteady(Steady steady) {
            this.steady = steady;
        }

        public Close getClose() {
            return close;
        }

        public void setClose(Close close) {
            this.close = close;
        }

        public Unvaulted getUnvaulted() {
            return unvaulted;
        }

        public void setUnvaulted(Unvaulted unvaulted) {
            this.unvaulted = unvaulted;
        }

        public Playground getPlayground() {
            return playground;
        }

        public void setPlayground(Playground playground) {
            this.playground = playground;
        }

        public _33 get33() {
            return _33;
        }

        public void set33(_33 _33) {
            this._33 = _33;
        }

        public Soaring getSoaring() {
            return soaring;
        }

        public void setSoaring(Soaring soaring) {
            this.soaring = soaring;
        }

    }
*/





    public class Ground {

        @SerializedName("squad")
        @Expose
        private Squad__________ squad;

        public Squad__________ getSquad() {
            return squad;
        }

        public void setSquad(Squad__________ squad) {
            this.squad = squad;
        }

    }




    public class Hard {

        @SerializedName("squad")
        @Expose
        private Squad_____________ squad;

        public Squad_____________ getSquad() {
            return squad;
        }

        public void setSquad(Squad_____________ squad) {
            this.squad = squad;
        }

    }




    public class Highexplosives {

        @SerializedName("solo")
        @Expose
        private Solo_________ solo;
        @SerializedName("squad")
        @Expose
        private Squad________ squad;

        public Solo_________ getSolo() {
            return solo;
        }

        public void setSolo(Solo_________ solo) {
            this.solo = solo;
        }

        public Squad________ getSquad() {
            return squad;
        }

        public void setSquad(Squad________ squad) {
            this.squad = squad;
        }

    }




    public class Hover {

        @SerializedName("64")
        @Expose
        private _64 _64;

        public _64 get64() {
            return _64;
        }

        public void set64(_64 _64) {
            this._64 = _64;
        }

    }




    public class Device {

        @SerializedName("defaultduo")
        @Expose
        private Defaultduo defaultduo;
        @SerializedName("toss")
        @Expose
        private Toss toss;
        @SerializedName("deimos")
        @Expose
        private Deimos deimos;
        @SerializedName("omaha")
        @Expose
        private Omaha omaha;
        @SerializedName("close")
        @Expose
        private Close close;
        @SerializedName("solidgold")
        @Expose
        private Solidgold solidgold;
        @SerializedName("hover")
        @Expose
        private Hover hover;
        @SerializedName("sword")
        @Expose
        private Sword sword;
        @SerializedName("sneaky")
        @Expose
        private Sneaky sneaky;
        @SerializedName("classic")
        @Expose
        private Classic classic;
        @SerializedName("final")
        @Expose
        private Final _final;
        @SerializedName("slide")
        @Expose
        private Slide slide;
        @SerializedName("love")
        @Expose
        private Love love;
        @SerializedName("playground")
        @Expose
        private Playground playground;
        @SerializedName("steady")
        @Expose
        private Steady steady;
        @SerializedName("trios")
        @Expose
        private Trios trios;
        @SerializedName("showdown")
        @Expose
        private Showdown showdown;
        @SerializedName("showdownalt")
        @Expose
        private Showdownalt showdownalt;
        @SerializedName("comp")
        @Expose
        private Comp comp;
        @SerializedName("disco")
        @Expose
        private Disco disco;
        @SerializedName("highexplosives")
        @Expose
        private Highexplosives highexplosives;
        @SerializedName("low")
        @Expose
        private Low low;
        @SerializedName("ground")
        @Expose
        private Ground ground;
        @SerializedName("50v50sau")
        @Expose
        private _50v50sau _50v50sau;
        @SerializedName("soaring")
        @Expose
        private Soaring soaring;
        @SerializedName("blitz")
        @Expose
        private Blitz blitz;
        @SerializedName("snipers")
        @Expose
        private Snipers snipers;
        @SerializedName("bling")
        @Expose
        private Bling bling;
        @SerializedName("ww")
        @Expose
        private Ww ww;
        @SerializedName("playgroundv2")
        @Expose
        private Playgroundv2 playgroundv2;
        @SerializedName("respawn")
        @Expose
        private Respawn respawn;
        @SerializedName("defaultsolo")
        @Expose
        private Defaultsolo defaultsolo;
        @SerializedName("5x20")
        @Expose
        private _5x20 _5x20;
        @SerializedName("score")
        @Expose
        private Score score;
        @SerializedName("hard")
        @Expose
        private Hard hard;
        @SerializedName("50v50")
        @Expose
        private _50v50 _50v50;
        @SerializedName("defaultsquad")
        @Expose
        private Defaultsquad defaultsquad;
        @SerializedName("barrier")
        @Expose
        private Barrier barrier;

        public Defaultduo getDefaultduo() {
            return defaultduo;
        }

        public void setDefaultduo(Defaultduo defaultduo) {
            this.defaultduo = defaultduo;
        }

        public Toss getToss() {
            return toss;
        }

        public void setToss(Toss toss) {
            this.toss = toss;
        }

        public Deimos getDeimos() {
            return deimos;
        }

        public void setDeimos(Deimos deimos) {
            this.deimos = deimos;
        }

        public Omaha getOmaha() {
            return omaha;
        }

        public void setOmaha(Omaha omaha) {
            this.omaha = omaha;
        }

        public Close getClose() {
            return close;
        }

        public void setClose(Close close) {
            this.close = close;
        }

        public Solidgold getSolidgold() {
            return solidgold;
        }

        public void setSolidgold(Solidgold solidgold) {
            this.solidgold = solidgold;
        }

        public Hover getHover() {
            return hover;
        }

        public void setHover(Hover hover) {
            this.hover = hover;
        }

        public Sword getSword() {
            return sword;
        }

        public void setSword(Sword sword) {
            this.sword = sword;
        }

        public Sneaky getSneaky() {
            return sneaky;
        }

        public void setSneaky(Sneaky sneaky) {
            this.sneaky = sneaky;
        }

        public Classic getClassic() {
            return classic;
        }

        public void setClassic(Classic classic) {
            this.classic = classic;
        }

        public Final getFinal() {
            return _final;
        }

        public void setFinal(Final _final) {
            this._final = _final;
        }

        public Slide getSlide() {
            return slide;
        }

        public void setSlide(Slide slide) {
            this.slide = slide;
        }

        public Love getLove() {
            return love;
        }

        public void setLove(Love love) {
            this.love = love;
        }

        public Playground getPlayground() {
            return playground;
        }

        public void setPlayground(Playground playground) {
            this.playground = playground;
        }

        public Steady getSteady() {
            return steady;
        }

        public void setSteady(Steady steady) {
            this.steady = steady;
        }

        public Trios getTrios() {
            return trios;
        }

        public void setTrios(Trios trios) {
            this.trios = trios;
        }

        public Showdown getShowdown() {
            return showdown;
        }

        public void setShowdown(Showdown showdown) {
            this.showdown = showdown;
        }

        public Showdownalt getShowdownalt() {
            return showdownalt;
        }

        public void setShowdownalt(Showdownalt showdownalt) {
            this.showdownalt = showdownalt;
        }

        public Comp getComp() {
            return comp;
        }

        public void setComp(Comp comp) {
            this.comp = comp;
        }

        public Disco getDisco() {
            return disco;
        }

        public void setDisco(Disco disco) {
            this.disco = disco;
        }

        public Highexplosives getHighexplosives() {
            return highexplosives;
        }

        public void setHighexplosives(Highexplosives highexplosives) {
            this.highexplosives = highexplosives;
        }

        public Low getLow() {
            return low;
        }

        public void setLow(Low low) {
            this.low = low;
        }

        public Ground getGround() {
            return ground;
        }

        public void setGround(Ground ground) {
            this.ground = ground;
        }

        public _50v50sau get50v50sau() {
            return _50v50sau;
        }

        public void set50v50sau(_50v50sau _50v50sau) {
            this._50v50sau = _50v50sau;
        }

        public Soaring getSoaring() {
            return soaring;
        }

        public void setSoaring(Soaring soaring) {
            this.soaring = soaring;
        }

        public Blitz getBlitz() {
            return blitz;
        }

        public void setBlitz(Blitz blitz) {
            this.blitz = blitz;
        }

        public Snipers getSnipers() {
            return snipers;
        }

        public void setSnipers(Snipers snipers) {
            this.snipers = snipers;
        }

        public Bling getBling() {
            return bling;
        }

        public void setBling(Bling bling) {
            this.bling = bling;
        }

        public Ww getWw() {
            return ww;
        }

        public void setWw(Ww ww) {
            this.ww = ww;
        }

        public Playgroundv2 getPlaygroundv2() {
            return playgroundv2;
        }

        public void setPlaygroundv2(Playgroundv2 playgroundv2) {
            this.playgroundv2 = playgroundv2;
        }

        public Respawn getRespawn() {
            return respawn;
        }

        public void setRespawn(Respawn respawn) {
            this.respawn = respawn;
        }

        public Defaultsolo getDefaultsolo() {
            return defaultsolo;
        }

        public void setDefaultsolo(Defaultsolo defaultsolo) {
            this.defaultsolo = defaultsolo;
        }

        public _5x20 get5x20() {
            return _5x20;
        }

        public void set5x20(_5x20 _5x20) {
            this._5x20 = _5x20;
        }

        public Score getScore() {
            return score;
        }

        public void setScore(Score score) {
            this.score = score;
        }

        public Hard getHard() {
            return hard;
        }

        public void setHard(Hard hard) {
            this.hard = hard;
        }

        public _50v50 get50v50() {
            return _50v50;
        }

        public void set50v50(_50v50 _50v50) {
            this._50v50 = _50v50;
        }

        public Defaultsquad getDefaultsquad() {
            return defaultsquad;
        }

        public void setDefaultsquad(Defaultsquad defaultsquad) {
            this.defaultsquad = defaultsquad;
        }

        public Barrier getBarrier() {
            return barrier;
        }

        public void setBarrier(Barrier barrier) {
            this.barrier = barrier;
        }

    }






    public class LargeTeamModes {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("includedPlaylists")
        @Expose
        private List<String> includedPlaylists = null;

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public List<String> getIncludedPlaylists() {
            return includedPlaylists;
        }

        public void setIncludedPlaylists(List<String> includedPlaylists) {
            this.includedPlaylists = includedPlaylists;
        }

    }




    public class Love {

        @SerializedName("duo")
        @Expose
        private Duo____ duo;

        public Duo____ getDuo() {
            return duo;
        }

        public void setDuo(Duo____ duo) {
            this.duo = duo;
        }

    }




    public class Low {

        @SerializedName("squad")
        @Expose
        private Squad_________ squad;

        public Squad_________ getSquad() {
            return squad;
        }

        public void setSquad(Squad_________ squad) {
            this.squad = squad;
        }

    }






    public class LtmModes {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("includedPlaylists")
        @Expose
        private List<String> includedPlaylists = null;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public List<String> getIncludedPlaylists() {
            return includedPlaylists;
        }

        public void setIncludedPlaylists(List<String> includedPlaylists) {
            this.includedPlaylists = includedPlaylists;
        }

    }




    public class Omaha {

        @SerializedName("default")
        @Expose
        private Default_ _default;

        public Default_ getDefault() {
            return _default;
        }

        public void setDefault(Default_ _default) {
            this._default = _default;
        }

    }





    public class OverallData {

        @SerializedName("defaultModes")
        @Expose
        private DefaultModes defaultModes;
        @SerializedName("ltmModes")
        @Expose
        private LtmModes ltmModes;
        @SerializedName("largeTeamModes")
        @Expose
        private LargeTeamModes largeTeamModes;

        public DefaultModes getDefaultModes() {
            return defaultModes;
        }

        public void setDefaultModes(DefaultModes defaultModes) {
            this.defaultModes = defaultModes;
        }

        public LtmModes getLtmModes() {
            return ltmModes;
        }

        public void setLtmModes(LtmModes ltmModes) {
            this.ltmModes = ltmModes;
        }

        public LargeTeamModes getLargeTeamModes() {
            return largeTeamModes;
        }

        public void setLargeTeamModes(LargeTeamModes largeTeamModes) {
            this.largeTeamModes = largeTeamModes;
        }

    }




    public class Playground {

        @SerializedName("default")
        @Expose
        private Default__ _default;

        public Default__ getDefault() {
            return _default;
        }

        public void setDefault(Default__ _default) {
            this._default = _default;
        }

    }




    public class Playground_ {

        @SerializedName("default")
        @Expose
        private Default______________ _default;

        public Default______________ getDefault() {
            return _default;
        }

        public void setDefault(Default______________ _default) {
            this._default = _default;
        }

    }



    public class Playgroundv2 {

        @SerializedName("default")
        @Expose
        private Default_____ _default;

        public Default_____ getDefault() {
            return _default;
        }

        public void setDefault(Default_____ _default) {
            this._default = _default;
        }

    }




    public class Playgroundv2_ {

        @SerializedName("default")
        @Expose
        private Default____________ _default;

        public Default____________ getDefault() {
            return _default;
        }

        public void setDefault(Default____________ _default) {
            this._default = _default;
        }

    }




    public class Playonly {

        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }




    public class Respawn {

        @SerializedName("24")
        @Expose
        private _24 _24;

        public _24 get24() {
            return _24;
        }

        public void set24(_24 _24) {
            this._24 = _24;
        }

    }



    public class Respawn_ {

        @SerializedName("24")
        @Expose
        private _24_ _24;

        public _24_ get24() {
            return _24;
        }

        public void set24(_24_ _24) {
            this._24 = _24;
        }

    }




    public class Score {

        @SerializedName("duo")
        @Expose
        private Duo___________ duo;
        @SerializedName("solo")
        @Expose
        private Solo_____________ solo;

        public Duo___________ getDuo() {
            return duo;
        }

        public void setDuo(Duo___________ duo) {
            this.duo = duo;
        }

        public Solo_____________ getSolo() {
            return solo;
        }

        public void setSolo(Solo_____________ solo) {
            this.solo = solo;
        }

    }





    public class Showdown {

        @SerializedName("solo")
        @Expose
        private Solo______ solo;
        @SerializedName("duo")
        @Expose
        private Duo_____ duo;

        public Solo______ getSolo() {
            return solo;
        }

        public void setSolo(Solo______ solo) {
            this.solo = solo;
        }

        public Duo_____ getDuo() {
            return duo;
        }

        public void setDuo(Duo_____ duo) {
            this.duo = duo;
        }

    }




    public class Showdownalt {

        @SerializedName("duo")
        @Expose
        private Duo______ duo;
        @SerializedName("solo")
        @Expose
        private Solo_______ solo;

        public Duo______ getDuo() {
            return duo;
        }

        public void setDuo(Duo______ duo) {
            this.duo = duo;
        }

        public Solo_______ getSolo() {
            return solo;
        }

        public void setSolo(Solo_______ solo) {
            this.solo = solo;
        }

    }



    public class Slide {

        @SerializedName("squad")
        @Expose
        private Squad______ squad;
        @SerializedName("solo")
        @Expose
        private Solo____ solo;

        public Squad______ getSquad() {
            return squad;
        }

        public void setSquad(Squad______ squad) {
            this.squad = squad;
        }

        public Solo____ getSolo() {
            return solo;
        }

        public void setSolo(Solo____ solo) {
            this.solo = solo;
        }

    }




    public class Sneaky {

        @SerializedName("solo")
        @Expose
        private Solo___ solo;

        public Solo___ getSolo() {
            return solo;
        }

        public void setSolo(Solo___ solo) {
            this.solo = solo;
        }

    }



    public class Snipers {

        @SerializedName("solo")
        @Expose
        private Solo____________ solo;
        @SerializedName("duo")
        @Expose
        private Duo________ duo;

        public Solo____________ getSolo() {
            return solo;
        }

        public void setSolo(Solo____________ solo) {
            this.solo = solo;
        }

        public Duo________ getDuo() {
            return duo;
        }

        public void setDuo(Duo________ duo) {
            this.duo = duo;
        }

    }




    public class Soaring {

        @SerializedName("solo")
        @Expose
        private Solo__________ solo;
        @SerializedName("50s")
        @Expose
        private _50s _50s;

        public Solo__________ getSolo() {
            return solo;
        }

        public void setSolo(Solo__________ solo) {
            this.solo = solo;
        }

        public _50s get50s() {
            return _50s;
        }

        public void set50s(_50s _50s) {
            this._50s = _50s;
        }

    }





    public class Solidgold {

        @SerializedName("squad")
        @Expose
        private Squad___ squad;
        @SerializedName("duo")
        @Expose
        private Duo__ duo;
        @SerializedName("solo")
        @Expose
        private Solo__ solo;

        public Squad___ getSquad() {
            return squad;
        }

        public void setSquad(Squad___ squad) {
            this.squad = squad;
        }

        public Duo__ getDuo() {
            return duo;
        }

        public void setDuo(Duo__ duo) {
            this.duo = duo;
        }

        public Solo__ getSolo() {
            return solo;
        }

        public void setSolo(Solo__ solo) {
            this.solo = solo;
        }

    }




    public class Solo {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }





    public class Solo_ {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }




    public class Solo__ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

    }




    public class Solo___ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

    }





    public class Solo____ {

        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

    }



    public class Solo_____ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }




    public class Solo______ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }




    public class Solo_______ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

    }





    public class Solo________ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

    }



    public class Solo_________ {

        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

    }




    public class Solo__________ {

        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }





    public class Solo___________ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

    }




    public class Solo____________ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

    }




    public class Solo_____________ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop10() {
            return placetop10;
        }

        public void setPlacetop10(Integer placetop10) {
            this.placetop10 = placetop10;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

    }




    public class Solo______________ {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlacetop25() {
            return placetop25;
        }

        public void setPlacetop25(Integer placetop25) {
            this.placetop25 = placetop25;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }




    public class Squad {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

    }





    public class Squad_ {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getPlacetop6() {
            return placetop6;
        }

        public void setPlacetop6(Integer placetop6) {
            this.placetop6 = placetop6;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlacetop3() {
            return placetop3;
        }

        public void setPlacetop3(Integer placetop3) {
            this.placetop3 = placetop3;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }




    public class Squad__ {

        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;

        public Integer getPlacetop6() {
            return placetop6;
        }

        public void setPlacetop6(Integer placetop6) {
            this.placetop6 = placetop6;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop3() {
            return placetop3;
        }

        public void setPlacetop3(Integer placetop3) {
            this.placetop3 = placetop3;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

    }





    public class Squad___ {

        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getPlacetop3() {
            return placetop3;
        }

        public void setPlacetop3(Integer placetop3) {
            this.placetop3 = placetop3;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop6() {
            return placetop6;
        }

        public void setPlacetop6(Integer placetop6) {
            this.placetop6 = placetop6;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }




    public class Squad____ {

        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

    }





    public class Squad_____ {

        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

    }




    public class Squad______ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }




    public class Squad_______ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop6() {
            return placetop6;
        }

        public void setPlacetop6(Integer placetop6) {
            this.placetop6 = placetop6;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getPlacetop3() {
            return placetop3;
        }

        public void setPlacetop3(Integer placetop3) {
            this.placetop3 = placetop3;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }




    public class Squad________ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }




    public class Squad_________ {

        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop6() {
            return placetop6;
        }

        public void setPlacetop6(Integer placetop6) {
            this.placetop6 = placetop6;
        }

    }



    public class Squad__________ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }




    public class Squad___________ {

        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

    }




    public class Squad____________ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlacetop6() {
            return placetop6;
        }

        public void setPlacetop6(Integer placetop6) {
            this.placetop6 = placetop6;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getPlacetop3() {
            return placetop3;
        }

        public void setPlacetop3(Integer placetop3) {
            this.placetop3 = placetop3;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }




    public class Squad_____________ {

        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getPlacetop6() {
            return placetop6;
        }

        public void setPlacetop6(Integer placetop6) {
            this.placetop6 = placetop6;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getPlacetop3() {
            return placetop3;
        }

        public void setPlacetop3(Integer placetop3) {
            this.placetop3 = placetop3;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }




    public class Squad______________ {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }




    public class Steady {

        @SerializedName("squad")
        @Expose
        private Squad_______ squad;
        @SerializedName("solo")
        @Expose
        private Solo_____ solo;

        public Squad_______ getSquad() {
            return squad;
        }

        public void setSquad(Squad_______ squad) {
            this.squad = squad;
        }

        public Solo_____ getSolo() {
            return solo;
        }

        public void setSolo(Solo_____ solo) {
            this.solo = solo;
        }

    }




    public class Sword {

        @SerializedName("squad")
        @Expose
        private Squad____ squad;

        public Squad____ getSquad() {
            return squad;
        }

        public void setSquad(Squad____ squad) {
            this.squad = squad;
        }

    }




    public class Toss {

        @SerializedName("squad")
        @Expose
        private Squad squad;

        public Squad getSquad() {
            return squad;
        }

        public void setSquad(Squad squad) {
            this.squad = squad;
        }

    }



    public class Trios {

        @SerializedName("default")
        @Expose
        private Default___ _default;

        public Default___ getDefault() {
            return _default;
        }

        public void setDefault(Default___ _default) {
            this._default = _default;
        }

    }




    public class Unvaulted {

        @SerializedName("squad")
        @Expose
        private Squad______________ squad;

        public Squad______________ getSquad() {
            return squad;
        }

        public void setSquad(Squad______________ squad) {
            this.squad = squad;
        }

    }




    public class Ww {

        @SerializedName("duo")
        @Expose
        private Duo__________ duo;

        public Duo__________ getDuo() {
            return duo;
        }

        public void setDuo(Duo__________ duo) {
            this.duo = duo;
        }

    }




    public class _12 {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }





    public class _12_ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

    }




    public class _20 {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

    }




    public class _24 {

        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("score")
        @Expose
        private Integer score;

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

    }




    public class _24_ {

        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

    }




    public class _32 {

        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }




    public class _32_ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

    }



    public class _50 {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("score")
        @Expose
        private Integer score;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

    }




    public class _50s {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

    }





    public class _50v50 {

        @SerializedName("default")
        @Expose
        private Default________ _default;

        public Default________ getDefault() {
            return _default;
        }

        public void setDefault(Default________ _default) {
            this._default = _default;
        }

    }




    public class _50v50sau {

        @SerializedName("default")
        @Expose
        private Default____ _default;

        public Default____ getDefault() {
            return _default;
        }

        public void setDefault(Default____ _default) {
            this._default = _default;
        }

    }





    public class _5x20 {

        @SerializedName("default")
        @Expose
        private Default_______ _default;

        public Default_______ getDefault() {
            return _default;
        }

        public void setDefault(Default_______ _default) {
            this._default = _default;
        }

    }




    public class _64 {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

        public Integer getPlayersoutlived() {
            return playersoutlived;
        }

        public void setPlayersoutlived(Integer playersoutlived) {
            this.playersoutlived = playersoutlived;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getMinutesplayed() {
            return minutesplayed;
        }

        public void setMinutesplayed(Integer minutesplayed) {
            this.minutesplayed = minutesplayed;
        }

    }

}
