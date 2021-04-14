package problems;

import java.math.BigInteger;

public class Problem25 {

    /*
    The Fibonacci sequence is defined by the recurrence relation:
    Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
    Hence the first 12 terms will be:
    F1 = 1
    F2 = 1
    F3 = 2
    F4 = 3
    F5 = 5
    F6 = 8
    F7 = 13
    F8 = 21
    F9 = 34
    F10 = 55
    F11 = 89
    F12 = 144
    The 12th term, F12, is the first term to contain three digits.
    What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
     */

    public static void solve() {
        day25();
    }

    public static void day25() {
        BigInteger bigInteger = BigInteger.valueOf(1);
        BigInteger bigInteger1 = BigInteger.valueOf(1);
        long position = 3;
        boolean found = false;
        while (!found) {
            BigInteger result = bigInteger.add(bigInteger1);
            if (result.toString().length() >= 1000) {
                found = true;
            } else {
                bigInteger = bigInteger1;
                bigInteger1 = result;
                position++;
            }
        }
        System.out.println(position);
    }

}
