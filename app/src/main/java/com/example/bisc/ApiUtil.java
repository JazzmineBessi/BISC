package com.example.bisc;
public class ApiUtil {

    private static final String BASE_URL = "http://192.168.10.203:8082/CarthagoInteroperabilite/api/";

    public static RetrofitInterface getServiceClass(){
        return RetrofitAPI.getRetrofit(BASE_URL).create(RetrofitInterface.class);
    }
}