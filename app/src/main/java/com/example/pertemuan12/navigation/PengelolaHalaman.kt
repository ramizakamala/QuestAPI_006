package com.example.pertemuan12.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun PengelolaHalaman(navController: NavHostController= rememberNavController()) {
    navHost(
        navController = navController,
        startDestination = DestinasiHome.Home.route,
        modifier = Modifier,
    ){
        composable  (DestinasiHome.route) {
            HomeScreen(
                navigateToltemEnry= { navController.navigate(DestinasiEntry.route)},
                OnDetailedClick = {
                }
            )
        }
        composable(DestinasiEntry.route) {
            EntryMhsScreen(NavigateBack= {
                navController.navigate(DestinasiHome.route) {
                    popUpTo(DestinasiHome.route) {
                        inclusive = true

                    }
                }
            })
        }
    }
}
