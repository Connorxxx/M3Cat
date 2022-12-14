package com.connor.m3cat.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.connor.m3cat.R
import com.connor.m3cat.databinding.ActivityTestBinding
import com.connor.m3cat.ks.Data
import com.connor.m3cat.model.MyEvent
import com.connor.m3cat.model.ParcelableModel
import com.connor.m3cat.model.SerializableModel
import com.drake.channel.receiveEvent
import com.drake.channel.sendEvent
import com.drake.engine.base.EngineActivity
import com.drake.serialize.intent.bundle

class TestActivity : EngineActivity<ActivityTestBinding>(R.layout.activity_test) {

    companion object {
        private const val TAG = "TestActivity"
    }

    private val parcelize: ParcelableModel by bundle()
    private val test: Data by bundle()
    private val name: String by bundle()

    override fun initView() {
        binding.v = this
       // parcelableModel = parcelize
       // binding.parcelable = parcelize
       // binding.data = test
        receiveEvent<String> {
            binding.tvTest.text = it
        }
    }

    override fun initData() {

    }

    override fun onClick(v: View) {
        when (v) {
            binding.btnSendToChannel -> {
                sendEvent("Hello")
            }
        }
    }

}