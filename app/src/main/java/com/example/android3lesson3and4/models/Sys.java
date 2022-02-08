package com.example.android3lesson3and4.models;

import com.google.gson.annotations.SerializedName;

public class Sys {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("id")
    private Long mId;
    @SerializedName("message")
    private Double mMessage;
    @SerializedName("sunrise")
    private Long mSunrise;
    @SerializedName("sunset")
    private Long mSunset;
    @SerializedName("type")
    private Long mType;

    public String getmCountry() {
        return mCountry;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Double getmMessage() {
        return mMessage;
    }

    public void setmMessage(Double mMessage) {
        this.mMessage = mMessage;
    }

    public Long getmSunrise() {
        return mSunrise;
    }

    public void setmSunrise(Long mSunrise) {
        this.mSunrise = mSunrise;
    }

    public Long getmSunset() {
        return mSunset;
    }

    public void setmSunset(Long mSunset) {
        this.mSunset = mSunset;
    }

    public Long getmType() {
        return mType;
    }

    public void setmType(Long mType) {
        this.mType = mType;
    }
}
