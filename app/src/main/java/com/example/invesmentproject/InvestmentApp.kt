package com.example.invesmentproject

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class InvestmentApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Inside_onCreate")
    }

    companion object {
        const val TAG = "InvestmentApp"
    }
}