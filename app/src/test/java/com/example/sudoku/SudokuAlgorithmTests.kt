package com.example.sudoku

import com.example.sudoku.computationlogic.buildNodes
import com.example.sudoku.domain.Difficulty
import com.example.sudoku.domain.SudokuPuzzle
import com.example.sudoku.domain.getHash
import org.junit.Test

class SudokuAlgorithmTests {

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