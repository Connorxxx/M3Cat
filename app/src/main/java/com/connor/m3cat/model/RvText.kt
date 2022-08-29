package com.connor.m3cat.model

import com.drake.brv.utils.BRV
import kotlinx.serialization.Serializable

@Serializable
data class RvText(
    val name: String? = "BRV",
    val type: Int? = 1,
)