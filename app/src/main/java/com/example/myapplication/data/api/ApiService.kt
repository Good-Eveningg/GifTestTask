package com.example.myapplication.data.api


import com.example.myapplication.model.GifModel.Gif
import com.example.myapplication.model.GifModel.GifImageData
import retrofit2.Response

import retrofit2.http.GET

interface ApiService {
    @GET("gifs/trending?api_key=owgYsaWNX514qAc7TAgZGGiTCARglEm7&q=&limit=25&offset=0&rating=g&lang=en")
    suspend fun getGifs(): Response<Gif>
}