package com.example.sudoku.common

import kotlinx.coroutines.Job

/**
 * An abstract class that represents a base class for classes in the UI that will handle events
 * from the UI
 */
abstract class BaseLogic<EVENT> {
    protected lateinit var jobTracker: Job
    abstract fun onEvent(event: EVENT)
}