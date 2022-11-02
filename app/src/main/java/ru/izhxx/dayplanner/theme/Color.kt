package ru.izhxx.dayplanner.theme

import androidx.compose.ui.graphics.Color

data class DayPlannerColors(
    val primaryColor: Color,
    val additionalColor: Color,
    val secondaryAdditionalColor: Color,
    val textColor: Color,
    val textAdditionalColor: Color,
    val backgroundColor: Color,
    val dividerColor: Color,
    val loadingBackgroundColor: Color
)

val lightPalette = DayPlannerColors(
    primaryColor = Color(0xFF568C8C),
    additionalColor = Color(0xFFD9D3C1),
    secondaryAdditionalColor = Color(0xFFBFB8AA),
    textColor = Color(0xFF222222),
    textAdditionalColor = Color(0xFFABABAB),
    backgroundColor = Color(0xFFF2EBDC),
    dividerColor = Color(0xFFEBEBEB),
    loadingBackgroundColor = Color(0x663C3C3C)
)