package com.connor.m3cat.ui

import com.connor.m3cat.R
import com.connor.m3cat.converter.SerializationConverter
import com.connor.m3cat.databinding.FragmentNetKSBinding
import com.connor.m3cat.model.*
import com.drake.engine.base.EngineFragment
import com.drake.net.Get
import com.drake.net.utils.scopeNetLife

class NetKSFragment : EngineFragment<FragmentNetKSBinding>(R.layout.fragment_net_k_s) {

    override fun initView() {
        scopeNetLife {
            val data = Get<List<DatamuseModel>>("https://api.datamuse.com/words?ml=ringing+in+the+ears&max=4") {

            }.await()
            binding.tvString.text = data[0].word
        }

    }

    override fun initData() {

    }
}