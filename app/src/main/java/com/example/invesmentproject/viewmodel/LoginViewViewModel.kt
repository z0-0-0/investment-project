package com.example.invesmentproject.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.invesmentproject.brockerage.RabbitSender
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject


@HiltViewModel
class LoginViewViewModel @Inject constructor() : ViewModel() {
    init {
        Log.d(TAG, "init of block LoginViewViewModel")
    }

    fun sendAuthRabbit() {
        RabbitSender.sendAuth(login.value.toString(), password.value.toString())
    }

    fun sendAuth() {
        TODO("Not yet implemented")
    }

    var login = MutableStateFlow<String>("Login")
    var password = MutableStateFlow<String>("Password")


    companion object {
        const val TAG = "LoginViewViewModel"
    }
}