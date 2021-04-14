package problems;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Problem51 {

    public static void solve() {
        primeDigitReplacements();
    }

    public static void primeDigitReplacements() {
        boolean[] notPrimes = Utils.getNotPrimes();
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < notPrimes.length; i++) {
            if (!notPrimes[i]) {
                primes.add(i);
            }
        }
    }

}
