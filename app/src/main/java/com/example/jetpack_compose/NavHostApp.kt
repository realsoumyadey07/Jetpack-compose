package com.example.jetpack_compose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavHostApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = routes.Login){
        composable<routes.Login> {
            LoginUi(navController)
        }

        composable<routes.Details> {
            DetailsScreen(navController)
        }
    }
}