package com.salikh.newsapp.ui.main.favoruity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.salikh.newsapp.core.base.BaseFragment
import com.salikh.newsapp.databinding.FragmentFavourityBinding

class FavoriteFragment : BaseFragment() {

    private var _binding: FragmentFavourityBinding? = null
    private val binding get() = _binding!!

    override fun createView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavourityBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onCreated(savedInstanceState: Bundle?) {


    }

    override fun onViewDestroyed() {


    }
}