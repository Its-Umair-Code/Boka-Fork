package com.example.boka.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.boka.ui.BaseScreen

@Composable
fun RootNavGraph(navController: NavHostController){



    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination =  Graph.BASE
    ) {
        composable(route = Graph.BASE) {
            BaseScreen()
        }
    }



}