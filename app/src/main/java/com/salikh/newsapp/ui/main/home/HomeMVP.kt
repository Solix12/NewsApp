package com.salikh.newsapp.ui.main.home

import com.salikh.newsapp.core.models.response.EverythingResponse

interface HomeMVP {

    interface View {

        fun setData(data: EverythingResponse)
        fun onError(message: String)

    }

    interface Presenter {

        fun getTeslaData()
        fun getAppleData()
        fun getBitcoinData()
        fun getSamsungData()
        fun getGoogleData()
        fun cancelRequest()

    }

}