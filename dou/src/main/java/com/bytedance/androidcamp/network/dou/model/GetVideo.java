package com.bytedance.androidcamp.network.dou.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetVideo {

    @SerializedName("feeds") private List<Video> feeds;
    @SerializedName("success") private boolean success;
    public List<Video> getGetVideo(){return feeds;}
    public void setGetVideo(List<Video> feeds){this.feeds=feeds;}
    public void setSuccess(boolean success){this.success=success;}
    public boolean isSuccess(){return success;}
}