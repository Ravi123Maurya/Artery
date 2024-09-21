package com.ravimaurya.artery.presentation.utils

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//  Custom Icon for Like, Comment, etc. with size of 45.dp
@Composable
fun ComplementsIcon(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    contentDescription: String?,
    tint: Color = Color.White
){
    Icon(
        tint = tint,
        imageVector = imageVector,
        contentDescription = contentDescription,
        modifier = Modifier.size(45.dp)
    )

}

// Custom BottomAppBar Icon with size of 40.dp
@Composable
fun BottomBarIcon(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    contentDescription: String?,
    tint: Color = Color.White
){
    Icon(
        tint = tint,
        imageVector = imageVector,
        contentDescription = contentDescription,
        modifier = Modifier.size(40.dp)
    )

}
// Custom Text with 12.sp fontSize
@Composable
fun ComplementsText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    fontSize: TextUnit = 12.sp
){
    Text(
        text = text,
        color = color,
        modifier = modifier,
        fontSize = fontSize
    )

}