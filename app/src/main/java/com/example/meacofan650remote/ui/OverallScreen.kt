package com.example.meacofan650remote.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun OverallScreen(
    viewModel: ViewModel = viewModel()
) {
    val uiState = viewModel.uiState.collectAsState().value

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopAppBar() }
    ) { innerPadding ->
        if (uiState.irSupported)
            RemoteScreen(paddingValues = innerPadding)
        else
            UnsupportedScreen()
    }
}