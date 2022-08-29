package com.connor.m3cat.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.connor.m3cat.R
import com.connor.m3cat.databinding.ActivityTestBinding
import com.connor.m3cat.model.ParcelableModel
import com.connor.m3cat.model.SerializableModel
import com.drake.engine.base.EngineActivity
import com.drake.serialize.intent.bundle

class TestActivity : EngineActivity<ActivityTestBinding>(R.layout.activity_test) {

    private var parcelableModel = ParcelableModel()

    private val parcelize: ParcelableModel by bundle()
    private val name: String by bundle()

    override fun initView() {
       // parcelableModel = parcelize
        binding.parcelable = parcelize
    }

    override fun initData() {

    }

}