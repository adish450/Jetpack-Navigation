package com.androidstudioprojects.navigationinjetpackcompose

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.MainScreen.name,
        route = HOME_ROUTE
    ) {
        composable(
            route = Screen.MainScreen.name
        ) {
            MainScreen(navController)
        }

        composable(
            route = Screen.DetailsScreen.name,
            arguments = listOf(
                navArgument(name = ARGUMENT_KEY) {
                    type = NavType.IntType
                    defaultValue = 23
                },
                navArgument(name = ARGUMENT_KEY_2) {
                    type = NavType.StringType
                    defaultValue = "adassd"
                }
            )
        ) {
            Log.d("SetupNavGraph: ", it.arguments?.getInt(ARGUMENT_KEY).toString())
            Log.d("SetupNavGraph: ", it.arguments?.getString(ARGUMENT_KEY_2).toString())
            DetailsScreen(navController)
        }
    }
}