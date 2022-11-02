package ru.izhxx.dayplanner.screens.home.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.izhxx.dayplanner.common.getTextColor
import ru.izhxx.dayplanner.common.getTextDecoration
import ru.izhxx.dayplanner.theme.Typography
import ru.izhxx.dayplanner.theme.lightPalette
import ru.izhxx.domain.entities.Days
import ru.izhxx.domain.entities.Status
import ru.izhxx.domain.entities.Task

@Composable
fun DisplayTasks(
    tasks: List<Task>,
    onEventClick: (Long) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 100.dp)
    ) {
        itemsIndexed(tasks) { index, task ->
            when (index) {
                tasks.lastIndex -> TaskItem(task, getTextColor(task), getTextDecoration(task), onEventClick)
                else -> {
                    TaskItem(
                        currentTask = task,
                        textColor = getTextColor(task),
                        textDecoration = getTextDecoration(task),
                        onTaskClick = onEventClick
                    )
                    Divider(color = lightPalette.dividerColor, thickness = 1.5.dp)
                }
            }
        }
    }
}

@Composable
fun TaskItem(
    currentTask: Task,
    textColor: Color,
    textDecoration: TextDecoration,
    onTaskClick: (Long) -> Unit
) {
    TextButton(
        onClick = { onTaskClick(currentTask.id) },
        modifier = Modifier.padding(bottom = 6.dp)
    ) {
        Column {
            Text(
                text = currentTask.name,
                modifier = Modifier.padding(top = 6.dp),
                color = textColor,
                textDecoration = textDecoration,
                style = Typography.bodyMedium,
                textAlign = TextAlign.Start
            )
            Text(
                text = "${currentTask.startTime} - ${currentTask.endTime}",
                modifier = Modifier.padding(bottom = 6.dp),
                color = textColor,
                textDecoration = textDecoration,
                style = Typography.bodySmall,
                textAlign = TextAlign.Start
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTasksDisplay() {
    val someTaskData = listOf(
        Task(
            id = 0,
            name = "SomeName",
            description = "Some description for SomeName task",
            workingDays = listOf(Days.FRIDAY, Days.MONDAY),
            startTime = "8:00",
            endTime = "10:00",
            status = Status.UPCOMING
        ),
        Task(
            id = 0,
            name = "SomeName",
            description = "Some description for SomeName task",
            workingDays = listOf(Days.FRIDAY, Days.MONDAY),
            startTime = "8:00",
            endTime = "10:00",
            status = Status.ACTIVE
        ),
        Task(
            id = 0,
            name = "SomeName",
            description = "Some description for SomeName task",
            workingDays = listOf(Days.FRIDAY, Days.MONDAY),
            startTime = "8:00",
            endTime = "10:00",
            status = Status.COMPLETED
        )
    )

    DisplayTasks(tasks = someTaskData, onEventClick = {})
}