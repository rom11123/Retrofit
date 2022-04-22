package com.example.retrofit.net.api

import com.example.retrofit.news.NewsDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {
    @GET("search")
    fun getNews(@Query("page") page:Int,@Query("api-key") key: String): Call<NewsDto>
}