package com.example.invesmentproject.navigation

// Screens import
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.invesmentproject.view.HomeView
import com.example.invesmentproject.view.LoginView
import com.example.invesmentproject.view.OnboardingView
import com.example.invesmentproject.view.SettingsView

@Composable
fun NavGraph(navController: NavHostController, startDestination: String) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    )
    {
        composable(route = Screens.Login.route) {
            LoginView(navController)
        }
        composable(route = Screens.Home.route) {
            HomeView(navController)
        }
        composable(route = Screens.Settings.route) {
            SettingsView(navController)
        }
        composable(route = Screens.Onboarding.route) {
            OnboardingView(navController)
        }
    }
}