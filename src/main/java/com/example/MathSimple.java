package com.example;

public class MathSimple {

    /**
     * Adds two integers.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the result of a - b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the result of a / b
     * @throws IllegalArgumentException if b is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    /**
     * Calculates the factorial of a non-negative integer.
     * 
     * @param n the integer
     * @return the factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of a negative number is not defined.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}