package com.example.sudoku.domain

/**
 * An interface that represents a game data storage
 */
interface IGameDataStorage {
    suspend fun updateGame(game: SudokuPuzzle): GameStorageResult
    suspend fun getCurrentGame(): GameStorageResult
    suspend fun updateNode(x: Int, y: Int, color: Int, elapsedTime: Long): GameStorageResult
}

/**
 * A class that represents two states (onSuccess and onError) through a single object
 */
sealed class GameStorageResult {
    data class OnSuccess(val currentGame: SudokuPuzzle) : GameStorageResult()
    data class OnError(val exception: Exception) : GameStorageResult()
}