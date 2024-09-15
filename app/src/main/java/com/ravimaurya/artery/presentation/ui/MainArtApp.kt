package com.ravimaurya.artery.presentation.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Fence
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.ravimaurya.artery.R
import com.ravimaurya.artery.presentation.NavGraphController

@Composable
fun MainArtApp(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            ArtTopAppBar(title = stringResource(R.string.app_name))
        },
        bottomBar = {
            ArtBottomAppBar(navController = navController)
        }
    ) { paddingValues ->
        NavGraphController(modifier = Modifier.padding(paddingValues),navController = navController)
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ArtTopAppBar(title: String) {
    TopAppBar(
        title = {
            Text(title, fontSize = 18.sp, color = Color.Black)
        }
    )
}

@Composable
fun ArtBottomAppBar( navController: NavHostController) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentRoute = navBackStackEntry?.destination?.route

    BottomAppBar(
        actions = {
            ArtBottomBarItems.BottomBarItems.forEach {
                NavigationBarItem(
                    alwaysShowLabel = true,
                    selected = currentRoute == it.route,
                    label = {
                        Text((stringResource(it.label)))
                    },
                    onClick = {
                        navController.navigate(it.route){
                            popUpTo(it.route){
                                inclusive = true
                            }
                        }
                    },
                    icon = {
                        Icon(
                            it.icon,
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                )
            }
        }
    )
}


data class BottomBarItem(
    val label: Int,
    val icon: ImageVector,
    val route: String = label.toString()
)

object ArtBottomBarItems{

    val BottomBarItems = listOf(
        BottomBarItem(label = R.string.nav_home, Icons.Outlined.Home),
        BottomBarItem(label = R.string.nav_art_feed, Icons.Outlined.Fence),
        BottomBarItem(label = R.string.nav_upload, Icons.Outlined.Add),
        BottomBarItem(label = R.string.nav_favorite, Icons.Default.Favorite),
        BottomBarItem(label = R.string.nav_profile, Icons.Outlined.Person)
    )

}

