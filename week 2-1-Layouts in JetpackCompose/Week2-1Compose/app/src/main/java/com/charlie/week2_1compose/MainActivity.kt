package com.charlie.week2_1compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.charlie.week2_1compose.ui.theme.Week21ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week21ComposeTheme {
                // A surface container using the 'background' color from the theme

//                    Greeting(name = "Android")
//                    PhotographerCard()
                LayoutsCodeLab()

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Week21ComposeTheme {
        Greeting("Android")
    }
}

@Composable
fun LayoutsCodeLab() {
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "LayoutsCodeLab")
        },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(Icons.Filled.Favorite, contentDescription = null)
                }
            }
        )

    }
    ) { innerPadding ->
        BodyContent(Modifier.padding(innerPadding))

    }

}

@Composable
fun BodyContent(modifier: Modifier = Modifier) {
    Row(modifier = modifier.horizontalScroll(rememberScrollState())) {
        StaggeredGrid {
            for (topic in topics) {
                Chip(modifier = Modifier.padding(8.dp), text = topic)
            }
        }
    }
    }



@Preview
@Composable
fun LayoutsCodeLabPreView() {
    Week21ComposeTheme {
        LayoutsCodeLab()
    }
}

val topics = listOf(
    "MyLove",
    "I'll Give you",
    "Something",
    "Time",
    "Flower",
    "Favorite",
    "We Time",
    "Never",
    "In your Hans",
    "무야호",
    "무냐고",
    "아이고난",
    "하더놈",
    "김성근",
    "감독님",
    "사랑해",
    "예이예이예이"
)




