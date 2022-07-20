package com.salikh.newsapp.core.models.response


import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("author")
    val author: String, // Justine Calma
    @SerializedName("content")
    val content: String, // Miners voluntarily powered down as energy demand and prices spiked An aerial view of the Whinstone US Bitcoin mining facility in Rockdale, Texas, on October 9th, 2021. The long sheds at North Ameri… [+3770 chars]
    @SerializedName("description")
    val description: String, // Bitcoin miners in Texas powered down to respond to an energy crunch triggered by a punishing heatwave. Energy demand from cryptomining is growing in the state.
    @SerializedName("publishedAt")
    val publishedAt: String, // 2022-07-12T15:50:17Z
    @SerializedName("source")
    val source: Source,
    @SerializedName("title")
    val title: String, // Texas heatwave and energy crunch curtails Bitcoin mining
    @SerializedName("url")
    val url: String, // https://www.theverge.com/2022/7/12/23205066/texas-heat-curtails-bitcoin-mining-energy-demand-electricity-grid
    @SerializedName("urlToImage")
    val urlToImage: String // https://cdn.vox-cdn.com/thumbor/sP9sPjh-2PfK76HRsOfHNYNQWAo=/0x285:4048x2404/fit-in/1200x630/cdn.vox-cdn.com/uploads/chorus_asset/file/23761862/1235927096.jpg
)