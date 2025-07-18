package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator.turnOff();
    }

    @Test
    void shouldBeTurnedOff() {
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldTurnOn() {
        calculator.turnOn();
        assertTrue(calculator.isOn());
    }

    @Test
    void shouldTurnOff() {
        calculator.turnOn();
        assertTrue(calculator.isOn());

        calculator.turnOff();
        assertTrue(calculator.isOff());
    }


    @Test
    void returnCorrectSumInt() {
        calculator.turnOn();
        int actual = calculator.sum(1, 2);
        assertEquals(3, actual, 0.001);
    }

    @Test
    void returnCorrectSumDouble() {
        calculator.turnOn();
        double actual = calculator.sum(1.2, 2);
        assertEquals(3.2, actual, 0.001);
    }

    @Test
    void returnCorrectDifferenceInt() {
        calculator.turnOn();
        int actual = calculator.subtract(3, 5);
        assertEquals(-2, actual, 0.001);
    }

    @Test
    void returnCorrectDifferenceDouble() {
        calculator.turnOn();
        double actual = calculator.subtract(3.2, 1.4);
        assertEquals(1.8, actual, 0.001);
    }

    @Test
    void returnCorrectProductInt() {
        calculator.turnOn();
        int actual = calculator.multiply(5, 3);
        assertEquals(15, actual, 0.001);
    }

    @Test
    void returnCorrectProductDouble() {
        calculator.turnOn();
        double actual = calculator.multiply(3.2, 1.4);
        assertEquals(4.48, actual, 0.001);
    }

    @Test
    void returnCorrectQuotientInt() {
        calculator.turnOn();
        int actual = calculator.divide(8, 2);
        assertEquals(4, actual, 0.001);
    }

    @Test
    void returnCorrectQuotientDouble() {
        calculator.turnOn();
        double actual = calculator.divide(3.2, 1.6);
        assertEquals(2, actual, 0.001);
    }
//
//    @Test
//    void returnCorrectModuloInt() {
//        calculator.turnOn();
//        int actual = calculator.modulo(8, 3);
//        assertEquals(2, actual, 0.001);
//    }

    @Test
    void returnUndefinedQuotientInt() {
        calculator.turnOn();
        int actual = calculator.divide(8, 0);
        assertEquals(-1, actual, 0.001);
    }

    @Test
    void returnUndefinedQuotientDouble() {
        calculator.turnOn();
        int actual = calculator.divide(8, 0);
        assertEquals(-1, actual, 0.001);
    }
}
