package com.example.myapplication.data.repository

import com.example.myapplication.data.api.RetrofitInstance
import com.example.myapplication.model.GifModel.Gif

import retrofit2.Response


class Repository {

    suspend fun getGif(): Response<Gif> {
        return RetrofitInstance.api.getGifs()
    }

}