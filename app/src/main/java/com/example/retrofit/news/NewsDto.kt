package com.example.retrofit.news
import com.google.gson.annotations.SerializedName


data class NewsDto(
    @SerializedName("response")
    val response: Response?
)

data class Response(
    @SerializedName("currentPage")
    val currentPage: Int?,
    @SerializedName("orderBy")
    val orderBy: String?,
    @SerializedName("pageSize")
    val pageSize: Int?,
    @SerializedName("pages")
    val pages: Int?,
    @SerializedName("results")
    val results: List<NewsResultDto>?,
    @SerializedName("startIndex")
    val startIndex: Int?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("total")
    val total: Int?,
    @SerializedName("userTier")
    val userTier: String?
)

data class NewsResultDto(
    @SerializedName("apiUrl")
    val apiUrl: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("isHosted")
    val isHosted: Boolean?,
    @SerializedName("pillarId")
    val pillarId: String?,
    @SerializedName("pillarName")
    val pillarName: String?,
    @SerializedName("sectionId")
    val sectionId: String?,
    @SerializedName("sectionName")
    val sectionName: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("webPublicationDate")
    val webPublicationDate: String?,
    @SerializedName("webTitle")
    val webTitle: String?,
    @SerializedName("webUrl")
    val webUrl: String?
)