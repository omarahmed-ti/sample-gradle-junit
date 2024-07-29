package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathSimpleTest {

    private final MathSimple mathSimple = new MathSimple();

    @Test
    public void testAdd() {
        assertEquals(5, mathSimple.add(2, 3));
        assertEquals(-1, mathSimple.add(2, -3));
        assertEquals(0, mathSimple.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, mathSimple.subtract(3, 2));
        assertEquals(5, mathSimple.subtract(2, -3));
        assertEquals(0, mathSimple.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathSimple.multiply(2, 3));
        assertEquals(-6, mathSimple.multiply(2, -3));
        assertEquals(0, mathSimple.multiply(0, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, mathSimple.divide(6, 3));
        assertEquals(-2, mathSimple.divide(6, -3));
        assertThrows(IllegalArgumentException.class, () -> mathSimple.divide(6, 0));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, mathSimple.factorial(5));
        assertEquals(1, mathSimple.factorial(0));
        assertThrows(IllegalArgumentException.class, () -> mathSimple.factorial(-1));
    }
}