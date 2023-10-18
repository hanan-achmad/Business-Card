package com.example.hanansbusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hanansbusinesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
            modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .background(Color(0xFF073042)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(id = R.drawable.android_logo)
        Image(
                painter = image,
                contentDescription = "Android Logo",
                modifier = Modifier
                        .height(120.dp)
                        .width(150.dp)
        )
        Text(text = "Hanan Achmad", color = Color.White, fontSize = 32.sp)
        Text(text = "Student", color = Color(0xFF3ddc84))
    }

    Column(
            modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 50.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start
    ) {
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 50.dp)
        ) {
            val phone = painterResource(id = R.drawable.ic_phone)
            Image(painter = phone, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                    text = "+62 895-801-509-780",
                    color = Color.White,
                    modifier = Modifier.padding(8.dp)
            )

        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 50.dp)
        ) {
            val share = painterResource(id = R.drawable.ic_share)
            Image(painter = share, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                    text = "@hanan-achmad",
                    color = Color.White,
                    modifier = Modifier.padding(8.dp)
            )

        }
        Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 50.dp)
        ) {
            val email = painterResource(id = R.drawable.ic_email)
            Image(painter = email, contentDescription = null, modifier = Modifier.padding(8.dp))
            Text(
                    text = "achmadh21d@student.unhas.ac.id",
                    color = Color.White,
                    modifier = Modifier.padding(8.dp)
            )

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()
    }