package com.example.fortnite.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class idModel {

    @SerializedName("uid")
    @Expose
    private String uid;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("platforms")

    @Expose
    private List<String> platforms = null;
    @SerializedName("seasons")
    @Expose
    private List<String> seasons = null;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<String> platforms) {
        this.platforms = platforms;
    }

    public List<String> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<String> seasons) {
        this.seasons = seasons;
    }



    public class Error {

        @SerializedName("error")
        @Expose
        private Boolean error;
        @SerializedName("errorCode")
        @Expose
        private String errorCode;
        @SerializedName("errorMessage")
        @Expose
        private String errorMessage;
        @SerializedName("numericErrorCode")
        @Expose
        private String numericErrorCode;
        @SerializedName("originatingService")
        @Expose
        private String originatingService;
        @SerializedName("intent")
        @Expose
        private String intent;

        public Boolean getError() {
            return error;
        }

        public void setError(Boolean error) {
            this.error = error;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public String getNumericErrorCode() {
            return numericErrorCode;
        }

        public void setNumericErrorCode(String numericErrorCode) {
            this.numericErrorCode = numericErrorCode;
        }

        public String getOriginatingService() {
            return originatingService;
        }

        public void setOriginatingService(String originatingService) {
            this.originatingService = originatingService;
        }

        public String getIntent() {
            return intent;
        }

        public void setIntent(String intent) {
            this.intent = intent;
        }

    }
}