package ru.izhxx.dayplanner.screens.home.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.izhxx.dayplanner.R
import ru.izhxx.dayplanner.theme.Typography
import ru.izhxx.dayplanner.theme.lightPalette

@Composable
fun DisplayLoading() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(lightPalette.loadingBackgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier.width(300.dp).height(200.dp)
        ) {
            Column(
                modifier = Modifier.padding(top = 30.dp, bottom = 30.dp).fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.loading_title),
                    style = Typography.titleLarge,
                    color = lightPalette.textColor,
                    modifier = Modifier.padding(bottom = 10.dp)
                )
                Text(
                    text = stringResource(id = R.string.loading_body),
                    style = Typography.bodySmall,
                    color = lightPalette.textAdditionalColor,
                    modifier = Modifier.padding(bottom = 22.dp)
                )
                CircularProgressIndicator(
                    color = lightPalette.primaryColor,
                    modifier = Modifier
                        .size(60.dp),
                    strokeWidth = 4.dp,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoadingDisplay() {
    DisplayLoading()
}