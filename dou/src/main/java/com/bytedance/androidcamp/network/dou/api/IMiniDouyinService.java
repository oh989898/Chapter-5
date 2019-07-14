package com.bytedance.androidcamp.network.dou.api;


import com.bytedance.androidcamp.network.dou.model.GetVideo;
import com.bytedance.androidcamp.network.dou.model.PostVideo;


import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface IMiniDouyinService {
    // TODO 7: Define IMiniDouyinService
    String PATH="http://test.androidcamp.bytedance.com/mini_douyin/invoke/";

    @GET(PATH)
    Call<GetVideo> getVideos();

    @Multipart
    @POST(PATH)
    Call<PostVideo> postVideo(
            @Query("student_id") String studentId,
            @Query("user_name") String userName,
            @Part MultipartBody.Part coverImage,
            @Part MultipartBody.Part video
    );

}
