package dev.forkhandles.lazyseq

import kotlin.test.Test
import kotlin.test.assertEquals

class MapTest {
    @Test
    fun append() {
        assertEquals(lazySeqOf(2, 4, 6, 8), lazySeqOf(1, 2, 3, 4).map { it * 2 })
    }
}