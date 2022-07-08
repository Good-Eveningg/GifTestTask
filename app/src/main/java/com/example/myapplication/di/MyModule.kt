package com.example.myapplication.di

import com.example.myapplication.screens.detailedfragment.DetailedFragmentViewModel
import com.example.myapplication.screens.start.StartViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModel = module {
    viewModel { StartViewModel() }
    viewModel { DetailedFragmentViewModel() }
}