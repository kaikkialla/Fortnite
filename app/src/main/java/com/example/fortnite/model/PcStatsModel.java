package com.example.fortnite.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class PcStatsModel {

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

    public static class Keyboardmouse {

        @SerializedName("comp")
        @Expose
        private Comp comp;
        @SerializedName("defaultduo")
        @Expose
        private Defaultduo defaultduo;
        @SerializedName("classic")
        @Expose
        private Classic classic;
        @SerializedName("deimos")
        @Expose
        private Deimos deimos;
        @SerializedName("50v50")
        @Expose
        private _50v50 _50v50;
        @SerializedName("snipers")
        @Expose
        private Snipers snipers;
        @SerializedName("bling")
        @Expose
        private Bling bling;
        @SerializedName("solidgold")
        @Expose
        private Solidgold solidgold;
        @SerializedName("showdown")
        @Expose
        private Showdown showdown;
        @SerializedName("vamp")
        @Expose
        private Vamp vamp;
        @SerializedName("slide")
        @Expose
        private Slide slide;
        @SerializedName("defaultsquad")
        @Expose
        private Defaultsquad defaultsquad;
        @SerializedName("hover")
        @Expose
        private Hover hover;
        @SerializedName("sword")
        @Expose
        private Sword sword;
        @SerializedName("sneaky")
        @Expose
        private Sneaky sneaky;
        @SerializedName("close")
        @Expose
        private Close close;
        @SerializedName("showdownalt")
        @Expose
        private Showdownalt showdownalt;
        @SerializedName("steady")
        @Expose
        private Steady steady;
        @SerializedName("hard")
        @Expose
        private Hard hard;
        @SerializedName("playground")
        @Expose
        private Playground playground;
        @SerializedName("score")
        @Expose
        private Score score;
        @SerializedName("ground")
        @Expose
        private Ground ground;
        @SerializedName("blitz")
        @Expose
        private Blitz blitz;
        @SerializedName("playgroundv2")
        @Expose
        private Playgroundv2 playgroundv2;
        @SerializedName("disco")
        @Expose
        private Disco disco;
        @SerializedName("defaultsolo")
        @Expose
        private Defaultsolo defaultsolo;
        @SerializedName("barrier")
        @Expose
        private Barrier barrier;
        @SerializedName("soaring")
        @Expose
        private Soaring soaring;

        public Comp getComp() {
            return comp;
        }

        public void setComp(Comp comp) {
            this.comp = comp;
        }

        public Defaultduo getDefaultduo() {
            return defaultduo;
        }

        public void setDefaultduo(Defaultduo defaultduo) {
            this.defaultduo = defaultduo;
        }

        public Classic getClassic() {
            return classic;
        }

        public void setClassic(Classic classic) {
            this.classic = classic;
        }

        public Deimos getDeimos() {
            return deimos;
        }

        public void setDeimos(Deimos deimos) {
            this.deimos = deimos;
        }

        public _50v50 get50v50() {
            return _50v50;
        }

        public void set50v50(_50v50 _50v50) {
            this._50v50 = _50v50;
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

        public Solidgold getSolidgold() {
            return solidgold;
        }

        public void setSolidgold(Solidgold solidgold) {
            this.solidgold = solidgold;
        }

        public Showdown getShowdown() {
            return showdown;
        }

        public void setShowdown(Showdown showdown) {
            this.showdown = showdown;
        }

        public Vamp getVamp() {
            return vamp;
        }

        public void setVamp(Vamp vamp) {
            this.vamp = vamp;
        }

        public Slide getSlide() {
            return slide;
        }

        public void setSlide(Slide slide) {
            this.slide = slide;
        }

        public Defaultsquad getDefaultsquad() {
            return defaultsquad;
        }

        public void setDefaultsquad(Defaultsquad defaultsquad) {
            this.defaultsquad = defaultsquad;
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

        public Close getClose() {
            return close;
        }

        public void setClose(Close close) {
            this.close = close;
        }

        public Showdownalt getShowdownalt() {
            return showdownalt;
        }

        public void setShowdownalt(Showdownalt showdownalt) {
            this.showdownalt = showdownalt;
        }

        public Steady getSteady() {
            return steady;
        }

        public void setSteady(Steady steady) {
            this.steady = steady;
        }

        public Hard getHard() {
            return hard;
        }

        public void setHard(Hard hard) {
            this.hard = hard;
        }

        public Playground getPlayground() {
            return playground;
        }

        public void setPlayground(Playground playground) {
            this.playground = playground;
        }

        public Score getScore() {
            return score;
        }

        public void setScore(Score score) {
            this.score = score;
        }

        public Ground getGround() {
            return ground;
        }

        public void setGround(Ground ground) {
            this.ground = ground;
        }

        public Blitz getBlitz() {
            return blitz;
        }

        public void setBlitz(Blitz blitz) {
            this.blitz = blitz;
        }

        public Playgroundv2 getPlaygroundv2() {
            return playgroundv2;
        }

        public void setPlaygroundv2(Playgroundv2 playgroundv2) {
            this.playgroundv2 = playgroundv2;
        }

        public Disco getDisco() {
            return disco;
        }

        public void setDisco(Disco disco) {
            this.disco = disco;
        }

        public Defaultsolo getDefaultsolo() {
            return defaultsolo;
        }

        public void setDefaultsolo(Defaultsolo defaultsolo) {
            this.defaultsolo = defaultsolo;
        }

        public Barrier getBarrier() {
            return barrier;
        }

        public void setBarrier(Barrier barrier) {
            this.barrier = barrier;
        }

        public Soaring getSoaring() {
            return soaring;
        }

        public void setSoaring(Soaring soaring) {
            this.soaring = soaring;
        }

    }



    public class Barrier {

        @SerializedName("12")
        @Expose
        private _12 _12;

        public _12 get12() {
            return _12;
        }

        public void set12(_12 _12) {
            this._12 = _12;
        }

    }



    public class Bling {

        @SerializedName("squad")
        @Expose
        private Squad___ squad;

        public Squad___ getSquad() {
            return squad;
        }

        public void setSquad(Squad___ squad) {
            this.squad = squad;
        }

    }


    public class Blitz {

        @SerializedName("duo")
        @Expose
        private Duo____ duo;
        @SerializedName("squad")
        @Expose
        private Squad___________ squad;
        @SerializedName("solo")
        @Expose
        private Solo__________ solo;

        public Duo____ getDuo() {
            return duo;
        }

        public void setDuo(Duo____ duo) {
            this.duo = duo;
        }

        public Squad___________ getSquad() {
            return squad;
        }

        public void setSquad(Squad___________ squad) {
            this.squad = squad;
        }

        public Solo__________ getSolo() {
            return solo;
        }

        public void setSolo(Solo__________ solo) {
            this.solo = solo;
        }

    }


    public class Classic {

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


    public class Close {

        @SerializedName("squad")
        @Expose
        private Squad_______ squad;

        public Squad_______ getSquad() {
            return squad;
        }

        public void setSquad(Squad_______ squad) {
            this.squad = squad;
        }

    }


    public class Comp {

        @SerializedName("solo")
        @Expose
        private Solo solo;
        @SerializedName("meta")
        @Expose
        private Meta meta;

        public Solo getSolo() {
            return solo;
        }

        public void setSolo(Solo solo) {
            this.solo = solo;
        }

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }

    }


    public class Data {

        @SerializedName("keyboardmouse")
        @Expose
        private Keyboardmouse keyboardmouse;
        @SerializedName("touch")
        @Expose
        private Touch touch;

        public Keyboardmouse getKeyboardmouse() {
            return keyboardmouse;
        }

        public void setKeyboardmouse(Keyboardmouse keyboardmouse) {
            this.keyboardmouse = keyboardmouse;
        }

        public Touch getTouch() {
            return touch;
        }

        public void setTouch(Touch touch) {
            this.touch = touch;
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
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
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
        @SerializedName("score")
        @Expose
        private Integer score;
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


    public class Default_ {

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

    public class Default__ {

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


    public class Default___ {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

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

    }

    public class Default____ {

        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

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

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }


    public class Default_____ {

        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
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


    public class Default______ {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;

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


    public class Default_______ {

        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;

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


    public class Defaultsolo {

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


    public class Defaultsolo_ {

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


    public class Defaultsquad {

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


    public class Deimos {

        @SerializedName("solo")
        @Expose
        private Solo_ solo;
        @SerializedName("duo")
        @Expose
        private Duo duo;
        @SerializedName("squad")
        @Expose
        private Squad_ squad;

        public Solo_ getSolo() {
            return solo;
        }

        public void setSolo(Solo_ solo) {
            this.solo = solo;
        }

        public Duo getDuo() {
            return duo;
        }

        public void setDuo(Duo duo) {
            this.duo = duo;
        }

        public Squad_ getSquad() {
            return squad;
        }

        public void setSquad(Squad_ squad) {
            this.squad = squad;
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


    public class Duo {

        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;

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

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
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

    }


    public class Duo_ {

        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;

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

        public Integer getLastmodified() {
            return lastmodified;
        }

        public void setLastmodified(Integer lastmodified) {
            this.lastmodified = lastmodified;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
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


    public class Duo__ {

        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
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
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;

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

        public Integer getPlacetop5() {
            return placetop5;
        }

        public void setPlacetop5(Integer placetop5) {
            this.placetop5 = placetop5;
        }

    }


    public class Duo___ {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;
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

    }



    public class Duo____ {

        @SerializedName("placetop5")
        @Expose
        private Integer placetop5;
        @SerializedName("placetop12")
        @Expose
        private Integer placetop12;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;

        public Integer getPlacetop5() {
            return placetop5;
        }

        public void setPlacetop5(Integer placetop5) {
            this.placetop5 = placetop5;
        }

        public Integer getPlacetop12() {
            return placetop12;
        }

        public void setPlacetop12(Integer placetop12) {
            this.placetop12 = placetop12;
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

        public Integer getKills() {
            return kills;
        }

        public void setKills(Integer kills) {
            this.kills = kills;
        }

    }





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
        private Squad_________ squad;

        public Squad_________ getSquad() {
            return squad;
        }

        public void setSquad(Squad_________ squad) {
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


    public class LtmModes {

        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("kills")
        @Expose
        private Integer kills;
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


    public class Meta {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

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

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
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
        private Default___ _default;

        public Default___ getDefault() {
            return _default;
        }

        public void setDefault(Default___ _default) {
            this._default = _default;
        }

    }


    public class Playground_ {

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


    public class Playgroundv2 {

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


    public class Score {

        @SerializedName("duo")
        @Expose
        private Duo___ duo;
        @SerializedName("solo")
        @Expose
        private Solo_________ solo;

        public Duo___ getDuo() {
            return duo;
        }

        public void setDuo(Duo___ duo) {
            this.duo = duo;
        }

        public Solo_________ getSolo() {
            return solo;
        }

        public void setSolo(Solo_________ solo) {
            this.solo = solo;
        }

    }


    public class Showdown {

        @SerializedName("solo")
        @Expose
        private Solo___ solo;
        @SerializedName("squad")
        @Expose
        private Squad_____ squad;

        public Solo___ getSolo() {
            return solo;
        }

        public void setSolo(Solo___ solo) {
            this.solo = solo;
        }

        public Squad_____ getSquad() {
            return squad;
        }

        public void setSquad(Squad_____ squad) {
            this.squad = squad;
        }

    }


    public class Showdownalt {

        @SerializedName("trios")
        @Expose
        private Trios trios;
        @SerializedName("solo")
        @Expose
        private Solo_______ solo;
        @SerializedName("duo")
        @Expose
        private Duo__ duo;

        public Trios getTrios() {
            return trios;
        }

        public void setTrios(Trios trios) {
            this.trios = trios;
        }

        public Solo_______ getSolo() {
            return solo;
        }

        public void setSolo(Solo_______ solo) {
            this.solo = solo;
        }

        public Duo__ getDuo() {
            return duo;
        }

        public void setDuo(Duo__ duo) {
            this.duo = duo;
        }

    }


    public class Slide {

        @SerializedName("solo")
        @Expose
        private Solo_____ solo;

        public Solo_____ getSolo() {
            return solo;
        }

        public void setSolo(Solo_____ solo) {
            this.solo = solo;
        }

    }


    public class Sneaky {

        @SerializedName("solo")
        @Expose
        private Solo______ solo;

        public Solo______ getSolo() {
            return solo;
        }

        public void setSolo(Solo______ solo) {
            this.solo = solo;
        }

    }


    public class Snipers {

        @SerializedName("duo")
        @Expose
        private Duo_ duo;
        @SerializedName("solo")
        @Expose
        private Solo__ solo;
        @SerializedName("squad")
        @Expose
        private Squad__ squad;

        public Duo_ getDuo() {
            return duo;
        }

        public void setDuo(Duo_ duo) {
            this.duo = duo;
        }

        public Solo__ getSolo() {
            return solo;
        }

        public void setSolo(Solo__ solo) {
            this.solo = solo;
        }

        public Squad__ getSquad() {
            return squad;
        }

        public void setSquad(Squad__ squad) {
            this.squad = squad;
        }

    }


    public class Soaring {

        @SerializedName("50s")
        @Expose
        private _50s _50s;

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
        private Squad____ squad;

        public Squad____ getSquad() {
            return squad;
        }

        public void setSquad(Squad____ squad) {
            this.squad = squad;
        }

    }


    public class Solo {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
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

    }


    public class Solo_ {

        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("score")
        @Expose
        private Integer score;

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


    public class Solo__ {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
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


    public class Solo___ {

        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

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

    public class Solo____ {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

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


    public class Solo_____ {

        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("score")
        @Expose
        private Integer score;

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

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

    }


    public class Solo______ {

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


    public class Solo_______ {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
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


    public class Solo________ {

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

    public class Solo_________ {

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


    public class Solo__________ {

        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop10")
        @Expose
        private Integer placetop10;
        @SerializedName("placetop25")
        @Expose
        private Integer placetop25;

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

    }


    public class Squad {

        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("score")
        @Expose
        private Integer score;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;

        public Integer getPlacetop6() {
            return placetop6;
        }

        public void setPlacetop6(Integer placetop6) {
            this.placetop6 = placetop6;
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

    }


    public class Squad_ {

        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
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

    }


    public class Squad__ {

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


    public class Squad___ {

        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
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

    }


    public class Squad____ {

        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
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

    }


    public class Squad_____ {

        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

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

        public Integer getPlacetop1() {
            return placetop1;
        }

        public void setPlacetop1(Integer placetop1) {
            this.placetop1 = placetop1;
        }

        public Integer getPlacetop6() {
            return placetop6;
        }

        public void setPlacetop6(Integer placetop6) {
            this.placetop6 = placetop6;
        }

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }


    public class Squad______ {

        @SerializedName("minutesplayed")
        @Expose
        private Integer minutesplayed;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("lastmodified")
        @Expose
        private Integer lastmodified;
        @SerializedName("kills")
        @Expose
        private Integer kills;
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


    public class Squad_______ {

        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;

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

    }


    public class Squad________ {

        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

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

    public class Squad_________ {

        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
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

        @SerializedName("placetop3")
        @Expose
        private Integer placetop3;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;
        @SerializedName("kills")
        @Expose
        private Integer kills;
        @SerializedName("placetop6")
        @Expose
        private Integer placetop6;

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

    public class Steady {

        @SerializedName("squad")
        @Expose
        private Squad________ squad;
        @SerializedName("solo")
        @Expose
        private Solo________ solo;

        public Squad________ getSquad() {
            return squad;
        }

        public void setSquad(Squad________ squad) {
            this.squad = squad;
        }

        public Solo________ getSolo() {
            return solo;
        }

        public void setSolo(Solo________ solo) {
            this.solo = solo;
        }

    }


    public class Sword {

        @SerializedName("squad")
        @Expose
        private Squad______ squad;

        public Squad______ getSquad() {
            return squad;
        }

        public void setSquad(Squad______ squad) {
            this.squad = squad;
        }

    }


    public class Touch {

        @SerializedName("playground")
        @Expose
        private Playground_ playground;
        @SerializedName("defaultsolo")
        @Expose
        private Defaultsolo_ defaultsolo;

        public Playground_ getPlayground() {
            return playground;
        }

        public void setPlayground(Playground_ playground) {
            this.playground = playground;
        }

        public Defaultsolo_ getDefaultsolo() {
            return defaultsolo;
        }

        public void setDefaultsolo(Defaultsolo_ defaultsolo) {
            this.defaultsolo = defaultsolo;
        }

    }


    public class Trios {

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
        @SerializedName("playersoutlived")
        @Expose
        private Integer playersoutlived;
        @SerializedName("placetop1")
        @Expose
        private Integer placetop1;
        @SerializedName("matchesplayed")
        @Expose
        private Integer matchesplayed;

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

        public Integer getMatchesplayed() {
            return matchesplayed;
        }

        public void setMatchesplayed(Integer matchesplayed) {
            this.matchesplayed = matchesplayed;
        }

    }


    public class Vamp {

        @SerializedName("solo")
        @Expose
        private Solo____ solo;

        public Solo____ getSolo() {
            return solo;
        }

        public void setSolo(Solo____ solo) {
            this.solo = solo;
        }

    }


    public class _12 {

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


    public class _32 {

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
        private Default_ _default;

        public Default_ getDefault() {
            return _default;
        }

        public void setDefault(Default_ _default) {
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