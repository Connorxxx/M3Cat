package com.connor.m3cat.ks

import kotlinx.serialization.Serializable

@Serializable
data class ImgModel(
    val name: String = "ImageName",
    val width: Int = 0,
    val height: Int = 0,
)