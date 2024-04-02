package com.example.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.application.ui.theme.ApplicationTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Great()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Great (){
    LazyColumn (
        modifier=Modifier
            .background(Color.LightGray)
    ){
        item {
            Column(
                modifier= Modifier
                    .padding(10.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row (
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Image(imageVector = Icons.Default.Home, contentDescription = "")
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Current Location")
                        Row {
                            Image(imageVector = Icons.Default.LocationOn, contentDescription = "",
                                modifier = Modifier
                                    .size(15.dp))
                            Text(text="Nairobi, Kenya")
                        }
                    }
                    Image(imageVector = Icons.Default.Settings, contentDescription = "")
                }
                //
                Spacer(modifier = Modifier.height(15.dp))
                Row (
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ){
                    Card (modifier = Modifier
                        .padding(5.dp)
                        .size(180.dp, 50.dp)){
                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxSize()
                        ) {
                            Image(painter = painterResource(id = R.drawable.hotel), contentDescription = null,
                                modifier= Modifier
                                    .size(23.dp)
                                    .clip(RoundedCornerShape(5.dp)))
                            Text(text = "Hotels",
                                modifier=Modifier.padding(0.dp,5.dp))
                        }
                    }

                    Spacer(modifier = Modifier.width(25.dp))
                    Card (modifier = Modifier
                        .padding(5.dp)
                        .size(180.dp, 50.dp)){
                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxSize()
                        ) {
                            Image(painter = painterResource(id = R.drawable.holiday), contentDescription = null,
                                modifier= Modifier
                                    .size(23.dp)
                                    .clip(RoundedCornerShape(5.dp)))
                            Text(text = "Holiday",
                                modifier=Modifier.padding(0.dp,5.dp))
                        }
                    }
                }
                Row (
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ){
                    Card (modifier = Modifier
                        .padding(5.dp)
                        .size(180.dp, 50.dp)){
                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxSize()
                        ) {
                            Image(painter = painterResource(id = R.drawable.taxi), contentDescription = null,
                                modifier= Modifier
                                    .size(30.dp)
                                    .clip(RoundedCornerShape(5.dp)))
                            Text(text = "Taxi",
                                modifier=Modifier.padding(5.dp))
                        }
                    }
                    Spacer(modifier = Modifier.width(25.dp))
                    Row {
                        Card (modifier = Modifier
                            .padding(5.dp)
                            .size(180.dp, 50.dp)){
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .fillMaxSize()
                            ) {
                                Image(painter = painterResource(id = R.drawable.ticket), contentDescription = null,
                                    modifier= Modifier
                                        .size(30.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "Ticket",
                                    modifier=Modifier.padding(5.dp))
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row (
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ){
                    Card (modifier = Modifier
                        .padding(5.dp)
                        .size(180.dp, 50.dp)){
                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxSize()
                        ) {
                            Image(painter = painterResource(id = R.drawable.globe), contentDescription = null,
                                modifier= Modifier
                                    .size(30.dp)
                                    .clip(RoundedCornerShape(5.dp)))
                            Text(text = "Air Travel",
                                modifier=Modifier.padding(5.dp))
                        }
                    }
                    Spacer(modifier = Modifier.width(25.dp))
                    Row {
                        Card (modifier = Modifier
                            .padding(5.dp)
                            .size(180.dp, 50.dp)){
                            Row(
                                modifier = Modifier
                                    .padding(10.dp)
                                    .fillMaxSize()
                            ) {
                                Image(painter = painterResource(id = R.drawable.ship), contentDescription = null,
                                    modifier= Modifier
                                        .size(30.dp)
                                        .clip(RoundedCornerShape(5.dp)))
                                Text(text = "Harbour",
                                    modifier=Modifier.padding(5.dp))
                            }
                        }
                    }
                }
                Row {
                    Text(text = "Popular within the area",
                        fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(60.dp))
                    Text(text = "View All")
                }


                Row(
                    modifier=Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Card(
                        modifier= Modifier
//                            .fillMaxWidth(0.5f)
//                            .fillMaxHeight(0.5f)
                            .padding(5.dp)
                            .size(180.dp, 200.dp),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
//                                .fillMaxSize()
                                .padding(25.dp,10.dp,15.dp,0.dp),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Image(painter = painterResource(id = R.drawable.france), contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier= Modifier
                                    .clip(RoundedCornerShape(15.dp))
                                    .size(130.dp))
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .padding(25.dp,0.dp,10.dp,10.dp),
                        contentAlignment = Alignment.BottomStart)
                        {
                            Text(text = "Normandy, France",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black)
                        }
                    }
                    Spacer(modifier = Modifier.width(5.dp))
                    Card(
                        modifier= Modifier
//                            .fillMaxWidth(0.5f)
//                            .fillMaxHeight(0.5f)
                            .padding(5.dp)
                            .size(180.dp, 200.dp),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
//                                .fillMaxSize()
                                .padding(25.dp,10.dp,15.dp,0.dp),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Image(painter = painterResource(id = R.drawable.italy), contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier= Modifier
                                    .clip(RoundedCornerShape(15.dp))
                                    .size(130.dp))
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .padding(25.dp,0.dp,10.dp,10.dp),
                            contentAlignment = Alignment.BottomStart)
                        {
                            Text(text = "La Spenzia, Italia",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black)
                        }
                    }
                }
                Row(
                    modifier=Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Card(
                        modifier= Modifier
//                            .fillMaxWidth(0.5f)
//                            .fillMaxHeight(0.5f)
                            .padding(5.dp)
                            .size(180.dp, 200.dp),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
//                                .fillMaxSize()
                                .padding(25.dp,10.dp,15.dp,0.dp),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Image(painter = painterResource(id = R.drawable.germany), contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier= Modifier
                                    .clip(RoundedCornerShape(15.dp))
                                    .size(130.dp))
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .padding(25.dp,0.dp,10.dp,10.dp),
                            contentAlignment = Alignment.BottomStart)
                        {
                            Text(text = "Hamburg, Germany",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black)
                        }
                    }
                    Spacer(modifier = Modifier.width(5.dp))
                    Card(
                        modifier= Modifier
//                            .fillMaxWidth(0.5f)
//                            .fillMaxHeight(0.5f)
                            .padding(5.dp)
                            .size(180.dp, 200.dp),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
//                                .fillMaxSize()
                                .padding(25.dp,10.dp,15.dp,0.dp),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Image(painter = painterResource(id = R.drawable.aussie), contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier= Modifier
                                    .clip(RoundedCornerShape(15.dp))
                                    .size(130.dp))
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .padding(25.dp,0.dp,10.dp,10.dp),
                            contentAlignment = Alignment.BottomStart)
                        {
                            Text(text = "Sidney, Australia",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black)
                        }
                    }
                }
                Row(
                    modifier=Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Card(
                        modifier= Modifier
//                            .fillMaxWidth(0.5f)
//                            .fillMaxHeight(0.5f)
                            .padding(5.dp)
                            .size(180.dp, 200.dp),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
//                                .fillMaxSize()
                                .padding(25.dp,10.dp,15.dp,0.dp),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Image(painter = painterResource(id = R.drawable.russia), contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier= Modifier
                                    .clip(RoundedCornerShape(15.dp))
                                    .size(130.dp))
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .padding(25.dp,0.dp,10.dp,10.dp),
                            contentAlignment = Alignment.BottomStart)
                        {
                            Text(text = "Moskau, Russia",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black)
                        }
                    }
                    Spacer(modifier = Modifier.width(5.dp))
                    Card(
                        modifier= Modifier
//                            .fillMaxWidth(0.5f)
//                            .fillMaxHeight(0.5f)
                            .padding(5.dp)
                            .size(180.dp, 200.dp),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
//                                .fillMaxSize()
                                .padding(25.dp,10.dp,15.dp,0.dp),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Image(painter = painterResource(id = R.drawable.phili), contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier= Modifier
                                    .clip(RoundedCornerShape(15.dp))
                                    .size(130.dp))
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .padding(25.dp,0.dp,10.dp,10.dp),
                            contentAlignment = Alignment.BottomStart)
                        {
                            Text(text = "Coron Islands, Philippines",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black)
                        }
                    }
                }
                Row(
                    modifier=Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Card(
                        modifier= Modifier
//                            .fillMaxWidth(0.5f)
//                            .fillMaxHeight(0.5f)
                            .padding(5.dp)
                            .size(180.dp, 200.dp),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
//                                .fillMaxSize()
                                .padding(25.dp,10.dp,15.dp,0.dp),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Image(painter = painterResource(id = R.drawable.japan), contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier= Modifier
                                    .clip(RoundedCornerShape(15.dp))
                                    .size(130.dp))
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .padding(25.dp,0.dp,10.dp,10.dp),
                            contentAlignment = Alignment.BottomStart)
                        {
                            Text(text = "Mt. Fuji, Japan",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black)
                        }
                    }
                    Spacer(modifier = Modifier.width(5.dp))
                    Card(
                        modifier= Modifier
//                            .fillMaxWidth(0.5f)
//                            .fillMaxHeight(0.5f)
                            .padding(5.dp)
                            .size(180.dp, 200.dp),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
//                                .fillMaxSize()
                                .padding(25.dp,10.dp,15.dp,0.dp),
                            contentAlignment = Alignment.TopCenter
                        ) {
                            Image(painter = painterResource(id = R.drawable.brazil), contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier= Modifier
                                    .clip(RoundedCornerShape(15.dp))
                                    .size(130.dp))
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Box(modifier = Modifier
                            .padding(25.dp,0.dp,10.dp,10.dp),
                            contentAlignment = Alignment.BottomStart)
                        {
                            Text(text = "Rio De Janeiro, Brazil",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black)
                        }
                    }
                }
            }
        }
    }
}

