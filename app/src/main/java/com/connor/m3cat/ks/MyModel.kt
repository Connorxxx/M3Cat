package com.connor.m3cat.ks

import kotlinx.serialization.Serializable

@Serializable
data class NetTest(
    var data: List<Data>,
    var errorCode: Int,
    var errorMsg: String
) {
    @Serializable
    data class Data(
        var desc: String,
        var id: Int,
        var imagePath: String,
        var isVisible: Int,
        var order: Int,
        var title: String,
        var type: Int,
        var url: String
    )
}