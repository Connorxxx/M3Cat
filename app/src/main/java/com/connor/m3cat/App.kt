package com.connor.m3cat

import android.app.Application
import com.drake.brv.utils.BRV

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        //BRV.modelId = BR.m
        BRV.modelId = BR.m
    }
}