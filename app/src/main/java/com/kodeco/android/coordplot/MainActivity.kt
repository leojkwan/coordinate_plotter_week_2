package com.kodeco.android.coordplot

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                PlotSurface()
            }
        }
    }
}

// TODO Move PlotSurface() and PlotSurfacePreview() to their own file
@Composable
fun PlotSurface() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        var xPercentage: Float by remember { mutableStateOf(0.5f) }
        var yPercentage: Float by remember { mutableStateOf(0.5f) }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Map(xPercentage, yPercentage)
            // TODO Replace the Slider composables with MapSlider composables.
            Slider(value = xPercentage, onValueChange = { xPercentage = it })
            Slider(value = yPercentage, onValueChange = { yPercentage = it })
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PlotSurfacePreview() {
    MyApplicationTheme {
        PlotSurface()
    }
}

// TODO Move Map() and MapPreview() to their own file
@Composable
fun Map(xPercent: Float, yPercent: Float, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(300.dp)
            .background(MaterialTheme.colorScheme.tertiary),
    ) {
        // TODO Swap this Box out for an Image.
        //  Make sure to keep the size and offset modifiers.
        Box(
            modifier = Modifier
                .size(36.dp)
                .offset((xPercent * 300 - 18).dp, (yPercent * 300 - 18).dp)
                .clip(CircleShape)
                .background(Color.Blue)
        )
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Star pin",
            modifier = Modifier
                .size(36.dp)
                .offset((xPercent * 300 - 18).dp, (yPercent * 300 - 18).dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MapPreview() {
    MyApplicationTheme {
        Map(xPercent = 0.5f, yPercent = 0.5f)
    }
}

