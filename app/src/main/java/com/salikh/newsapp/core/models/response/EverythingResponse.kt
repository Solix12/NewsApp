package com.salikh.newsapp.core.models.response


import com.google.gson.annotations.SerializedName

data class EverythingResponse(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String, // ok
    @SerializedName("totalResults")
    val totalResults: Int // 15227
)