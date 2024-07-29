package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathMediumTest {

    private final MathMedium mathMedium = new MathMedium();

    @Test
    public void testGcd() {
        assertEquals(6, mathMedium.gcd(54, 24));
        assertEquals(1, mathMedium.gcd(17, 13));
        assertEquals(0, mathMedium.gcd(0, 0));
        assertEquals(5, mathMedium.gcd(0, 5));
        assertEquals(5, mathMedium.gcd(5, 0));
    }

    @Test
    public void testIsPrime() {
        assertFalse(mathMedium.isPrime(1));
        assertTrue(mathMedium.isPrime(2));
        assertTrue(mathMedium.isPrime(3));
        assertFalse(mathMedium.isPrime(4));
        assertTrue(mathMedium.isPrime(17));
        assertFalse(mathMedium.isPrime(18));
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, mathMedium.fibonacci(0));
        assertEquals(1, mathMedium.fibonacci(1));
        assertEquals(1, mathMedium.fibonacci(2));
        assertEquals(2, mathMedium.fibonacci(3));
        assertEquals(3, mathMedium.fibonacci(4));
        assertEquals(5, mathMedium.fibonacci(5));
        assertEquals(8, mathMedium.fibonacci(6));
        assertThrows(IllegalArgumentException.class, () -> mathMedium.fibonacci(-1));
    }

    @Test
    public void testPower() {
        assertEquals(1, mathMedium.power(2, 0), 0.0001);
        assertEquals(2, mathMedium.power(2, 1), 0.0001);
        assertEquals(4, mathMedium.power(2, 2), 0.0001);
        assertEquals(8, mathMedium.power(2, 3), 0.0001);
        assertEquals(0.25, mathMedium.power(2, -2), 0.0001);
        assertEquals(1, mathMedium.power(0, 0), 0.0001);
        assertEquals(0, mathMedium.power(0, 5), 0.0001);
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(mathMedium.isPalindrome(121));
        assertFalse(mathMedium.isPalindrome(123));
        assertTrue(mathMedium.isPalindrome(0));
        assertTrue(mathMedium.isPalindrome(1221));
        assertFalse(mathMedium.isPalindrome(-121));
    }
}