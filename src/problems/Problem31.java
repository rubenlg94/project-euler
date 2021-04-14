package problems;

public class Problem31 {

    public static void solve() {
        digitFifthPowers();
    }

    public static void digitFifthPowers() {
        int result = 0;
        for (long digit1 = 0; digit1 < 10; digit1++) {
            for (long digit2 = 0; digit2 < 10; digit2++) {
                for (long digit3 = 0; digit3 < 10; digit3++) {
                    for (long digit4 = 0; digit4 < 10; digit4++) {
                        for (long digit5 = 0; digit5 < 10; digit5++) {
                            for (long digit6 = 0; digit6 < 10; digit6++) {
                                int pow = (int) (Math.pow(digit1, 5) + Math.pow(digit2, 5) + Math.pow(digit3, 5) + Math.pow(digit4, 5) + Math.pow(digit5, 5) + Math.pow(digit6, 5));
                                if (pow != 1) {
                                    result += pow;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

}
