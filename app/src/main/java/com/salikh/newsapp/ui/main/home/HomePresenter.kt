package com.salikh.newsapp.ui.main.home

import com.salikh.newsapp.core.models.response.EverythingResponse
import com.salikh.newsapp.core.network.ApiClientModule
import com.salikh.newsapp.core.network.servises.HomeService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Response

class HomePresenter(val view: HomeMVP.View) : HomeMVP.Presenter {

    lateinit var homeService: HomeService

    init {
        homeService = ApiClientModule.getHomeService()
    }

    private var compositeDisposable = CompositeDisposable()

    override fun getTeslaData() {

        val disposable = homeService.getTesla()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<Response<EverythingResponse>>() {
                override fun onSuccess(t: Response<EverythingResponse>) {

                    if (t.isSuccessful) {
                        t.body()?.let { view.setData(it) }
                    } else {
                        view.onError(t.message() + " T")
                    }

                }

                override fun onError(e: Throwable) {
                    view.onError(e.message.toString() + " E")
                }


            })

        compositeDisposable.add(disposable)

    }

    override fun getAppleData() {

        val disposable = homeService.getApple()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<Response<EverythingResponse>>() {
                override fun onSuccess(t: Response<EverythingResponse>) {

                    if (t.isSuccessful) {
                        t.body()?.let { view.setData(it) }
                    } else {
                        view.onError(t.message() + " T")
                    }

                }

                override fun onError(e: Throwable) {
                    view.onError(e.message.toString() + " E")
                }


            })

        compositeDisposable.add(disposable)


    }

    override fun getBitcoinData() {

        val disposable = homeService.getBitcoin()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<Response<EverythingResponse>>() {
                override fun onSuccess(t: Response<EverythingResponse>) {

                    if (t.isSuccessful) {
                        t.body()?.let { view.setData(it) }
                    } else {
                        view.onError(t.message() + " T")
                    }

                }

                override fun onError(e: Throwable) {
                    view.onError(e.message.toString() + " E")
                }

            })

        compositeDisposable.add(disposable)

    }

    override fun getSamsungData() {

        val disposable = homeService.getSamsung()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<Response<EverythingResponse>>() {
                override fun onSuccess(t: Response<EverythingResponse>) {

                    if (t.isSuccessful) {
                        t.body()?.let { view.setData(it) }
                    } else {
                        view.onError(t.message() + " T")
                    }

                }

                override fun onError(e: Throwable) {
                    view.onError(e.message.toString() + " E")
                }


            })

        compositeDisposable.add(disposable)

    }

    override fun getGoogleData() {

        val disposable = homeService.getGoogle()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<Response<EverythingResponse>>() {
                override fun onSuccess(t: Response<EverythingResponse>) {

                    if (t.isSuccessful) {
                        t.body()?.let { view.setData(it) }
                    } else {
                        view.onError(t.message() + " T")
                    }
                }

                override fun onError(e: Throwable) {
                    view.onError(e.message.toString() + " E")
                }


            })


        compositeDisposable.add(disposable)

    }

    override fun cancelRequest() {

        compositeDisposable.dispose()

    }

}