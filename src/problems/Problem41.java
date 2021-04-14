package problems;

import utils.Utils;

public class Problem41 {

    public static void solve() {
        pandigitalPrime();
    }

    public static void pandigitalPrime() {
        long number = 987654321;
        boolean found = false;
        while (!found) {
            found = true;
            String strNumber = String.valueOf(number);
            for (int i = 0; i < strNumber.length(); i++) {
                if (!strNumber.contains(String.valueOf(i + 1))) {
                    found = false;
                    break;
                }
            }
            if (found && !Utils.isPrime(number)) {
                found = false;
            }
            if (!found) {
                number--;
            }
        }
        System.out.println(number);
    }

}

