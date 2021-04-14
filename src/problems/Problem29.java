package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem29 {

    public static void solve() {
        distinctPowers();
    }

    public static void distinctPowers() {
        long a = 2;
        long b = 2;
        List<Long> pows = new ArrayList<>();
        List<Long> result = new ArrayList<>();
        for (long l = 2; l <= 100; l++) {
            pows.add(l);
        }
        int position = 0;
        while (position < pows.size()) {
            long number = pows.get(position);
            position++;
        }
    }

}
