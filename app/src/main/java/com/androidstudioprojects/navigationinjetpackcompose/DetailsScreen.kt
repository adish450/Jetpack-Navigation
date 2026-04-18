package com.androidstudioprojects.navigationinjetpackcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.androidstudioprojects.navigationinjetpackcompose.ui.theme.NavigationInJetpackComposeTheme
import com.androidstudioprojects.navigationinjetpackcompose.ui.theme.Typography

@Composable
fun DetailsScreen(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Details Screen",
            modifier = Modifier
                .clickable {
                    navController.popBackStack()
                },
            fontSize = Typography.headlineLarge.fontSize
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailsScreenPreview() {
    NavigationInJetpackComposeTheme {
        DetailsScreen(navController = rememberNavController())
    }
}