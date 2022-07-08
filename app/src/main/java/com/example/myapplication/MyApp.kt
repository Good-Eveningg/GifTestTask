package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.viewModel
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(viewModel)
        }
    }

}