package com.kodeco.android.coordplot

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme

@Composable
fun MapSlider(titleRes: Int, percentage: Float, onPercentageChange: (Float) -> Unit) {
    // TODO Provide a Row composable with an inner Text composable for the title
    //  and move the Slider composable used in PlotSurface here.
    //  - The Row should have a horizontal padding of 16.dp
    //  - The Text title should have a start padding of 8.dp with a width
    //    of 120.dp.
    //  - The Slider should wire up its onValueChange with the MapSlider's
    //    onPercentageChange lambda.
}

@Preview(showBackground = true)
@Composable
fun MapSliderPreview() {
    MyApplicationTheme {
        MapSlider(
            titleRes = R.string.app_name, // TODO replace this with a valid string resource
            percentage = 0.5f,
        ) {}
    }
}
