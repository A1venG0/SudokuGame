package com.example.sudoku.domain

/**
 * A class that represents settings for the given sudoku puzzle
 */
data class Settings(
    val difficulty: Difficulty,
    val boundary: Int
)
