package com.connor.m3cat.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.lifecycleScope
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ViewPagerFragmentStateAdapter(
    fm: FragmentManager,
    lifecycle: Lifecycle,
    private val fragmentList: MutableList<Pair<String, Fragment>>,
) : FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount() = fragmentList.size

    override fun createFragment(position: Int) = fragmentList[position].second

    override fun onBindViewHolder(
        holder: FragmentViewHolder,
        position: Int,
        payloads: MutableList<Any>
    ) {
        super.onBindViewHolder(holder, position, payloads)
    }

    fun addFragment(fragment: Pair<String, Fragment>, lifecycle: LifecycleCoroutineScope? = null) {
        lifecycle?.launch(Dispatchers.Default) {
            fragmentList.add(fragment)
            withContext(Dispatchers.Main) {
                notifyItemInserted(fragmentList.size - 1)
            }
        }
    }

}