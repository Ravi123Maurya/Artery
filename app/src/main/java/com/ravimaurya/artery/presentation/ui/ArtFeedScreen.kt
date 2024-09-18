package com.ravimaurya.artery.presentation.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ravimaurya.artery.R

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArtFeedScreen(modifier: Modifier = Modifier) {
    

        Column(
            modifier = Modifier.fillMaxSize().padding(),
        ) {

            ArtFeedItem()
        }




}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArtFeedItem(){
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Black),
        contentAlignment = Alignment.BottomStart
    ){
        Image(
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Fit,
            painter = painterResource(R.drawable.test),
            contentDescription = "")
        Column(
            Modifier.fillMaxWidth().padding(5.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                tint = Color.White,
                modifier = Modifier
                    .size(40.dp)
                    .border(1.dp, Color.Cyan)
                    .clip(RoundedCornerShape(50f))
                    .background(Color.Blue),
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "")
            Column(
                modifier = Modifier
                    .padding(start = 5.dp)
            ) {
                Text("User Name", fontSize = 10.sp, color = Color.White)
            }
            Text(
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .border(1.dp, color = Color.Cyan)
                    .background(Color.Cyan.copy(alpha = 0.5f))
                    .padding(2.dp),
                text = "Follow",
                fontSize = 10.sp,
                color = Color.White)

        }
            Text(
                text = "This is my art project " +
                    "where user can share their" +
                    " talent to world and also can " +
                    "explore others talent and can" +
                    " follow to each other, arts such" +
                    " as digital painting, illustration, " +
                    "3d model, graphic design etc.",
                softWrap = true,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = Color.White)
        }

    }
}