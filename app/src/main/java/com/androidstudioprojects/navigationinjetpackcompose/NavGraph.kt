package com.androidstudioprojects.navigationinjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.MainScreen.name
    ) {
        composable(
            route = Screen.MainScreen.name
        ) {
            MainScreen(navController)
        }
        composable(
            route = Screen.DetailsScreen.name
        ) {
            DetailsScreen(navController)
        }
    }
}