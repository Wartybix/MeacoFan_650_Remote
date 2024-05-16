package com.example.meacofan650remote.ui

import android.app.Application
import android.content.Context
import android.hardware.ConsumerIrManager
import androidx.lifecycle.AndroidViewModel
import com.example.meacofan650remote.data.IRSignal
import com.example.meacofan650remote.data.IdentificationMsg
import com.example.meacofan650remote.data.RemoteFunction
import com.example.meacofan650remote.data.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ViewModel(application: Application) : AndroidViewModel(application) {
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    private val irManager: ConsumerIrManager? = application.applicationContext.getSystemService(
        Context.CONSUMER_IR_SERVICE
    ) as ConsumerIrManager?

    init {
        _uiState.value.irSupported = irManager?.hasIrEmitter() ?: false
    }

    fun broadcastSignal(function: RemoteFunction) {
        val fullSignal = IdentificationMsg.pattern + function.signals

        val pattern = fullSignal.mapIndexed { index, pauseTime ->
            if (index == 0)
                listOf(
                    IRSignal.INITIALIZATION_PULSE.microSec,
                    pauseTime.microSec,
                    IRSignal.PULSE.microSec
                )
            else
                listOf(pauseTime.microSec, IRSignal.PULSE.microSec)
        }.flatten().toIntArray()

        irManager?.transmit(38000, pattern)
    }
}
