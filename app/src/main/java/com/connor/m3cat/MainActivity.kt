package com.connor.m3cat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.connor.m3cat.databinding.ActivityMainBinding
import com.drake.engine.base.EngineActivity

class MainActivity : EngineActivity<ActivityMainBinding>(R.layout.activity_main) {
    lateinit var navController: NavController

    override fun initView() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav) as NavHostFragment
        navController = navHostFragment.navController
    }

    override fun initData() {

    }

}