package problems;

import utils.Utils;

public class Problem27 {

    public static void solve() {
        quadraticPrimes();
    }

    public static void quadraticPrimes() {
        long startAt = System.currentTimeMillis();
        long result = 0;
        int primes = 0;
        for (long a = -999; a <= 0; a++) {
            for (long b = -1000; b <= 1000; b++) {
                if (Utils.isPrime(b)) {
                    int auxPrimes = consecutivePrimes(a, b);
                    if (auxPrimes > primes) {
                        System.out.println("a: " + a + " b: " + b);
                        primes = auxPrimes;
                        result = a * b;
                    }
                }
            }
        }
        long endAt = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(endAt - startAt);

    }

    public static int consecutivePrimes(long a, long b) {
        int count = 0;
        long result = b;
        while (Utils.isPrime(result)) {
            count++;
            result = (count * count) + (count * a) + (b);
        }
        return count;
    }

}
