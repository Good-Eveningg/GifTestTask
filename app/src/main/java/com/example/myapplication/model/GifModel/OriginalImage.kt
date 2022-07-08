package com.example.myapplication.model.GifModel

import com.google.gson.annotations.SerializedName

data class OriginalImage(
    @SerializedName("original")
    val imageUrl: ImageUrl
)
