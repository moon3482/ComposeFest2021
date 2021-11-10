package com.charlie.week2_1compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.charlie.week2_1compose.ui.theme.Week21ComposeTheme

@Composable
fun SimpleList() {
    val scollState = rememberScrollState()
    Column(Modifier.verticalScroll(scollState)) {
        repeat(100) {
            Text(text = "Item #$it")
        }
    }
}


@Preview
@Composable
fun SimpleListPreview() {
    Week21ComposeTheme {
        SimpleList()
    }
}

@Composable
fun LazyList() {
    val scrollState = rememberLazyListState()

    LazyColumn(state = scrollState) {
        items(100) {
            Text(text = "Item ##$it")
        }
    }
}

@Preview
@Composable
fun LazyListPreview() {
    Week21ComposeTheme {
        LazyList()
    }
}

@Composable
fun ImageListItem(index: Int) {
    Row(verticalAlignment = Alignment.CenterVertically) {

        Image(
            painter = rememberImagePainter(
                data = "https://developer.android.com/images/brand/Android_Robot.png"
            ),
            contentDescription = "Android Logo",
            modifier = Modifier.size(50.dp)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text("Item #$index", style = MaterialTheme.typography.subtitle1)

    }
}

@Preview
@Composable
fun ImageListItemPreview(){
    Week21ComposeTheme {
        repeat(10){
            ImageListItem(index = it)
        }

    }
}