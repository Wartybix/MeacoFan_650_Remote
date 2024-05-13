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
    )),
    MUTE(listOf(
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
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO
    )),
    OSCILLATION(listOf(
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
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO
    )),
    ECO(listOf(
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
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
    )),
    TIMER(listOf(
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
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO
    )),
    LIGHT(listOf(
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
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
    )),
    SPEED_UP(listOf(
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
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO,
    )),
    SPEED_DOWN(listOf(
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
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ZERO,
        IRSignal.ONE,
        IRSignal.ONE,
        IRSignal.ZERO
    ))
}