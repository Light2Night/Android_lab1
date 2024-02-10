package com.example.liteapplication

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.liteapplication.ui.theme.LiteApplicationTheme
import java.time.format.TextStyle


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LiteApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Body()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Body() {
    val bMap = BitmapFactory.decodeFile("C:\\Users\\ipz\\Pictures\\Saved Pictures\\Зображення1.jpg")

    Column(
        modifier = Modifier
            .border(1.dp, Color.Black)
            .fillMaxHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Image(
                bitmap = bMap.asImageBitmap(),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(51.dp)
                    .height(51.dp)
                    .padding(10.dp)
            )
        }

        Text(
            text = "Settings",
            modifier = Modifier
                .padding(10.dp),
            fontSize = 20.sp
        )


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