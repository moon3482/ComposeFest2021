package com.charlie.week2_1compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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