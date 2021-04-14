package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem33 {

    public static void solve() {
        digitCancellingFractions();
    }

    public static void digitCancellingFractions() {
        List<List<Integer>> fractions = new ArrayList<>();
        for (int numerator = 10; numerator < 99; numerator++) {
            for (int denominator = numerator + 1; denominator < 100; denominator++) {
                if (isPermutation(numerator, denominator)) {
                    if (isDummieDivision(numerator, denominator)) {
                        List<Integer> fraction = new ArrayList<>();
                        fraction.add(numerator);
                        fraction.add(denominator);
                        fractions.add(fraction);
                    }
                }
            }
        }
        long numerator = 1, denominator = 1;
        for (List<Integer> fraction : fractions) {
            numerator = numerator * fraction.get(0);
            denominator = denominator * fraction.get(1);
        }
        System.out.println(denominator / lowestCommonMult(numerator, denominator));
    }

    public static boolean isPermutation(int a, int b) {
        int count = 0;
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        for (int i = 0; i < strA.length(); i++) {
            String digit = strA.substring(i, i + 1);
            if (strB.contains(digit) && strA.indexOf(digit) != strB.indexOf(digit)) {
                count++;
            }
        }
        return count == 1;
    }

    public static boolean isDummieDivision(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        List<String> toRemove = new ArrayList<>();
        for (int i = 0; i < strA.length(); i++) {
            String digit = strA.substring(i, i + 1);
            if (strB.contains(digit)) {
                toRemove.add(digit);
            }
        }
        for (String remove : toRemove) {
            strA = strA.replaceFirst(remove, "");
            strB = strB.replaceFirst(remove, "");
        }
        double numA = Double.parseDouble(strA);
        double numB = Double.parseDouble(strB);
        return (double) a / (double) b == numA / numB;
    }

    public static long lowestCommonMult(long a, long b) {
        if (a == 0)
            return b;

        return lowestCommonMult(b % a, a);
    }

}
