package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathComplexTest {

    private final MathComplex mathComplex = new MathComplex();

    @Test
    public void testGcd() {
        assertEquals(6, mathComplex.gcd(new int[]{54, 24}));
        assertEquals(1, mathComplex.gcd(new int[]{17, 13}));
        assertEquals(5, mathComplex.gcd(new int[]{5}));
        assertThrows(IllegalArgumentException.class, () -> mathComplex.gcd(new int[]{}));
    }

    @Test
    public void testIsPerfectSquare() {
        assertTrue(mathComplex.isPerfectSquare(4));
        assertTrue(mathComplex.isPerfectSquare(9));
        assertFalse(mathComplex.isPerfectSquare(8));
        assertFalse(mathComplex.isPerfectSquare(-4));
    }

    @Test
    public void testTriangularNumber() {
        assertEquals(0, mathComplex.triangularNumber(0));
        assertEquals(1, mathComplex.triangularNumber(1));
        assertEquals(3, mathComplex.triangularNumber(2));
        assertEquals(6, mathComplex.triangularNumber(3));
        assertEquals(10, mathComplex.triangularNumber(4));
        assertThrows(IllegalArgumentException.class, () -> mathComplex.triangularNumber(-1));
    }

    @Test
    public void testSumOfDigits() {
        assertEquals(6, mathComplex.sumOfDigits(123));
        assertEquals(0, mathComplex.sumOfDigits(0));
        assertEquals(15, mathComplex.sumOfDigits(555));
        assertEquals(1, mathComplex.sumOfDigits(1000));
    }

    @Test
    public void testIsArmstrong() {
        assertTrue(mathComplex.isArmstrong(153));
        assertTrue(mathComplex.isArmstrong(370));
        assertFalse(mathComplex.isArmstrong(123));
        assertFalse(mathComplex.isArmstrong(-153));
    }

    @Test
    public void testBinomialCoefficient() {
        assertEquals(1, mathComplex.binomialCoefficient(5, 0));
        assertEquals(5, mathComplex.binomialCoefficient(5, 1));
        assertEquals(10, mathComplex.binomialCoefficient(5, 2));
        assertEquals(1, mathComplex.binomialCoefficient(5, 5));
        assertThrows(IllegalArgumentException.class, () -> mathComplex.binomialCoefficient(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> mathComplex.binomialCoefficient(5, -1));
        assertThrows(IllegalArgumentException.class, () -> mathComplex.binomialCoefficient(5, 6));
    }

    @Test
    public void testLcm() {
        assertEquals(12, mathComplex.lcm(4, 6));
        assertEquals(0, mathComplex.lcm(0, 6));
        assertEquals(0, mathComplex.lcm(4, 0));
        assertEquals(20, mathComplex.lcm(4, 5));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(mathComplex.isPalindrome(121));
        assertFalse(mathComplex.isPalindrome(123));
        assertTrue(mathComplex.isPalindrome(0));
        assertTrue(mathComplex.isPalindrome(1221));
        assertFalse(mathComplex.isPalindrome(-121));
    }

    @Test
    public void testSumOfPrimes() {
        assertEquals(2, mathComplex.sumOfPrimes(1));
        assertEquals(5, mathComplex.sumOfPrimes(2));
        assertEquals(10, mathComplex.sumOfPrimes(3));
        assertEquals(17, mathComplex.sumOfPrimes(4));
        assertEquals(28, mathComplex.sumOfPrimes(5));
        assertThrows(IllegalArgumentException.class, () -> mathComplex.sumOfPrimes(-1));
    }
}