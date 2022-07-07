package com.example.sudoku.computationlogic

import com.example.sudoku.domain.Difficulty
import com.example.sudoku.domain.SudokuNode
import com.example.sudoku.domain.SudokuPuzzle
import java.util.*
import kotlin.collections.LinkedHashMap

internal fun SudokuPuzzle.unsolve(): SudokuPuzzle {
    // not yet implemented
    return SudokuPuzzle(9, Difficulty.MEDIUM, LinkedHashMap<Int, LinkedList<SudokuNode>>())
}