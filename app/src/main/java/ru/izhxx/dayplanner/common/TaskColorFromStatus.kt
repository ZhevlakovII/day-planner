package ru.izhxx.dayplanner.common

import androidx.compose.ui.graphics.Color
import ru.izhxx.dayplanner.theme.lightPalette
import ru.izhxx.domain.entities.Status
import ru.izhxx.domain.entities.Task

/**
 * Returns the color for the text depending on the task status
 * @param task user task
 */
fun getTextColor(task: Task): Color {
    return when (task.status) {
        Status.COMPLETED -> lightPalette.additionalColor
        Status.ACTIVE -> lightPalette.primaryColor
        Status.UPCOMING -> lightPalette.textColor
    }
}