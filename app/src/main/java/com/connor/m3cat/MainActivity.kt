package com.connor.m3cat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.connor.m3cat.databinding.ActivityMainBinding
import com.connor.m3cat.ui.HomeFragment
import com.connor.m3cat.ui.NetKSFragment
import com.drake.engine.base.EngineActivity

class MainActivity : EngineActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val TAG = "ActivityMainBinding"

    lateinit var navController: NavController

    override fun initView() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav) as NavHostFragment
        navController = navHostFragment.navController
    }

    override fun initData() {

    }

    override fun onBackPressed() {
        if (!isActiveFragment(HomeFragment::class.java))
            super.onBackPressed()
        else finishTransition()
    }

    fun <F : Fragment> isActiveFragment(fragmentClass: Class<F>): Boolean {
        val navHostFragment = this.supportFragmentManager.fragments.first() as NavHostFragment
        navHostFragment.childFragmentManager.fragments.forEach {
            if (fragmentClass.isAssignableFrom(it.javaClass)) {
                return true
            }
        }
        return false
    }

}