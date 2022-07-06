package com.example.sudoku.common

import kotlin.coroutines.CoroutineContext

/**
 * An interface that represents threads for coroutines
 */
interface DispatcherProvider {
    fun provideUIContext(): CoroutineContext
    fun provideIOContext(): CoroutineContext
}