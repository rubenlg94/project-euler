package problems;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Problem34 {

    public static void solve() {
        circularPrimes();
    }

    public static void circularPrimes() {
        List<Integer> checkedPrimes = new ArrayList<>();
        List<Integer> checkedNonPrimes = new ArrayList<>();
        long result = 0;
        for (int number = 2; number < 1000000 && checkedPrimes.size() + checkedNonPrimes.size() < 1000000; number++) {
            List<Integer> rotations = numberRotations(number);
            boolean allPrimes = true;
            for (Integer rotation : rotations) {
                if (!checkedPrimes.contains(rotation) && !checkedNonPrimes.contains(rotation)) {
                    if (Utils.isPrime(rotation)) {
                        checkedPrimes.add(rotation);
                    } else {
                        checkedNonPrimes.add(rotation);
                        allPrimes = false;
                    }
                }
            }
            if (allPrimes) {
                for (Integer rotation : rotations) {
                    result += rotation;
                }
            }
        }
        System.out.println(result);
    }

    public static List<Integer> numberRotations(int number) {
        List<Integer> rotations = new ArrayList<>();
        rotations.add(number);
        String strNum = String.valueOf(number);
        int position = 1;
        while (position < strNum.length()) {
            String firstDigit = strNum.substring(0, 1);
            strNum = String.format("%s%s", strNum.substring(1), firstDigit);
            rotations.add(Integer.parseInt(strNum));
            position++;
        }
        return rotations;
    }

}
