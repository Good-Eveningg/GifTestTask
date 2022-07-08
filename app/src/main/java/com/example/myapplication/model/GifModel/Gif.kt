package com.example.myapplication.model.GifModel

import com.google.gson.annotations.SerializedName


data class Gif(
    @SerializedName("data")
    val gifImageList: List<GifImageData>
)
