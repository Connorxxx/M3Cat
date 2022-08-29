package com.connor.m3cat.ui

import android.view.View
import com.connor.m3cat.R
import com.connor.m3cat.databinding.FragmentSerializeBinding
import com.connor.m3cat.model.Model
import com.connor.m3cat.model.ParcelableModel
import com.connor.m3cat.model.SerializableModel
import com.drake.engine.base.EngineFragment
import com.drake.serialize.intent.openActivity
import com.drake.serialize.serialize.serial
import com.drake.serialize.serialize.serialLazy

class SerializeFragment : EngineFragment<FragmentSerializeBinding>(R.layout.fragment_serialize) {

    private val model = Model()
    private val serializableModel = SerializableModel()
    private var name: Model by serial()
    private var serializable: SerializableModel by serialLazy()

    private val parcelize = ParcelableModel()


    override fun initView() {
        binding.v = this
        binding.m = model
        binding.serializable = serializableModel
    }

    override fun initData() {
        model.name = "model"
        name = model

        serializableModel.name = "SerializableModel"
        serializable = serializableModel
        parcelize.name = "吴彦祖"
    }

    override fun onClick(v: View) {
        when (v) {
            binding.btnSend -> {
                    openActivity<TestActivity>(
                    "parcelize" to parcelize,
                    "parcelizeList" to listOf(ParcelableModel()),
                    "serialize" to SerializableModel(),
                    "serializeList" to listOf(SerializableModel()),
                    "intArray" to intArrayOf(1, 2, 3)
                )
            }
        }
    }

}
