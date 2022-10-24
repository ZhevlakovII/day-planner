package ru.izhxx.domain.entities

/**
 * A variant of the task to display to the user.
 * @param id Id of task. Unique. Long Type
 * @param name Task name
 * @param description Task description
 * @param workingDays Days on which the task will be active. Defined by [Days]
 * @param startTime Task start time
 * @param endTime Task end time
 * @param status The status of the task. Defined by [Status]
 */
data class Task(
    val id: Long,
    val name: String,
    val description: String,
    val workingDays: List<Days>,
    val startTime: String,
    val endTime: String,
    val status: Status
)
