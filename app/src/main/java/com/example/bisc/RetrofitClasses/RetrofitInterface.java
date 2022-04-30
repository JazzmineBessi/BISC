package com.example.bisc.RetrofitClasses;

import com.example.bisc.LocalModel.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface RetrofitInterface {
        @POST("services/data/authentication")
        public Call<User> getUserLogin (@Header ("Authorization") String authorization,@Header ("Accept") String accept, @Header ("Content-Type") String contentType, @Header ("X-API-KEY")String xapikey, @Body User user);
      // @GET("services/data/digital/clients/0000023/ci/cnps/contribution/detail?contributionId=GLKRQJ9EYS")
      //public Call<> getreference (@Header ("Accept")String accept, @Header ("Content-Type")String contentType, @Header ("X-API-KEY")String xapikey);
   // @POST("services/data/digital/clients/0000023/ci/cnps/contribution/detail?contributionId=GLKRQJ9EYS")
   // public Call<> get (@Header ("Authorization") String authorization,@Header ("Accept") String accept, @Header ("Content-Type") String contentType, @Header ("X-API-KEY")String xapikey, @Body User user);

}

