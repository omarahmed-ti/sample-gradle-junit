package com.example;

public class MathComplex {

    /**
     * Calculates the greatest common divisor (GCD) of an array of integers.
     * 
     * @param numbers the array of integers
     * @return the GCD of the array of integers
     * @throws IllegalArgumentException if the array is empty
     */
    public int gcd(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one number.");
        }
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
        }
        return result;
    }

    private int gcd(int a, int b) {
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
     * Checks if a number is a perfect square.
     * 
     * @param n the number to check
     * @return true if n is a perfect square, false otherwise
     */
    public boolean isPerfectSquare(int n) {
        if (n < 0) return false;
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    /**
     * Calculates the nth triangular number.
     * 
     * @param n the position in the triangular number sequence
     * @return the nth triangular number
     * @throws IllegalArgumentException if n is negative
     */
    public int triangularNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Triangular number of a negative number is not defined.");
        }
        return n * (n + 1) / 2;
    }

    /**
     * Calculates the sum of the digits of a number.
     * 
     * @param n the number
     * @return the sum of the digits of n
     */
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * Checks if a number is an Armstrong number.
     * 
     * @param n the number to check
     * @return true if n is an Armstrong number, false otherwise
     */
    public boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    /**
     * Calculates the binomial coefficient (n choose k).
     * 
     * @param n the number of items
     * @param k the number of items to choose
     * @return the binomial coefficient
     * @throws IllegalArgumentException if n or k is negative, or if k > n
     */
    public int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("Invalid values for n and k.");
        }
        if (k == 0 || k == n) return 1;
        int[] c = new int[k + 1];
        c[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, k); j > 0; j--) {
                c[j] = c[j] + c[j - 1];
            }
        }
        return c[k];
    }

    /**
     * Calculates the least common multiple (LCM) of two integers.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the LCM of a and b
     */
    public int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / gcd(a, b);
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

    /**
     * Calculates the sum of the first n prime numbers.
     * 
     * @param n the number of prime numbers to sum
     * @return the sum of the first n prime numbers
     * @throws IllegalArgumentException if n is negative
     */
    public int sumOfPrimes(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Sum of primes for a negative number is not defined.");
        }
        int sum = 0;
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                sum += number;
                count++;
            }
            number++;
        }
        return sum;
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}