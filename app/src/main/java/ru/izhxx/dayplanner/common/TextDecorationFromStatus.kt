package ru.izhxx.dayplanner.common

import androidx.compose.ui.text.style.TextDecoration
import ru.izhxx.domain.entities.Status
import ru.izhxx.domain.entities.Task

/**
 * Returns the text decoration (none or LineThrough) for the text depending on the task status
 * @param task user task
 */
fun getTextDecoration(task: Task): TextDecoration {
    return when (task.status) {
        Status.COMPLETED -> TextDecoration.LineThrough
        else -> TextDecoration.None
    }
}