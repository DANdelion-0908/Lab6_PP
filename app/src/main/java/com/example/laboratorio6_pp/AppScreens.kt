package com.example.laboratorio6_pp

sealed class AppScreens (val route: String) {
    object InputScreen: AppScreens("input_screen")
}