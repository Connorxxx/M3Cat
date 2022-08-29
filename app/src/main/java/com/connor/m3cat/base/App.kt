package com.connor.m3cat.base

import android.app.Application
import com.chuckerteam.chucker.api.ChuckerCollector
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.drake.net.BuildConfig
import com.drake.net.NetConfig
import com.drake.net.cookie.PersistentCookieJar
import com.drake.net.interceptor.LogRecordInterceptor
import com.drake.net.okhttp.setDebug
import com.tencent.mmkv.MMKV
import okhttp3.Cache
import java.util.concurrent.TimeUnit

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        MMKV.initialize(this)

        //Net
        NetConfig.initialize("https://www.wanandroid.com/", this) {

            connectTimeout(30, TimeUnit.SECONDS)
            readTimeout(30, TimeUnit.SECONDS)
            writeTimeout(30, TimeUnit.SECONDS)

            cache(Cache(cacheDir, 1024 * 1204 * 128))

            setDebug(BuildConfig.DEBUG)

            addInterceptor(LogRecordInterceptor(BuildConfig.DEBUG))

            cookieJar(PersistentCookieJar(this@App))

            // 通知栏监听网络日志
            if (BuildConfig.DEBUG) {
                addInterceptor(
                    ChuckerInterceptor.Builder(this@App)
                        .collector(ChuckerCollector(this@App))
                        .maxContentLength(250000L)
                        .redactHeaders(emptySet())
                        .alwaysReadResponseBody(false)
                        .build()
                )
            }

        }
    }
}