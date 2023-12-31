package com.example.invesmentproject.navigation

sealed class Screens(val route: String) {
    object Login : Screens("login_screen")
    object Home : Screens("home_screen")
    object Settings : Screens("settings_screen")
    object Profile : Screens("profile_screen")
    object Onboarding : Screens("onboarding_screen")
}