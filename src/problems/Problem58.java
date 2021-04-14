package problems;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Problem58 {

    public static boolean[] numbers = Utils.getNotPrimes();

    public static void spiralPrimes() {
        int number = 1;
        int increase = 2;
        List<Integer> diagonals = new ArrayList<>();
        diagonals.add(number);
        double ratio = 1;
        while (ratio > 0.1) {
            for (int i = 0; i < 4; i++) {
                number += increase;
                diagonals.add(number);
            }
            increase += 2;
            ratio = primeRatio(diagonals);
            System.out.println("Dimension: " + (increase + 1) + " Prime ratio: " + ratio);
        }
    }

    public static double primeRatio(List<Integer> diagonals) {
        double primes = 0;
        for (Integer number : diagonals) {
            if (number > 1 && !numbers[number]) {
                primes++;
            }
        }
        return primes / diagonals.size();
    }

}
