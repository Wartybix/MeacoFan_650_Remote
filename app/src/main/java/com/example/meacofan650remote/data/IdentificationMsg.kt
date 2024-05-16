package com.example.meacofan650remote.data

object IdentificationMsg {
    val pattern = listOf(
        IRSignal.INITIALIZATION_WAIT,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
    )
}