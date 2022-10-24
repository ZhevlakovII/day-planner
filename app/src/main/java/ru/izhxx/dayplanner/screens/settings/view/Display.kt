package ru.izhxx.dayplanner.screens.settings.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.izhxx.dayplanner.R

@Composable
fun DisplaySettings(onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TextButton(
            onClick = onClick
        ) {
            Text(
                text = stringResource(id = R.string.about)
            )
        }
    }
}


@Preview
@Composable
fun PreviewSettingsScreen() {
    DisplaySettings { }
}