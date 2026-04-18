package com.androidstudioprojects.navigationinjetpackcompose

const val ARGUMENT_KEY = "id"

sealed class Screen (val name: String) {
    object MainScreen : Screen("main_screen")
    object DetailsScreen : Screen("details_screen/{$ARGUMENT_KEY}") {
        fun getId(id: Int): String {
            return this.name.replace(oldValue = "{$ARGUMENT_KEY}", newValue = id.toString())
        }
    }
}