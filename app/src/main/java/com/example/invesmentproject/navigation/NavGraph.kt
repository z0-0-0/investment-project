package com.example.invesmentproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.invesmentproject.view.HomeScreen
import com.example.invesmentproject.view.LoginScreen

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
        }
    }