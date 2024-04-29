package com.kodeco.android.coordplot.app.widgets
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kodeco.android.coordplot.R
import com.kodeco.android.coordplot.ui.theme.MyApplicationTheme

@Composable
fun MapSlider(titleRes: Int, percentage: Float, onPercentageChange: (Float) -> Unit) {
    Row {
        Text(
            text = stringResource(id = titleRes),
            modifier = Modifier
                .padding(start = 8.dp)
                .width(120.dp))
        Slider(value = percentage, onValueChange = onPercentageChange)
    }

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
