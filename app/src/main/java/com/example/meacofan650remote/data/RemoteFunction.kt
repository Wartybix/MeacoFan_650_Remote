package com.example.meacofan650remote.data

enum class RemoteFunction(signals: List<IRSignal>) {
    POWER(listOf(
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
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO
    ))
}