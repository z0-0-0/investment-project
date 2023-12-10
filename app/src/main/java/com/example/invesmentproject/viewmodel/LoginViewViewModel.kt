package com.example.invesmentproject.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewViewModel @Inject constructor() : ViewModel() {





    init {
        Log.d(TAG, "init of block LoginViewViewModel")
    }

    companion object {
        const val TAG = "LoginViewViewModel"
    }
}