package com.example.sudoku.ui.activegame.buildlogic

import android.content.Context
import com.example.sudoku.persistence.GameRepositoryImpl
import com.example.sudoku.persistence.LocalGameStorageImpl
import com.example.sudoku.ui.activegame.ActiveGameContainer
import com.example.sudoku.ui.activegame.ActiveGameLogic
import com.example.sudoku.ui.activegame.ActiveGameViewModel

internal fun buildActiveGameLogic(
    container: ActiveGameContainer,
    viewModel: ActiveGameViewModel,
    context: Context
): ActiveGameLogic {
    return ActiveGameLogic(
        container,
        viewModel,
        GameRepositoryImpl(
            LocalGameStorageImpl(context.filesDir.path),
        LocalSettingsStorageImpl(context.settingsDataStore)
        )
    )
}