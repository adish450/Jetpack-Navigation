package com.androidstudioprojects.navigationinjetpackcompose

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavArgument
import androidx.navigation.NavArgumentBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

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