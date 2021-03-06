package problems;

public class Problem12 {

    /*
    The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
    1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
    Let us list the factors of the first seven triangle numbers:
     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28
    We can see that 28 is the first triangle number to have over five divisors.
    What is the value of the first triangle number to have over five hundred divisors?
     */

    public static void solve() {
        highlyDivisibleTriangularNumber();
    }

    public static void highlyDivisibleTriangularNumber() {
        int number = 0;
        int increase = 1;
        while (numberOfDivisors(number) < 500) {
            number += increase;
            increase++;
        }
        System.out.println(number);
    }

    public static int numberOfDivisors(int number) {
        int nod = 0;
        int sqrt = (int) Math.sqrt(number);
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                nod += 2;
            }
        }
        if (sqrt * sqrt == number) {
            nod--;
        }
        return nod;
    }

}
