package com.ravimaurya.artery.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ravimaurya.artery.presentation.ui.ArtFeedScreen
import com.ravimaurya.artery.presentation.ui.FavoriteScreen
import com.ravimaurya.artery.presentation.ui.HomeScreen
import com.ravimaurya.artery.presentation.ui.UploadArtScreen
import com.ravimaurya.artery.presentation.ui.UserProfileScreen
import com.ravimaurya.artery.presentation.utils.Screens


@Composable
fun NavGraphController(modifier: Modifier = Modifier, navController: NavHostController, scrollState: LazyListState) {
    NavHost(
        modifier = modifier.fillMaxSize(),
        navController = navController,
        startDestination = Screens.Home.route
    ) {
        composable(Screens.Home.route){
            HomeScreen(scrollState = scrollState)
        }
        composable(Screens.ArtFeed.route){
            ArtFeedScreen()
        }
        composable(Screens.UploadArt.route){
            UploadArtScreen()
        }
        composable(Screens.Favorite.route){
            FavoriteScreen()
        }
        composable(Screens.UserProfile.route){
            UserProfileScreen()
        }

    }
}