package com.salikh.newsapp.ui.main

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.salikh.newsapp.R
import com.salikh.newsapp.core.base.BaseActivity
import com.salikh.newsapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun getView(): View {

        _binding = ActivityMainBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onCreated(savedInstanceState: Bundle?) {

        setNavigation()
        setBars()

    }


    private fun setNavigation() {

        val navigationComponent = findNavController(R.id.main_nav_fragment)

        binding.bottomNavigation.setupWithNavController(navigationComponent)

    }


    private fun setBars() {
        window.statusBarColor = Color.WHITE
        window.navigationBarColor = Color.WHITE
    }


}



