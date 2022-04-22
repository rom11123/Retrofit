package com.example.retrofit.ui

import android.os.Bundle
import com.example.retrofit.R
import com.example.retrofit.net.Constants.Companion.API_KEY
import com.example.retrofit.net.api.Retrofit
import com.example.retrofit.news.NewsDto
import com.example.retrofit.ui.base.BaseActivity
import com.example.retrofit.util.showToast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : BaseActivity() {

    private val newsApiService by lazy {
        Retrofit.createNewsApiService()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        newsApiService.getNews(1,API_KEY).enqueue(object : Callback<NewsDto> {

            override fun onFailure(call: Call<NewsDto>, t: Throwable) {
                showToast(t.message.toString())
            }

            override fun onResponse(call: Call<NewsDto>?, response: Response<NewsDto>?) {
                val newsResponse = response?.body()
                newsResponse?.response?.results
                testTextView.text = newsResponse.toString()
                showToast(newsResponse.toString())
            }

        })
    }

}