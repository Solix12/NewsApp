package com.salikh.newsapp.ui.main.home

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.salikh.newsapp.R
import com.salikh.newsapp.core.adapters.HomeAdapter
import com.salikh.newsapp.core.base.BaseFragment
import com.salikh.newsapp.core.helpers.SendDataToVIew
import com.salikh.newsapp.core.models.response.Article
import com.salikh.newsapp.core.models.response.EverythingResponse
import com.salikh.newsapp.databinding.FragmetHomeBinding

class HomeFragment : BaseFragment(), HomeMVP.View, SendDataToVIew {

    private var _binding: FragmetHomeBinding? = null

    private val binding get() = _binding!!

    private lateinit var presenter: HomeMVP.Presenter

    private var adapter: HomeAdapter? = null

    override fun createView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmetHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onCreated(savedInstanceState: Bundle?) {

        presenter = HomePresenter(this)
        presenter.getTeslaData()

        setListeners()
        setColor()

    }

    override fun onViewDestroyed() {

        presenter.cancelRequest()

    }

    override fun setData(data: EverythingResponse) {

        adapter = HomeAdapter(data.articles, this)

        binding.recycleView.adapter = adapter
        binding.recycleView.layoutManager = LinearLayoutManager(context)
        binding.recycleView.setHasFixedSize(true)
        binding.animationView.visibility = GONE

    }

    override fun onError(message: String) {

        showToast(message)

    }

    override fun sendData(data: Article?) {

/*
        startActivity(Intent(context, MainActivity::class.java))
*/

    }

    private fun setColor() {
        binding.tesla.setBackgroundResource(R.drawable.text_bacground)

        binding.apple.setBackgroundResource(R.drawable.text_bacground_border)
        binding.samsung.setBackgroundResource(R.drawable.text_bacground_border)
        binding.gogle.setBackgroundResource(R.drawable.text_bacground_border)
        binding.bitcoin.setBackgroundResource(R.drawable.text_bacground_border)

        binding.tesla.setTextColor(Color.parseColor("#FFFFFF"))

        binding.apple.setTextColor(Color.parseColor("#FF514E"))
        binding.samsung.setTextColor(Color.parseColor("#FF514E"))
        binding.gogle.setTextColor(Color.parseColor("#FF514E"))
        binding.bitcoin.setTextColor(Color.parseColor("#FF514E"))


    }

    private fun setListeners() {

        binding.apple.setOnClickListener {

            adapter?.clearData()
            binding.animationView.visibility = VISIBLE
            presenter.cancelRequest()
            presenter = HomePresenter(this)
            presenter.getAppleData()

            binding.apple.setBackgroundResource(R.drawable.text_bacground)

            binding.tesla.setBackgroundResource(R.drawable.text_bacground_border)
            binding.samsung.setBackgroundResource(R.drawable.text_bacground_border)
            binding.gogle.setBackgroundResource(R.drawable.text_bacground_border)
            binding.bitcoin.setBackgroundResource(R.drawable.text_bacground_border)

            binding.apple.setTextColor(Color.parseColor("#FFFFFF"))

            binding.tesla.setTextColor(Color.parseColor("#FF514E"))
            binding.samsung.setTextColor(Color.parseColor("#FF514E"))
            binding.gogle.setTextColor(Color.parseColor("#FF514E"))
            binding.bitcoin.setTextColor(Color.parseColor("#FF514E"))


        }
        binding.tesla.setOnClickListener {

            adapter?.clearData()
            binding.animationView.visibility = VISIBLE
            presenter.cancelRequest()
            presenter = HomePresenter(this)
            presenter.getTeslaData()

            binding.tesla.setBackgroundResource(R.drawable.text_bacground)

            binding.apple.setBackgroundResource(R.drawable.text_bacground_border)
            binding.samsung.setBackgroundResource(R.drawable.text_bacground_border)
            binding.gogle.setBackgroundResource(R.drawable.text_bacground_border)
            binding.bitcoin.setBackgroundResource(R.drawable.text_bacground_border)

            binding.tesla.setTextColor(Color.parseColor("#FFFFFF"))

            binding.apple.setTextColor(Color.parseColor("#FF514E"))
            binding.samsung.setTextColor(Color.parseColor("#FF514E"))
            binding.gogle.setTextColor(Color.parseColor("#FF514E"))
            binding.bitcoin.setTextColor(Color.parseColor("#FF514E"))


        }
        binding.samsung.setOnClickListener {

            adapter?.clearData()
            binding.animationView.visibility = VISIBLE
            presenter.cancelRequest()
            presenter = HomePresenter(this)
            presenter.getSamsungData()

            binding.samsung.setBackgroundResource(R.drawable.text_bacground)

            binding.apple.setBackgroundResource(R.drawable.text_bacground_border)
            binding.tesla.setBackgroundResource(R.drawable.text_bacground_border)
            binding.gogle.setBackgroundResource(R.drawable.text_bacground_border)
            binding.bitcoin.setBackgroundResource(R.drawable.text_bacground_border)

            binding.samsung.setTextColor(Color.parseColor("#FFFFFF"))

            binding.apple.setTextColor(Color.parseColor("#FF514E"))
            binding.tesla.setTextColor(Color.parseColor("#FF514E"))
            binding.gogle.setTextColor(Color.parseColor("#FF514E"))
            binding.bitcoin.setTextColor(Color.parseColor("#FF514E"))


        }
        binding.gogle.setOnClickListener {

            adapter?.clearData()
            binding.animationView.visibility = VISIBLE
            presenter.cancelRequest()
            presenter = HomePresenter(this)
            presenter.getGoogleData()

            binding.gogle.setBackgroundResource(R.drawable.text_bacground)

            binding.apple.setBackgroundResource(R.drawable.text_bacground_border)
            binding.tesla.setBackgroundResource(R.drawable.text_bacground_border)
            binding.samsung.setBackgroundResource(R.drawable.text_bacground_border)
            binding.bitcoin.setBackgroundResource(R.drawable.text_bacground_border)

            binding.gogle.setTextColor(Color.parseColor("#FFFFFF"))

            binding.apple.setTextColor(Color.parseColor("#FF514E"))
            binding.tesla.setTextColor(Color.parseColor("#FF514E"))
            binding.samsung.setTextColor(Color.parseColor("#FF514E"))
            binding.bitcoin.setTextColor(Color.parseColor("#FF514E"))


        }
        binding.bitcoin.setOnClickListener {

            adapter?.clearData()
            binding.animationView.visibility = VISIBLE
            presenter.cancelRequest()
            presenter = HomePresenter(this)
            presenter.getBitcoinData()

            binding.bitcoin.setBackgroundResource(R.drawable.text_bacground)

            binding.apple.setBackgroundResource(R.drawable.text_bacground_border)
            binding.tesla.setBackgroundResource(R.drawable.text_bacground_border)
            binding.samsung.setBackgroundResource(R.drawable.text_bacground_border)
            binding.gogle.setBackgroundResource(R.drawable.text_bacground_border)

            binding.bitcoin.setTextColor(Color.parseColor("#FFFFFF"))

            binding.apple.setTextColor(Color.parseColor("#FF514E"))
            binding.tesla.setTextColor(Color.parseColor("#FF514E"))
            binding.samsung.setTextColor(Color.parseColor("#FF514E"))
            binding.gogle.setTextColor(Color.parseColor("#FF514E"))


        }

    }

    private fun showToast(message: String) {

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

    }

}