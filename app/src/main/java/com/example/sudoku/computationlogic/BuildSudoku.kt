package com.example.sudoku.computationlogic

import com.example.sudoku.domain.Difficulty
import com.example.sudoku.domain.SudokuNode
import com.example.sudoku.domain.SudokuPuzzle
import java.util.*
import kotlin.collections.LinkedHashMap

internal fun buildNewSudoku(
    boundary: Int,
    difficulty: Difficulty
): SudokuPuzzle = buildNodes(boundary, difficulty)
    .buildEdges()
    .seedColors()
    .solve()
    .unsolve()

internal fun buildNodes(n: Int, difficulty: Difficulty): SudokuPuzzle {
    val newMap = LinkedHashMap<Int, LinkedList<SudokuNode>>()

    (1..n).forEach { xIndex ->
        (1..n).forEach { yIndex ->
            val newNode = SudokuNode(
                xIndex,
                yIndex,
                0
            )

            val newList = LinkedList<SudokuNode>()
            newList.add(newNode)
            newMap[newNode.hashCode()] = newList
        }
    }
    return SudokuPuzzle(n, difficulty, newMap)
}

internal fun SudokuPuzzle.buildEdges(): SudokuPuzzle {
    // not yet implemented
    return SudokuPuzzle(9, Difficulty.MEDIUM, LinkedHashMap<Int, LinkedList<SudokuNode>>())
}

internal fun SudokuPuzzle.seedColors(): SudokuPuzzle {
    // not yet implemented
    return SudokuPuzzle(9, Difficulty.MEDIUM, LinkedHashMap<Int, LinkedList<SudokuNode>>())
}