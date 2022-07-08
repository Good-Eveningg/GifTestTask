package com.example.myapplication.screens.detailedfragment

import android.content.Context
import android.widget.ImageView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.Glide
import kotlinx.coroutines.launch

class DetailedFragmentViewModel : ViewModel() {
    fun setGif(context: Context, url: String, imageView: ImageView) {
        viewModelScope.launch {
            Glide.with(context).load(url).into(imageView)
        }
    }
}