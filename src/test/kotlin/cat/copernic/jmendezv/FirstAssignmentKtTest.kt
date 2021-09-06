package cat.copernic.jmendezv

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FirstAssignmentKtTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun suma() {
        assertEquals(5, cat.copernic.jmendezv.suma(3, 2))
        assertEquals(6, cat.copernic.jmendezv.suma(4, 2))
        assertEquals(7, cat.copernic.jmendezv.suma(3, 4))
    }
}