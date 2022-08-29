package com.connor.m3cat.ui

import com.connor.m3cat.R
import com.connor.m3cat.databinding.FragmentPageBinding
import com.drake.engine.base.EngineFragment

class PageFragment : EngineFragment<FragmentPageBinding>(R.layout.fragment_page) {

    override fun initView() {
        val colors = listOf<Int>(
            R.color.black,
            R.color.crane_theme_dark_error,
            R.color.shrine_theme_dark_surfaceVariant,
            R.color.fortnightly_theme_light_primary,
            R.color.fortnightly_theme_light_tertiary,
            R.color.crane_theme_light_surfaceTint,
            R.color.shrine_theme_dark_surfaceTint
        )
        val tvText = (0..5566).random()

        binding.container.setBackgroundColor(resources.getColor(colors.random()))
        binding.tv.text = tvText.toString()

    }

    override fun initData() {

    }
}