package com.example.newsapp;

import com.example.newsapp.Model.Headlines;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("top-headlines")
    Call<Headlines> getHeadlines(
        @Query("country") String country,
                @Query("apiKey") String apiKey
    );
}
