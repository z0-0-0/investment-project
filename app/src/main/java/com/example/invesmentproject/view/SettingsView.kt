package com.example.invesmentproject.view

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.invesmentproject.viewmodel.SettingsViewViewModel

@Composable
fun SettingsScreen(navController: NavController,
                   viewModel:SettingsViewViewModel = hiltViewModel()
) {
    Text("Settings")
}