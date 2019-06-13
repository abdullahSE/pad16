package com.example.pad.api;

import com.example.pad.models.LoginResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {
    @FormUrlEncoded
    @POST("createuser")
    Call<ResponseBody> createUser(

            @Field("email")String email,
            @Field("name")String name,
            @Field("password")String password,
            @Field("kenteken")String kenteken
    );

    @FormUrlEncoded
    @POST("userlogin")
    Call<LoginResponse> userLogin(
            @Field("email")String email,
            @Field("password") String password


    );
}
