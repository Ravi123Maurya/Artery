package com.ravimaurya.artery.presentation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ravimaurya.artery.R

@Composable
fun UserProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize().padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "",
                    modifier = Modifier.size(100.dp).clip(RoundedCornerShape(50))
                )
                Column (
                    Modifier.padding(start = 20.dp)
                ){
                    Text(
                        text = "User Name",
                        modifier = Modifier,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text("raviemail@gmail.com", fontSize = 12.sp, color = Color.Gray)
                }

            }
            Spacer(Modifier.height(8.dp))
            Text("This is my bio,..")
            HorizontalDivider(Modifier.padding(vertical = 10.dp))

            Row (
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
            // followers
                Column (
                    Modifier.wrapContentWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

            Text("500")
                    Text("Followers", fontSize = 12.sp,color = Color.Gray)
                }
                // following
                Column(
                    Modifier.wrapContentWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

            Text("500")
                    Text("Following", fontSize = 12.sp, color = Color.Gray)
                }

            }

            HorizontalDivider(Modifier.padding(vertical = 10.dp))


        }
    }
}