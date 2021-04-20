package problems;

import utils.Utils;

import java.util.List;

public class Problem69 {

    public static void solve(){
        totientMaximum();
    }

    private static void totientMaximum() {
        for(int i = 2; i < 1000000; i++) {
            List<Integer> totients = Utils.relativelyPrimes(i);
            double result = (double) i / (double) totients.size();
            System.out.println(result);
        }

    }

}
