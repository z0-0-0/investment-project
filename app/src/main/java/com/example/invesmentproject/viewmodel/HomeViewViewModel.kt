package com.example.invesmentproject.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewViewModel @Inject constructor() : ViewModel() {


    init {
        Log.d(TAG, "init of block HomeViewViewModel")
    }

    companion object {
        const val TAG = "HomeViewViewModel"
    }
}