package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Problem62 {

    public static void cubicPermutations() {
        HashMap<String, List<Long>> sortedPows = new HashMap<>();
        int number = 1;
        for (; ; ) {
            long pow = (long) Math.pow(number, 3);
            char[] chars = String.valueOf(pow).toCharArray();
            Arrays.sort(chars);
            String strPow = new String(chars);
            if (!sortedPows.containsKey(strPow)) {
                List<Long> pows = new ArrayList<>();
                pows.add(pow);
                sortedPows.put(strPow, pows);
            } else {
                List<Long> pows = sortedPows.get(strPow);
                pows.add(pow);
                sortedPows.put(strPow, pows);
                if (pows.size() == 5) {
                    System.out.println(pows.get(0));
                    break;
                }
            }
            number++;
        }

    }

}
