package com.example.sudoku.domain

/**
* A class that represents the difficulty of the given sudoku puzzle
 */
enum class Difficulty(val modifier: Double) {
    EASY(0.5),
    MEDIUM(0.44),
    HARD(0.38)
}