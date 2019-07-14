package com.bytedance.androidcamp.network.dou.model;

import com.google.gson.annotations.SerializedName;

public class PostVideo {

    @SerializedName("result") private Object result;
    @SerializedName("url") private String url;
    @SerializedName("success") private boolean success;

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    public void setPostVideo(Object result) {
        this.result = result;
    }
    public Object getPostVideo() {
        return result;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public boolean isSuccess() {
        return success;
    }
}