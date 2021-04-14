package problems;

import utils.Utils;

import java.util.List;

public class Problem39 {

    public static void solve() {
        integerRightTriangles();
    }

    public static void integerRightTriangles() {
        long number = 5;
        List<Long> primeFactors = Utils.getPrimeFactors(number);
        long result = 5;
        while (number <= 1000) {
            if (number == 840) {
                System.out.println();
            }
            List<Long> auxPrimeFactors = Utils.getPrimeFactors(number);
            if (auxPrimeFactors.size() >= primeFactors.size()) {
                primeFactors = auxPrimeFactors;
                result = number;
            }
            number++;
        }
        System.out.println(result);
    }

}
