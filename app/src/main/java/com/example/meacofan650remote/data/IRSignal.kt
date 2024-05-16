package com.example.meacofan650remote.data

enum class IRSignal(val microSec: Int) {
    INITIALIZATION_PULSE(9400),
    INITIALIZATION_WAIT(4600),
    ZERO(500),
    ONE(1700),
    PULSE(640)
}