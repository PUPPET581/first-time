package com.example.ui.state

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class FirstTimeViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(FirstTimeUiState())
    val uiState: StateFlow<FirstTimeUiState> = _uiState.asStateFlow()

    fun selectViewMode(mode: ReadmeViewMode) {
        _uiState.update { current ->
            current.copy(viewMode = mode)
        }
    }
}
