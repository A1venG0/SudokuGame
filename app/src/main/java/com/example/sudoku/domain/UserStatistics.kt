package com.example.sudoku.domain

/**
 * A class that represents user's best times for solving various sudoku puzzles
 */
data class UserStatistics(
    val fourEasy: Long = 0,
    val fourMedium: Long = 0,
    val fourHard: Long = 0,
    val nineEasy: Long = 0,
    val nineMedium: Long = 0,
    val nineHard: Long = 0,
)
