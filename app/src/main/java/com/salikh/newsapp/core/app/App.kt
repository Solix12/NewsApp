package com.salikh.newsapp.core.app

import android.app.Application


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
        /*AppCache.init(this)*/
    }

    companion object {
        var instance: Application? = null
            private set
    }

}