package com.example.invesmentproject.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingsViewViewModel @Inject constructor() : ViewModel(){







    init {
        Log.d(TAG,"init of block SettingsViewViewModel")
    }

    companion object{
        const val TAG = "SettingsViewViewModel"
    }
}