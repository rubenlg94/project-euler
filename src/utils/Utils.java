package utils;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Long> getPrimeFactors(Long number) {
        List<Long> primeFactors = new ArrayList<>();
        Long factor = 2L;
        while (!isPrime(number)) {
            if (isPrime(factor) && number % factor == 0) {
                while(number % factor == 0){
                    number = number / factor;
                }
                primeFactors.add(factor);
            }
            factor++;
        }
        primeFactors.add(number);
        return primeFactors;
    }

    public static int primeFactors(int number) {
        int sqrt = (int) Math.sqrt(number);
        int count = 0;
        for (int i = 2; i <= sqrt + 1; i++) {
            if (number % i == 0) {
                while (number % i == 0) {
                    number = number / i;
                }
                count++;
            }
        }
        if (count == 3 && isPrime(number)) {
            count++;
        }
        return count;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= n;
        }
        return result;
    }

    public static long factorialLong(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= n;
        }
        return result;
    }

    public static List<String> permutations(String input) {
        List<String> letters = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            letters.add(input.substring(i, i+1));
        }
        List<String> combinations = new ArrayList<>(letters);
        int count = 0;
        while(count < letters.size()){
            List<String> auxCombinations = new ArrayList<>(combinations);
            List<String> auxLetters = new ArrayList<>(letters);
            auxLetters.remove(count);
            for(String combination : combinations){
                for(String letter:auxLetters){
                    auxCombinations.add(combination+letter);
                }
            }
            combinations = auxCombinations;
        }
        return combinations;
    }

    public static boolean[] getNotPrimes() {
        boolean[] notPrimeNumbers = new boolean[200000];
        int current = 2;
        while (current < notPrimeNumbers.length) {
            if (!notPrimeNumbers[current]) {
                int mult = current * 2;
                while (mult < notPrimeNumbers.length) {
                    notPrimeNumbers[mult] = true;
                    mult += current;
                }
            }
            current++;
        }
        return notPrimeNumbers;
    }

}
