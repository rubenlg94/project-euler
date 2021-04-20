package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Utils {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isEven(long number) {
        return number % 2 == 0;
    }

    public static final String[] numNames = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    public static final String[] tensNames = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

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
                while (number % factor == 0) {
                    number = number / factor;
                }
                primeFactors.add(factor);
            }
            factor++;
        }
        primeFactors.add(number);
        return primeFactors;
    }

    public static List<Integer> divisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
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
            result *= i;
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
            letters.add(input.substring(i, i + 1));
        }
        List<String> combinations = new ArrayList<>(letters);
        int count = 0;
        while (count < letters.size()) {
            List<String> auxCombinations = new ArrayList<>(combinations);
            List<String> auxLetters = new ArrayList<>(letters);
            auxLetters.remove(count);
            for (String combination : combinations) {
                for (String letter : auxLetters) {
                    auxCombinations.add(combination + letter);
                }
            }
            combinations = auxCombinations;
        }
        return combinations;
    }

    public static boolean[] getNotPrimes() {
        boolean[] notPrimeNumbers = new boolean[1000000];
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

    public static String numberToWords(int number) {
        String result = "";
        result += thousandsToWords(number);
        number = number >= 1000 ? number % 1000 : number;
        result += hundredsToWords(number);
        number = number >= 100 ? number % 100 : number;
        result += tensToWords(number);
        number = number >= 20 ? number % 10 : number;
        result += unitsToWords(number);
        return result;
    }

    private static String thousandsToWords(int number) {
        String result = "";
        if (number >= 1000) {
            result += numNames[number / 1000] + "thousand";
        }
        return result;
    }

    private static String hundredsToWords(int number) {
        String result = "";
        if (number >= 100) {
            result += numNames[number / 100] + "hundred";
            if (number % 100 > 0) {
                result += "and";
            }
        }
        return result;
    }

    private static String tensToWords(int number) {
        String result = "";
        if (number >= 20) {
            result += tensNames[number / 10];
        }
        return result;
    }

    private static String unitsToWords(int number) {
        String result = "";
        if (number > 0) {
            result += numNames[number];
        }
        return result;
    }

    public static boolean isAbundant(int number) {
        List<Integer> divisors = divisors(number);
        int divisorsSum = divisors.stream().reduce((integer, integer2) -> integer += integer2).orElse(0);
        return divisorsSum > number;
    }

    public static boolean[] getSquares(int size) {
        boolean[] squares = new boolean[size];
        for (int i = 0; i < (int) Math.sqrt(size); i++) {
                squares[i * i] = true;
        }
        return squares;
    }

    public static boolean isSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static boolean isSquare(long number) {
        long sqrt = (long) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static int eulerTotient(int number) {
        boolean[] totients = new boolean[number];
        totients[0] = false;
        for(int i = 2; i < number; i++) {
            if (!totients[i]) {
                if (number % i == 0) {
                    for (int j = i; j < number; j += i+1) {
                        totients[j] = true;
                    }
                }
            }
        }
        int contador = 0;
        for(int i = 1; i < totients.length; i++) {
            if(!totients[i]) {
                contador++;
            }
        }
        return contador;
    }

    public static List<Integer> relativelyPrimes(int number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            numbers.add(i);
        }
        List<Integer> divisors = divisors(number);
        for(int divisor : divisors) {
            numbers.removeIf(n -> n % divisor == 0);
        }
        return numbers;
    }

}
