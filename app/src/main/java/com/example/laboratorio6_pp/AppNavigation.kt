package com.example.laboratorio6_pp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.InputScreen.route) {
        composable(route = AppScreens.InputScreen.route) {
            InputScreen(navController)
        }
    }
}