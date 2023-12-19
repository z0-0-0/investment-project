package com.example.invesmentproject

import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.invesmentproject.navigation.NavGraph
import com.example.invesmentproject.navigation.Screens
import com.example.invesmentproject.ui.theme.InvesmentAppTheme
import dagger.hilt.android.AndroidEntryPoint

val PREFS_FILENAME = "com.example.invesmentproject.prefs"

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private var startDestination: String = Screens.Home.route
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val prefs = this.getSharedPreferences(PREFS_FILENAME, MODE_PRIVATE)
        if(checkFirstOpen(prefs = prefs)){
             startDestination = Screens.Onboarding.route
        }
        setContent {
            InvesmentAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    val navController = rememberNavController()
                    NavGraph(navController = navController, startDestination = startDestination)
                }
            }
        }
    }
}

private fun checkFirstOpen(prefs: SharedPreferences, ): Boolean {
    val isFirstRun: Boolean = prefs.getBoolean("isFirstRun", true)
    if (isFirstRun) {
        prefs.edit().putBoolean(
            "isFirstRun",
            false
        ).apply()
        return true
    }
   return false
}