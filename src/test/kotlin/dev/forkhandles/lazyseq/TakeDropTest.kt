package dev.forkhandles.lazyseq

import kotlin.test.Test
import kotlin.test.assertEquals

class TakeDropTest {
    @Test
    fun taking() {
        val seq = generateLazySeq(1, { it + 1 })
        
        assertEquals(lazySeqOf(1, 2, 3), seq.take(3))
        assertEquals(lazySeqOf(5,6,7), seq.drop(4).take(3))
        assertEquals(lazySeqOf(1, 2, 3), seq.drop(0).take(3))
        assertEquals(emptyLazySeq, seq.take(0))
    }
}