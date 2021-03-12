package dev.forkhandles.lazyseq

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class LazySeqOfTest {
    @Test
    fun equals() {
        assertEquals(lazySeqOf(1, 2, 3), lazySeqOf(1, 2, 3))
        assertNotEquals(lazySeqOf(1, 2, 3), emptyLazySeq())
        assertNotEquals(lazySeqOf(1, 2, 3), lazySeqOf(1, 2))
        assertNotEquals(lazySeqOf(1, 2, 3), lazySeqOf(1, 2, 3, 4))
    }
}