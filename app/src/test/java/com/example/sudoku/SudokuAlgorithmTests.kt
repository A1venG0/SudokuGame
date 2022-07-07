package com.example.sudoku

import com.example.sudoku.computationlogic.buildNodes
import com.example.sudoku.domain.Difficulty
import com.example.sudoku.domain.SudokuPuzzle
import com.example.sudoku.domain.getHash
import org.junit.Test

class SudokuAlgorithmTests {
    /*@Test
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
    }*/

    @Test
    fun verifyGraphSize() {
        val fourGraph = buildNodes(4, Difficulty.MEDIUM)
        val nineGraph = buildNodes(9, Difficulty.MEDIUM)
        val sixteenGraph = buildNodes(16, Difficulty.MEDIUM)

        assert(fourGraph.graph.size == 16)
        assert(nineGraph.graph.size == 81)
        assert(sixteenGraph.graph.size == 256)
    }
}