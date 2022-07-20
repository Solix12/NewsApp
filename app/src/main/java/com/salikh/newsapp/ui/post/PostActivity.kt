package com.salikh.newsapp.ui.post

import android.os.Bundle
import android.util.Log
import android.view.View
import com.salikh.newsapp.core.base.BaseActivity
import com.salikh.newsapp.databinding.ActivityPostBinding

class PostActivity : BaseActivity() {


    private var _binding: ActivityPostBinding? = null
    private val binding get() = _binding!!

    override fun getView(): View {
        _binding = ActivityPostBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onCreated(savedInstanceState: Bundle?) {

        val title = intent.getStringExtra("title")
        val image = intent.getStringExtra("image")

        Log.d("TAGaaa", title.toString())

    }

}