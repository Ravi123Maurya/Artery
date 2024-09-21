package com.ravimaurya.artery.presentation.utils

import com.ravimaurya.artery.R

sealed class Screens(val route: String){
   data object Home: Screens("${R.string.nav_home}")
   data object ArtFeed: Screens("${R.string.nav_art_feed}")
   data object UploadArt: Screens("${R.string.nav_upload}")
   data object Favorite: Screens("${R.string.nav_favorite}")
   data object UserProfile: Screens("${R.string.nav_profile}")
}
