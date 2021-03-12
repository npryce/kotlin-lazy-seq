package dev.forkhandles.lazyseq

import kotlin.test.Test
import kotlin.test.assertEquals

class AppendTest {
    @Test
    fun append() {
        assertEquals(lazySeqOf(1,2,3,4,5), lazySeqOf(1,2) + lazySeqOf(3,4,5))
        assertEquals(lazySeqOf(1,2), lazySeqOf(1,2) + emptyLazySeq)
        assertEquals(lazySeqOf(3,4,5), emptyLazySeq + lazySeqOf(3,4,5))
    }
}

