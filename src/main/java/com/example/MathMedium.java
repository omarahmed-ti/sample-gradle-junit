package com.example;

public class MathMedium {

    /**
     * Calculates the greatest common divisor (GCD) of two integers.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the GCD of a and b
     */
    public int gcd(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Checks if a number is prime.
     * 
     * @param n the number to check
     * @return true if n is prime, false otherwise
     */
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Calculates the nth Fibonacci number.
     * 
     * @param n the position in the Fibonacci sequence
     * @return the nth Fibonacci number
     * @throws IllegalArgumentException if n is negative
     */
    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci of a negative number is not defined.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * Calculates the power of a number.
     * 
     * @param base the base number
     * @param exponent the exponent
     * @return the result of base raised to the power of exponent
     */
    public double power(double base, int exponent) {
        if (exponent == 0) return 1;
        double result = 1;
        boolean isNegative = exponent < 0;
        exponent = Math.abs(exponent);
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return isNegative ? 1 / result : result;
    }

    /**
     * Checks if a number is a palindrome.
     * 
     * @param n the number to check
     * @return true if n is a palindrome, false otherwise
     */
    public boolean isPalindrome(int n) {
        if (n < 0) return false;
        int original = n;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
}