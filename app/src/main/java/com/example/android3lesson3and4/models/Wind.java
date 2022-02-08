package com.example.android3lesson3and4.models;

import com.google.gson.annotations.SerializedName;

public class Wind {
    @SerializedName("deg")
    private Long mDeg;
    @SerializedName("speed")
    private Double mSpeed;

    public Long getmDeg() {
        return mDeg;
    }

    public void setmDeg(Long mDeg) {
        this.mDeg = mDeg;
    }

    public Double getmSpeed() {
        return mSpeed;
    }

    public void setmSpeed(Double mSpeed) {
        this.mSpeed = mSpeed;
    }
}
