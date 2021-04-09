package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {

    /*
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    Find the sum of all the primes below two million.
     */

    public static void solve() {
        summationOfPrimes();
    }

    public static void summationOfPrimes() {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        long result = 2L;
        for (int i = 3; i < 2000000; i += 2) {
            int count = 0;
            boolean isPrime = true;
            while (count < primes.size() && isPrime) {
                if (i % primes.get(count) == 0) {
                    isPrime = false;
                }
                count++;
            }
            if (isPrime) {
                primes.add(i);
                result += i;
            }
        }
        System.out.println(result);
    }

}
