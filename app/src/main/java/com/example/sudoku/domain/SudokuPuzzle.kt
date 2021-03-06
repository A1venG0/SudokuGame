package com.example.sudoku.domain

import com.example.sudoku.computationlogic.buildNewSudoku
import java.io.Serializable
import java.util.*
import kotlin.collections.LinkedHashMap

/**
 * A class that represents a virtual sudoku puzzle
 */
data class SudokuPuzzle(
    val boundary: Int,
    val difficulty: Difficulty,
    val graph: LinkedHashMap<Int, LinkedList<SudokuNode>>
    = buildNewSudoku(boundary, difficulty).graph,
    var elapsedTime: Long = 0L
): Serializable {
    fun getValue(): LinkedHashMap<Int, LinkedList<SudokuNode>> = graph
}

