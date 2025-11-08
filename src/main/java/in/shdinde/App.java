package in.shdinde;

/**
 * Basic application to perform mathematical operations
 *
 */
public class App 
{
    //functions to perform basic arithmetic operations
    public int add(int a, int b) {
        return a + b;
    }

    //function to perform subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    //function to perform multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    //function to perform division
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    //calculate factorial of a number
    public int factorial(int n) {
        if (n <= 0) {
            return 0;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    //calculate power of a number
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    //Write a function to check if a number is prime
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //sum of an array
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    //find maximum in an array
    public int maxInArray(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //find minimum in an array
    public int minInArray(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
