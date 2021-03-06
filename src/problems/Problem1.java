package problems;

public class Problem1 {

    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
     */

    public static void solve() {
        multiplesOf3And5();
    }

    public static void multiplesOf3And5() {
        int result = 0;
        for (int i = 3; i < 1000; i++) {
            if (isMultipleOf3or5(i)) {
                result += i;
            }
        }
        System.out.println(result);
    }

    private static boolean isMultipleOf3or5(int number) {
        return number % 3 == 0 || number % 5 == 0;
    }

}
