package problems;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Problem37 {

    public static void truncatablePrimes() {
        List<String> notPrimes = new ArrayList<>();
        long result = 0;
        int number = 10;
        int count = 0;
        while (count < 11) {
            String strNumber = String.valueOf(number);
            if (notPrimes.stream().noneMatch(s -> s.contains(strNumber) || strNumber.contains(s))) {
                if (isTruncatablePrime(number, notPrimes) && Utils.isPrime(number)) {
                    count++;
                    result += number;
                }
            }
            number++;
        }
        System.out.println(result);
    }

    public static boolean isTruncatablePrime(int number, List<String> notPrimes) {
        String strNumber = String.valueOf(number);
        for (int i = 1; i < strNumber.length(); i++) {
            String auxNumber = strNumber.substring(i);
            if (!Utils.isPrime(Integer.parseInt(auxNumber))) {
                notPrimes.add(strNumber);
                return false;
            }
        }
        for (int i = strNumber.length(); i > 0; i--) {
            String auxNumber = strNumber.substring(0, i);
            if (!Utils.isPrime(Integer.parseInt(auxNumber))) {
                notPrimes.add(strNumber);
                return false;
            }
        }
        return true;
    }

}
