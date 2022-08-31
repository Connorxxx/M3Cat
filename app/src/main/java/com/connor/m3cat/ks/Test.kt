package com.connor.m3cat.ks

import com.connor.m3cat.model.RvText
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class Data(var name:String = "", var age:Int = 0)

fun main() {
    val data = Data("ks", 1)

    val list = ArrayList<ImgModel>()
    val imgModel = ImgModel("test", 22, 45)
    val imgModel2 = ImgModel("name", 77, 99)
    list.add(imgModel)
    list.add(imgModel2)
    println(Json.encodeToString(getData()))
}

fun getData() =
    mutableListOf<ImgModel>(
        ImgModel("test", 22, 33),
        ImgModel("name", 44, 54),
        ImgModel("ks", 234, 534),
        ImgModel("gson", 256, 53),
    )