package com.charlie.week2_1compose

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.charlie.week2_1compose.ui.theme.Week21ComposeTheme

@Composable
fun ConstraintLayoutContent() {

    ConstraintLayout {
        val (button, text) = createRefs()

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.constrainAs(button) {
                top.linkTo(parent.top, margin = 16.dp)

            }) {
            Text(text = "Button")
        }
        Text(text = "Text", modifier = Modifier.constrainAs(text) {
            top.linkTo(button.bottom, margin = 16.dp)
        })
    }
}

@Preview(showBackground = true)
@Composable
fun ConstraintLayoutContentPreview(){

    Week21ComposeTheme {
        ConstraintLayoutContent()
    }

}