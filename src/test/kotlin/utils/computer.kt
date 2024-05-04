package utils

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

internal class ComputerFactoryTest {

    @DisplayName("객체 생성시 예외 발생하지 않음")
    @Test
    fun make_computer() {
        assertDoesNotThrow {
            computer.create()
        }
    }
}