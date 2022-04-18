package com.example.bisc;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RetrofitInterface {
        @FormUrlEncoded
        @POST("services/data/authentication")
        public Call<User> getUserLogin (@Field("Login")String Login, @Field("MDP") String MDP);
}


