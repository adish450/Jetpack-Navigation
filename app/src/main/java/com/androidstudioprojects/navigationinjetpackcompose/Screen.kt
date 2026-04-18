package com.androidstudioprojects.navigationinjetpackcompose

sealed class Screen (val name: String) {
    object MainScreen : Screen("main_screen")
    object DetailsScreen : Screen("details_screen")
}