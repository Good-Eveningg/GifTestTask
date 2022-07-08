package com.example.myapplication.screens.detailedfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.data.GIF_KEY
import com.example.myapplication.di.viewModel
import com.example.myapplication.model.GifModel.Gif
import com.example.myapplication.model.GifModel.GifImageData
import com.example.myapplication.screens.start.StartViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class DetailedFragment : Fragment() {

    lateinit var currentGif: String
    private val detailedViewModel by viewModel<DetailedFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_detailed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageView: ImageView = view.findViewById(R.id.gifView)
        currentGif = arguments?.getString(GIF_KEY).toString()
        context?.let { detailedViewModel.setGif(it, currentGif, imageView) }
    }

}