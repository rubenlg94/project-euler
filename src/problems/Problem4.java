package problems;

import utils.Utils;

public class Problem4 {

    /*
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    Find the largest palindrome made from the product of two 3-digit numbers.
     */

    public static void solve() {
        largestPalindromeProduct();
    }

    public static void largestPalindromeProduct() {
        int result = 0;
        for (int i = 999; i > 0; i--) {
            for (int j = 999; j > 0; j--) {
                int product = i * j;
                if (Utils.isPalindrome(String.valueOf(product))) {
                    result = product;
                    break;
                }
            }
            if (result > 0) {
                break;
            }
        }
        System.out.println(result);
    }

}
