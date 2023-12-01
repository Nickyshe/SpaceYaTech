package com.example.spaceyatech.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Text(text = "Upcoming trips",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp,
            modifier = Modifier.testTag("upcoming_trips")
            )
        Spacer(modifier =  Modifier.height(40.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center


        ) {
            Card(
                modifier = Modifier
                    .testTag("dates_and_dinner_card")
                    .width(150.dp)
                    .height(200.dp),

                colors = CardDefaults.elevatedCardColors(
                    MaterialTheme.colorScheme.onPrimaryContainer
                )
                    //.size(300.dp)

            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),

                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "dates and dinner",
                        color = Color.White,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )

                }

            }




            Spacer(modifier = Modifier.width(50.dp))

            Card(
                modifier = Modifier
                    .testTag("beach_and_sand_card")
                    .width(150.dp)
                    .height(200.dp),
                colors = CardDefaults.elevatedCardColors(
                    MaterialTheme.colorScheme.onPrimaryContainer
                )
                   // .size(300.dp)

            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),

                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "beach and sand",
                        color = Color.White,
                        modifier = Modifier.align(Alignment.CenterHorizontally))

                }


            }

        }

    }

}

@Preview
@Composable
fun MyPreview(){
    Screen()
}
