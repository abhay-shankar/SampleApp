package com.example.sampleApp.repo.service;

import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseService {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://api.yelp.com/v3/businesses/";
    private static final Converter.Factory gsonConverter = GsonConverterFactory.create();

    public static Retrofit getService() {
        if (retrofit == null) {
            OkHttpClient client = new OkHttpClient().newBuilder().build();
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(gsonConverter).build();
        }
        return retrofit;
    }

}
