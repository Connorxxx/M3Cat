package com.connor.m3cat.ui

import android.util.Log
import androidx.navigation.fragment.findNavController
import com.connor.m3cat.R
import com.connor.m3cat.databinding.FragmentHomeBinding
import com.connor.m3cat.model.RvText
import com.connor.m3cat.model.SimpleModel
import com.drake.brv.utils.models
import com.drake.brv.utils.setup
import com.drake.engine.base.EngineFragment
import com.google.android.material.tabs.TabLayout

class HomeFragment : EngineFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private val TAG = "HomeFragment"

    private val model = SimpleModel()

    override fun initView() {
        binding.m = model
        binding.v = this
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> Log.d(TAG, "onTabSelected: M")
                    1 -> Log.d(TAG, "onTabSelected: Tue")
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }


        })
        binding.rv.setup {
            addType<RvText>(R.layout.item_home)
            onClick(R.id.item_tv) {
                when (bindingAdapterPosition) {
                    0 -> findNavController().navigate(R.id.action_homeFragment_to_tabFragment)
                    1 -> findNavController().navigate(R.id.action_homeFragment_to_rvViewPageFragment)
                    2 -> findNavController().navigate(R.id.action_homeFragment_to_netKSFragment)
                    3 -> findNavController().navigate(R.id.action_homeFragment_to_serializeFragment)
                }
            }
        }
    }

    override fun initData() {
        binding.rv.models = model.getData()
    }


}