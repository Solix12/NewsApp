package com.salikh.newsapp.core.network.servises

import com.salikh.newsapp.core.models.response.EverythingResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET

interface HomeService {

    //1
    @GET("v2/everything?q=bitcoin&apiKey=13569214edf4403a8ccfc6ad93ad6b04")
    fun getBitcoin(): Single<Response<EverythingResponse>>

    //2
    @GET("v2/everything?q=tesla&apiKey=13569214edf4403a8ccfc6ad93ad6b04")
    fun getTesla(): Single<Response<EverythingResponse>>

    //3
    @GET("v2/everything?q=apple&apiKey=13569214edf4403a8ccfc6ad93ad6b04")
    fun getApple(): Single<Response<EverythingResponse>>

    //4
    @GET("v2/everything?q=samsung&apiKey=13569214edf4403a8ccfc6ad93ad6b04")
    fun getSamsung(): Single<Response<EverythingResponse>>

    //5
    @GET("v2/everything?q=google&apiKey=13569214edf4403a8ccfc6ad93ad6b04")
    fun getGoogle(): Single<Response<EverythingResponse>>


}