package com.example.datainternet.navigation

import androidx.compose.runtime.Composable
import com.example.datainternet.ui.theme.home.viewmodel.DestinasiHome
import com.example.datainternet.ui.theme.home.viewmodel.HomeScreen
import com.example.datainternet.ui.theme.kontak.screen.viewmodel.DestinasiEntry
import com.example.datainternet.ui.theme.kontak.screen.viewmodel.EntryKontakScreen

@Composable
fun PengelolaHalaman(navController: NavHostController = rememberNavController()) {

    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier,
    ) {

        composable(DestinasiHome.route) {
            HomeScreen(navigateToItemEntry = {
                navController.navigate(DestinasiEntry.route)
            },
                onDetailClick = {

                })
        }
        composable(DestinasiEntry.route) {
            EntryKontakScreen(navigateBack = {
                navController.navigate(
                    DestinasiHome.route
                ) {
                    popUpTo(DestinasiHome.route) {
                        inclusive = true
                    }
                }
            })
        }
    }
}