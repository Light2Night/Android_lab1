package com.example.liteapplication

import android.graphics.Bitmap
import android.graphics.BitmapFactory
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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.liteapplication.ui.theme.LiteApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LiteApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray
                ) {
                    Body()
                }
            }
        }
    }
}

@Composable
fun Body() {
    val bitmap =
        BitmapFactory.decodeFile("C:\\Users\\ipz\\Pictures\\Saved Pictures\\Зображення1.jpg")

    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Image(
                bitmap = bitmap.asImageBitmap(),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(51.dp)
                    .height(51.dp)
                    .padding(10.dp)
            )
        }

        Box(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Text(
                text = "Settings",
                fontSize = 20.sp
            )
        }

        YellowCard(bitmap)

        SearchLine(bitmap)

        SettingsElement(bitmap, "Network & Internet", "Wi-Fi, Mobile, Data using, Hotspot")
        SettingsElement(bitmap, "Connected devices", "Bluetooth, Cast, NFC")
        SettingsElement(bitmap, "App", "Permissions, default, apps")
        SettingsElement(bitmap, "Notifications", "Permissions, default apps")
        SettingsElement(bitmap, "Digital wellbeing", "Screen time, app, timer, bedtime, schedules")
    }
}

@Composable
fun YellowCard(bitmap: Bitmap) {
    Box(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color.Yellow, RoundedCornerShape(16.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                bitmap = bitmap.asImageBitmap(),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .padding(10.dp)
            )

            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Get to know your Pixel",
                    modifier = Modifier
                        .padding(4.dp),
                    fontSize = 12.sp
                )
                Text(
                    text = "Explore what you can do with your phone",
                    modifier = Modifier
                        .padding(4.dp),
                    fontSize = 9.sp
                )
            }
        }
    }
}

@Composable
fun SearchLine(bitmap: Bitmap) {
    Box(
        modifier = Modifier
            .padding(10.dp, 0.dp, 10.dp, 10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(32.dp)
                .background(Color.White, RoundedCornerShape(16.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                bitmap = bitmap.asImageBitmap(),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(40.dp)
                    .height(40.dp)
                    .padding(10.dp)
            )

            Text(
                text = "Search settings...",
                modifier = Modifier
                    .padding(4.dp),
                fontSize = 12.sp
            )
        }
    }
}

@Composable
fun SettingsElement(bitmap: Bitmap, title: String, text: String) {
    Box(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                bitmap = bitmap.asImageBitmap(),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(10.dp)
            )

            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title,
                    modifier = Modifier
                        .padding(4.dp),
                    fontSize = 12.sp
                )
                Text(
                    text = text,
                    modifier = Modifier
                        .padding(4.dp),
                    fontSize = 8.sp
                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    LiteApplicationTheme {
//        Greeting("Android")
//    }
//}

@Preview(showBackground = true)
@Composable
fun BodyPreview() {
    LiteApplicationTheme {
        Body()
    }
}