package com.kodeco.android.coordplot.app.widgets
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.kodeco.android.coordplot.R
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme

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
            MapSlider(
                titleRes = R.string.x_axis,
                percentage = xPercentage
            ) {
                xPercentage = it
            }
            MapSlider(
                titleRes = R.string.y_axis,
                percentage = yPercentage
            ) {
                yPercentage = it
            }
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
