package com.example.invesmentproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

// Screens import
import com.example.invesmentproject.view.HomeScreen
import com.example.invesmentproject.view.LoginScreen
import com.example.invesmentproject.view.OnboardingScreen
import com.example.invesmentproject.view.SettingsScreen

@Composable
    fun NavGraph(navController: NavHostController) {
        NavHost(
            navController = navController,
            startDestination = Screens.Home.route
        )
        {
            composable(route = Screens.Login.route) {
                LoginScreen(navController)
            }
            composable(route = Screens.Home.route) {
                HomeScreen(navController)
            }
            composable(route = Screens.Settings.route){
                SettingsScreen(navController)
            }
            composable(route = Screens.Onboarding.route){
                OnboardingScreen(navController)
            }
        }
    }