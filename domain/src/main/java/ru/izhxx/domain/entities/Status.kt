package ru.izhxx.domain.entities

/**
 * Task status. At the moment, 3 statuses are relevant.
 */
enum class Status(val tag: String) {
    COMPLETED("completed"),
    ACTIVE("active"),
    UPCOMING("upcoming")
}