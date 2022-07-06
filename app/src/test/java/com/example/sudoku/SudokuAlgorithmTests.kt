package com.example.sudoku

import com.example.sudoku.domain.Difficulty
import com.example.sudoku.domain.SudokuPuzzle
import com.example.sudoku.domain.getHash
import org.junit.Test

class SudokuAlgorithmTests {
    @Test
    fun unsolverTest() {
        val list = mutableListOf<SudokuPuzzle>()
        buildNewSudoku(9, Difficulty.MEDIUM)
    }

    @Test
    fun getPossibleTestValues() {
        val puzzle = SudokuPuzzle(4, Difficulty.MEDIUM)

        puzzle.graph.values.forEach { it.first.color = 0 }

        puzzle.graph[getHash(2, 1)]!!.first.color = 2
        puzzle.graph[getHash(2, 2)]!!.first.color = 1
        puzzle.graph[getHash(3, 1)]!!.first.color = 1
        puzzle.graph[getHash(4, 2)]!!.first.color = 3
        puzzle.graph[getHash(1, 4)]!!.first.color = 2
        puzzle.graph[getHash(3, 3)]!!.first.color = 4

        println(puzzle.print())
    }
}