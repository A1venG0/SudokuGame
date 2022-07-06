package com.example.sudoku.domain

import java.io.Serializable

/**
 * A class that represents a single node of the graph, which is denoted by:
 * An x and y values, which represent the position of the sudoku node on the screen
 * A color, which is a value that represents a specific integer in a given node
 * A read-only flag, that determines whether we can change the color of the sudoku node
 */
data class SudokuNode(
    val x: Int,
    val y: Int,
    var color: Int = 0,
    var readOnly: Boolean = true
): Serializable {
    override fun hashCode(): Int {
        return getHash(x, y)
    }
}

/**
 * Function that returns a unique identifier of the sudoku node
 */
internal fun getHash(x: Int, y: Int): Int {
    val newX = x*100 // this makes the value unique
    return "$newX$y".toInt()
}
