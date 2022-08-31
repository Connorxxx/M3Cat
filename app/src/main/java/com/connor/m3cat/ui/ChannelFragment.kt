package com.connor.m3cat.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.connor.m3cat.R
import com.connor.m3cat.databinding.FragmentChannelBinding
import com.connor.m3cat.model.MyEvent
import com.drake.channel.receiveEvent
import com.drake.channel.sendEvent
import com.drake.engine.base.EngineFragment

class ChannelFragment : EngineFragment<FragmentChannelBinding>(R.layout.fragment_channel) {

    private val TAG = "ChannelFragment"

    private val model = MyEvent()

    override fun initView() {
        binding.m = model
        binding.v = this
        receiveEvent<String> {
            binding.tvRecTag.text = it
        }
    }

    override fun initData() {

    }

    override fun onClick(v: View) {
        when (v) {
            binding.btnSendEven -> {
                sendEvent(MyEvent("刘强东", 32))
                sendEvent("Test")
            }
            binding.btnOpen -> {
                activity?.startActivity(Intent(activity, TestActivity::class.java))
            }
        }
    }

}