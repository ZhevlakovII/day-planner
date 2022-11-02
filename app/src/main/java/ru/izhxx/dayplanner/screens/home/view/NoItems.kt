package ru.izhxx.dayplanner.screens.home.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.izhxx.dayplanner.R
import ru.izhxx.dayplanner.theme.Typography
import ru.izhxx.dayplanner.theme.lightPalette

@Composable
fun DisplayNoItems(
    onAddClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(id = R.string.no_items_title),
            style = Typography.titleLarge,
            modifier = Modifier.padding(bottom = 10.dp),
            color = lightPalette.textColor
        )
        Text(
            text = stringResource(id = R.string.no_items_description),
            style = Typography.bodySmall,
            modifier = Modifier.padding(bottom = 20.dp).width(216.dp),
            color = lightPalette.textAdditionalColor,
            textAlign = TextAlign.Center
        )
        FilledIconButton(
            onClick = onAddClick,
            shape = ShapeDefaults.Small,
            colors = IconButtonDefaults.filledIconButtonColors(containerColor = lightPalette.primaryColor)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                tint = Color.White,
                contentDescription = stringResource(id = R.string.add_task_button_description)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNoItems() {
    DisplayNoItems(onAddClick = {})
}