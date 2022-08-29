package com.connor.m3cat.ui

import com.connor.m3cat.R
import com.connor.m3cat.adapter.ViewPagerRecyclerViewAdapter
import com.connor.m3cat.databinding.FragmentRvViewPageBinding
import com.drake.engine.base.EngineFragment

class RvViewPageFragment : EngineFragment<FragmentRvViewPageBinding>(R.layout.fragment_rv_view_page) {

    override fun initView() {

        binding.viewPager.adapter = ViewPagerRecyclerViewAdapter()
//        requireActivity().onBackPressedDispatcher.addCallback(this) {
//            findNavController().popBackStack()
//        }

    }

    override fun initData() {

    }

}