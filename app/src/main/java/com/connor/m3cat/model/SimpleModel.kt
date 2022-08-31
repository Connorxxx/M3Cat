package com.connor.m3cat.model

import androidx.databinding.BaseObservable

class SimpleModel() : BaseObservable() {

    var text: String = ""
        set(value) {
            field = value
            notifyChange()
        }

    //fun getType() = listOf(RvText(text))

//    fun getType(): Int {
//        return listOf<>()
//    }

    fun getData(): MutableList<RvText> {
        return mutableListOf<RvText>(
            RvText("ViewPage with FragmentState", 0),
            RvText("ViewPage with RecyclerView", 1),
            RvText("Net with ks", 2),
            RvText("Serialize", 3),
            RvText("Channel", 4)
        )
    }

}