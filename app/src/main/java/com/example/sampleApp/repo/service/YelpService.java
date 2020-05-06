package com.example.sampleApp.repo.service;

import com.example.sampleApp.model.YelpResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface YelpService {

    @Headers({
            "Authorization:Bearer HxCreNUxC0jdwH21mwzV4xgJzenPr_Wh9eMNfGV4I9PyaoD5FdtCq6_295tChv_JsNgd_uFflg3jlymD-m9DOZY3X4lkW7pgC_mw7wqxFN7ue7C6fAja-fPrhWiGXnYx"
    })
    @GET("search")
    Call<YelpResponse> getYelpResponse(@Query("location") String address);
}
