package com.androidstudioprojects.navigationinjetpackcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.androidstudioprojects.navigationinjetpackcompose.ui.theme.Typography

@Composable
fun LoginScreen(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Login Screen",
            modifier = Modifier
                .clickable {
                    navController.navigate(Screen.DetailsScreen.name)
                },
            fontSize = Typography.headlineLarge.fontSize
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}