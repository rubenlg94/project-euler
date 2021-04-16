package problems;

import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem24 {
    
    /*
    A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:    
    012   021   102   120   201   210   
    What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
     */

    private static List<Integer> factorials = new ArrayList<>();
    private static List<String> digits = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
    private static int permutation = 1000000 - 1;

    public static void solve() {
        lexicographicPermutations();
    }

    private static void lexicographicPermutations() {
        StringBuilder result = new StringBuilder();
        fillFactorials();
        for (int factorial : factorials) {
            int toInsert = permutation / factorial;
            result.append(digits.get(toInsert));
            permutation = permutation % factorial;
            digits.remove(toInsert);
        }
        System.out.println(result);
    }

    private static void fillFactorials() {
        for (int i = 9; i >= 0; i--) {
            factorials.add(Utils.factorial(i));
        }
    }

}
