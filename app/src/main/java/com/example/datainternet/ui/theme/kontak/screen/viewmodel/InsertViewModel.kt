package com.example.datainternet.ui.theme.kontak.screen.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.datainternet.repository.KontakRepository

class InsertViewModel(private val kontakRepository: KontakRepository) : ViewModel() {
var insertKontakState by mutableStateOf(InsertUiState())
    private set
    fun updateInsertKontakState(insertUiEvent: InsertUiEvent) {

    }
}

data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent(),
)