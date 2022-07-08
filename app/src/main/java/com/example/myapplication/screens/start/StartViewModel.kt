package com.example.myapplication.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.repository.Repository
import com.example.myapplication.model.GifModel.GifImageData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class StartViewModel : ViewModel() {

    var repo = Repository()
    val myGifList: MutableLiveData<List<GifImageData>> = MutableLiveData()

    fun getGifs() {
        viewModelScope.launch(Dispatchers.IO) {
            myGifList.postValue(
                repo.getGif().body()?.gifImageList
            )
        }
    }

}