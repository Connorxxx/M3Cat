package com.connor.m3cat.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.lifecycleScope
import androidx.viewpager2.widget.ViewPager2
import com.connor.m3cat.R
import com.connor.m3cat.adapter.ViewPagerFragmentStateAdapter
import com.connor.m3cat.databinding.FragmentTabBinding
import com.drake.engine.base.EngineFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class TabFragment : EngineFragment<FragmentTabBinding>(R.layout.fragment_tab) {

    private val TAG = "TabFragment"

    lateinit var adapter: ViewPagerFragmentStateAdapter
    //lateinit var fragments: MutableList<Pair<String, Fragment>>

    override fun initView() {
        binding.v = this
        val fragments = mutableListOf<Pair<String, Fragment>>().apply {
            add(Pair("one", PageFragment()))
            add(Pair("two", PageFragment()))
        }
        adapter = ViewPagerFragmentStateAdapter(
            requireActivity().supportFragmentManager,
            lifecycle,
            fragments
        )
        binding.viewPager.adapter = adapter
        binding.viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Log.d(TAG, "onPageSelected: $position ${fragments.size}")
                if (position == fragments.size - 1) {
                //    binding.viewPager.post {
                        adapter.addFragment(Pair("three", PageFragment()), lifecycleScope)
        //            }
                }
            }
        })
    }

    override fun initData() {
    }

    override fun onClick(v: View) {
        when (v) {
            binding.fab -> {
                Log.d("onClick", "onClick: ")
                adapter.addFragment(Pair("three", PageFragment()))
                adapter.addFragment(Pair("three", PageFragment()))
            }
        }
    }


}