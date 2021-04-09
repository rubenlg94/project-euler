package problems;

public class Problem9 {

    /*
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
    a^2 + b^2 = c^2
    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.
     */

    public static void solve() {
        specialPythagoreanTriplet();
    }

    public static void specialPythagoreanTriplet() {
        boolean found = false;
        for (int i = 1; i < 1000 && !found; i++) {
            for (int j = i + 1; j < 1000 && !found; j++) {
                if (i + j > 1000) {
                    break;
                }
                for (int k = j + 1; k < 1000 && !found; k++) {
                    if (i + j + k > 1000) {
                        break;
                    }
                    if (i + j + k == 1000 && isPythagorean(i, j, k)) {
                        found = true;
                        System.out.println(i);
                        System.out.println(j);
                        System.out.println(k);
                        System.out.println(i * j * k);
                    }
                }
            }
        }
    }

    public static boolean isPythagorean(int num1, int num2, int num3) {
        long num1Pow = num1 * num1;
        long num2Pow = num2 * num2;
        long num3Pow = num3 * num3;
        return num3Pow == num1Pow + num2Pow;
    }

}
