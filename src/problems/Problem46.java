package problems;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Problem46 {

    public static void solve() {
        goldbachsOtherConjeture();
    }

    public static void goldbachsOtherConjeture() {
        List<Long> primes = new ArrayList<>();
        primes.add(2L);
        primes.add(3L);
        primes.add(5L);
        primes.add(7L);
        long count = 9;
        boolean found = false;
        while (!found) {
            if (Utils.isPrime(count)) {
                primes.add(count);
                count += 2;
            } else {
                long maximusPrime = primes.get(primes.size() - 1);
                long maxNumber = maximusPrime + (2 * ((count - 1) * (count - 1)));
                if (count > maxNumber) {
                    found = true;
                } else {
                    count += 2;
                }
            }
        }
        System.out.println(count);
    }

}
