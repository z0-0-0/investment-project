package com.example.invesmentproject.view

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.invesmentproject.viewmodel.LoginViewViewModel

@Composable
fun LoginView(
    navController: NavController,
    viewModel: LoginViewViewModel = hiltViewModel()
) {
    Text("Login")
}