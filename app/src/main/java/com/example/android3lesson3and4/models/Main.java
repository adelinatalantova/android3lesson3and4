package com.example.android3lesson3and4.models;

import com.google.gson.annotations.SerializedName;

public class Main {

    @SerializedName("feels_like")
    private Double mFeelsLike;
    @SerializedName("humidity")
    private Long mHumidity;
    @SerializedName("pressure")
    private Long mPressure;
    @SerializedName("temp")
    private Double mTemp;
    @SerializedName("temp_max")
    private Double mTempMax;
    @SerializedName("temp_min")
    private Double mTempMin;

    public Double getmFeelsLike() {
        return mFeelsLike;
    }

    public void setmFeelsLike(Double mFeelsLike) {
        this.mFeelsLike = mFeelsLike;
    }

    public Long getmHumidity() {
        return mHumidity;
    }

    public void setmHumidity(Long mHumidity) {
        this.mHumidity = mHumidity;
    }

    public Long getmPressure() {
        return mPressure;
    }

    public void setmPressure(Long mPressure) {
        this.mPressure = mPressure;
    }

    public Double getmTemp() {
        return mTemp;
    }

    public void setmTemp(Double mTemp) {
        this.mTemp = mTemp;
    }

    public Double getmTempMax() {
        return mTempMax;
    }

    public void setmTempMax(Double mTempMax) {
        this.mTempMax = mTempMax;
    }

    public Double getmTempMin() {
        return mTempMin;
    }

    public void setmTempMin(Double mTempMin) {
        this.mTempMin = mTempMin;
    }
}
