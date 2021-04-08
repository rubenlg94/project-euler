package utils;

public class Utils {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isEven(long number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        int numberSqrt = (int) Math.sqrt(number);
        for (int i = 3; i < numberSqrt && isPrime; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static boolean isPrime(long number) {
        boolean isPrime = true;
        long numberSqrt = (long) Math.sqrt(number);
        for (long i = 3; i < numberSqrt && isPrime; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

}
