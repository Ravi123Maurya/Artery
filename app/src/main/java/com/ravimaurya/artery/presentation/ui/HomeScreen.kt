package com.ravimaurya.artery.presentation.ui

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ravimaurya.artery.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArtItem(){

    Column (
        modifier = Modifier.fillMaxWidth().padding(8.dp)
    ){
        Box(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(.5f),
            contentAlignment = Alignment.TopStart
        ) {

            Image(
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(16.dp)),
                painter = painterResource(R.drawable.test), contentDescription =  "")
            Row(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {

                    Image(
                        modifier = Modifier
                            .size(60.dp)
                            .clip(RoundedCornerShape(50)),
                        painter = painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = "")
                    Column (verticalArrangement = Arrangement.Center){

                        Text(color = Color.White, text = "User Name", fontSize = 16.sp, modifier = Modifier.padding(start = 8.dp))
                        Text(color = Color.LightGray, text = "emaiaill", fontSize = 16.sp, modifier = Modifier.padding(start = 8.dp))
                    }
                }
                Icon(Icons.Filled.MoreVert, contentDescription = "", tint = Color.White)
            }
        }
        ArtComplements()
        Text(text = "This is art description...", Modifier.padding(vertical = 5.dp))
    }



}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArtComplements(){
    Row (
        modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ){
        IconButton(onClick = {}) {
            Icon(Icons.Outlined.ThumbUp, "like")
        }
        IconButton(onClick = {}) {
            Icon(Icons.Filled.FavoriteBorder, "favorite")
        }
        IconButton(onClick = {}) {
            Icon(Icons.Outlined.Bookmark, "bookmark")
        }
        IconButton(onClick = {}) {
            Icon(Icons.Filled.Share, "share")
        }

    }
}
