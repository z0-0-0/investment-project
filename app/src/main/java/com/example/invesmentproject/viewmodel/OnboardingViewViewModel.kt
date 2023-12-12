package com.example.invesmentproject.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class OnboardingViewViewModel @Inject constructor() : ViewModel() {
//    var uiState by mutableStateOf(OnboardingUiState())
//    private set



    init {
        Log.d(TAG, "init of block OnboardingViewViewModel")
    }

    companion object {
        const val TAG = "OnboardingViewViewModel"
    }
}