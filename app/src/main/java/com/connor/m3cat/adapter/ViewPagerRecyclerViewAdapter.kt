package com.connor.m3cat.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.connor.m3cat.R
import com.connor.m3cat.databinding.ItemPageBinding

class ViewPagerRecyclerViewAdapter :
    RecyclerView.Adapter<ViewPagerRecyclerViewAdapter.ViewHolder>() {

    private val colors = intArrayOf(
        android.R.color.black,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple
    )

        inner class ViewHolder(private val binding: ItemPageBinding) :
            RecyclerView.ViewHolder(binding.root) {
            fun getBinding(): ItemPageBinding {
                return binding
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemPageBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_page,
            parent,
            false
        )
        val holder = ViewHolder(binding)
        return holder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.getBinding().container.setBackgroundResource(colors[position])
    }

    override fun getItemCount() = colors.size
}