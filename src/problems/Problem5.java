package problems;

public class Problem5 {

    /*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */

    public static void solve(){
        smallestMultiple();
    }

    public static void smallestMultiple() {
        long number = 20;
        long increase = 20;
        long next = 19;
        while (next > 1) {
            if (number % next == 0) {
                increase = number;
                next--;
            } else {
                number += increase;
            }
        }
        System.out.println(number);
    }

}
