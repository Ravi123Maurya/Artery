package com.ravimaurya.artery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.ravimaurya.artery.presentation.NavGraphController
import com.ravimaurya.artery.ui.theme.ArteryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArteryTheme {


            }
        }
    }
}


@Composable
fun MainApp(navController: NavHostController){
    Scaffold(
        topBar = {

        },
        bottomBar = {

        }
    ) { paddingValues ->
        NavGraphController(modifier = Modifier.padding(paddingValues),navController = navController)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ArtTopAppBar(modifier: Modifier = Modifier, title: String) {
    TopAppBar(
        title = {
            Text(title, fontSize = 18.sp, color = Color.Black)
        }
    )
}

@Composable
fun ArtBottomAppBar(modifier: Modifier = Modifier) {
    BottomAppBar(
       containerColor =  Color.Cyan
    ) {

    }
}

