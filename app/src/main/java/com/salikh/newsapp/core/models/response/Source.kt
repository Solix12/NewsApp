package com.salikh.newsapp.core.models.response


import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("id")
    val id: String, // the-verge
    @SerializedName("name")
    val name: String // The Verge
)