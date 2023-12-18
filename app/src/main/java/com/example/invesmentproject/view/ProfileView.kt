package com.example.invesmentproject.view

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController


@Composable
fun ProfileView(
    navController: NavController,
    viewModel: ViewModel = hiltViewModel()
) {
    Text("Profile")
}
