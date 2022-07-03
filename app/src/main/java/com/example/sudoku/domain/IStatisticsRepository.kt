package com.example.sudoku.domain

interface IStatisticsRepository {
    suspend fun getStatistics(
        onSuccess: (UserStatistics) -> Unit,
        onError: (Exception) -> Unit
    )

    suspend fun updateStatics(
        time: Long,
        diff: Difficulty,
        boundary: Int,
        onSuccess: (isRecord: Boolean) -> Unit,
        onError: (Exception) -> Unit
    )
}