package com.connor.m3cat.model

import kotlinx.serialization.Serializable

@Serializable
data class DatamuseModel(
    var score: Int,
    var tags: List<String>,
    var word: String
)
