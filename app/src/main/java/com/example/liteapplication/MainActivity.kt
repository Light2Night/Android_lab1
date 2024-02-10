package com.example.liteapplication

import android.graphics.Bitmap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
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
                    Body(12.dp)
                }
            }
        }
    }
}

@Composable
fun Body(itemsDp: Dp) {
    val userImage = painterResource(R.drawable.ellipse_54);
    val settingsImage = painterResource(R.drawable.phonelink_setup);
    val searchImage = painterResource(R.drawable.search);
    val wifiImage = painterResource(R.drawable.wifi);
    val devicesImage = painterResource(R.drawable.devices_other);
    val appsImage = painterResource(R.drawable.apps);
    val notificationImage = painterResource(R.drawable.notifications_none);
    val accessibilityImage = painterResource(R.drawable.accessibility);

    Column(
        modifier = Modifier
            .background(Color(237, 239, 227))
            .fillMaxHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Image(
                painter = userImage,
                contentDescription = "Logo",
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .padding(itemsDp)
            )
        }

        Box(
            modifier = Modifier
                .padding(itemsDp)
        ) {
            Text(
                text = "Settings",
                fontSize = 36.sp
            )
        }

        YellowCard(settingsImage, itemsDp)

        SearchLine(searchImage, itemsDp)

        SettingsElement(
            wifiImage,
            "Network & Internet",
            "Wi-Fi, Mobile, Data using, Hotspot",
            itemsDp
        )
        SettingsElement(devicesImage, "Connected devices", "Bluetooth, Cast, NFC", itemsDp)
        SettingsElement(appsImage, "App", "Permissions, default, apps", itemsDp)
        SettingsElement(notificationImage, "Notifications", "Permissions, default apps", itemsDp)
        SettingsElement(
            accessibilityImage,
            "Digital wellbeing",
            "Screen time, app, timer, bedtime, schedules",
            itemsDp
        )
    }
}

@Composable
fun YellowCard(painter: Painter, itemsDp: Dp) {
    Box(
        modifier = Modifier
            .padding(itemsDp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(92.dp)
                .background(Color(219, 234, 141), RoundedCornerShape(24.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painter,
                contentDescription = "Logo",
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(14.dp)
            )

            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Get to know your Pixel",
                    modifier = Modifier
                        .padding(0.dp, 4.dp),
                    fontSize = 21.sp
                )
                Text(
                    text = "Explore what you can do with your phone",
                    modifier = Modifier
                        .padding(0.dp, 4.dp),
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Composable
fun SearchLine(painter: Painter, itemsDp: Dp) {
    Box(
        modifier = Modifier
            .padding(itemsDp, 0.dp, itemsDp, itemsDp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .background(Color.White, RoundedCornerShape(24.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painter,
                contentDescription = "Logo",
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(14.dp)
            )

            Text(
                text = "Search settings...",
                modifier = Modifier
                    .padding(0.dp, 4.dp),
                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun SettingsElement(painter: Painter, title: String, text: String, itemsDp: Dp) {
    Box(
        modifier = Modifier
            .padding(itemsDp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .background(Color(226, 227, 216), RoundedCornerShape(40.dp))
            ) {
                Image(
                    painter = painter,
                    contentDescription = "Logo",
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                        .padding(14.dp)
                )
            }

            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title,
                    modifier = Modifier
                        .padding(4.dp),
                    fontSize = 20.sp
                )
                Text(
                    text = text,
                    modifier = Modifier
                        .padding(4.dp),
                    fontSize = 14.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BodyPreview() {
    LiteApplicationTheme {
        Body(12.dp)
    }
}