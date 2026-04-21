package com.androidstudioprojects.navigationinjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Login.name,
        route = AUTH_ROUTE
    ) {
        composable(
            route = Screen.Login.name
        ) {
            LoginScreen(navController)
        }

        composable(
            route = Screen.Signup.name
        ) {
            SignupScreen(navController)
        }
    }
}