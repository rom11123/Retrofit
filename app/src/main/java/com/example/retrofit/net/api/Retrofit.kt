package com.example.retrofit.net.api

import com.example.retrofit.net.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object Retrofit {

//    private val httpClient:OkHttpClient = OkHttpClient.Builder().addInterceptor { chain ->
//        val original: Request = chain.request()
//        val originalHttpUrl: HttpUrl = original.url()
//        val url = originalHttpUrl.newBuilder()
//            .addQueryParameter("api-key", "98ed8dd0-2e22-4c88-a767-abb7673e11a6")
//            .build()
//        val requestBuilder: Request.Builder = original.newBuilder()
//            .url(url)
//        val request: Request = requestBuilder.build()
//        chain.proceed(request)
//    }.build()

    private var retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(Constants.BASE_URL)
        //.client(httpClient)
        .build()

    fun createNewsApiService(): NewsApiService = retrofit.create(NewsApiService::class.java)
}