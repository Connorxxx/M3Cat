package com.connor.m3cat.ks

import com.connor.m3cat.model.RvText
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class Data(var name:String = "", var age:Int = 0)

fun main() {
    val data = Data("ks", 1)
    println(Json.encodeToString(data))
}