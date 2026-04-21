package com.androidstudioprojects.navigationinjetpackcompose

const val ARGUMENT_KEY = "id"
const val ARGUMENT_KEY_2 = "name"

const val ROOT_ROUTE = "root"
const val HOME_ROUTE = "home_root"
const val AUTH_ROUTE = "auth_route"


sealed class Screen (val name: String) {
    object MainScreen : Screen("main_screen")
    object DetailsScreen : Screen("details_screen?$ARGUMENT_KEY={$ARGUMENT_KEY}&$ARGUMENT_KEY_2={$ARGUMENT_KEY_2}") {
        fun getId(id: Int): String {
            return this.name.replace(oldValue = "{$ARGUMENT_KEY}", newValue = id.toString())
        }

        fun getNameAndId(
            id: Int,
            name: String = "adassd"
        ): String {
            return this.name
                .replace(oldValue = "{$ARGUMENT_KEY}", newValue = id.toString())
                .replace(oldValue = "{$ARGUMENT_KEY_2}", newValue = name)
        }
    }

    object Login: Screen("login_screen")
    object Signup: Screen("signup_screen")
}