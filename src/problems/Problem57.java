package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem57 {

    public static void squareRootConvergents() {
        double squareRootOfTwo = Math.sqrt(2);
        List<Integer> numerators = new ArrayList<>();
        List<Integer> denominators = new ArrayList<>();
        numerators.add(3);
        denominators.add(2);
        while (numerators.size() < 1000) {
            denominators.add(denominators.get(denominators.size() - 1) + numerators.get(numerators.size() - 1));
            numerators.add((int) (squareRootOfTwo * denominators.get(denominators.size() - 1)));
        }

    }


}
