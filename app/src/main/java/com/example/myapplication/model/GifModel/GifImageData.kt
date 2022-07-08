package com.example.myapplication.model.GifModel

import com.google.gson.annotations.SerializedName


data class GifImageData(
    @SerializedName("images")
    val originalImage: OriginalImage
)
