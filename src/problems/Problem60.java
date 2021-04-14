package problems;

import utils.Utils;

public class Problem60 {

    public static void pairPrimeSets() {
        boolean[] numbers = Utils.getNotPrimes();
        int[] twoPrimesSet = new int[2];
        for (int i = 2; i < numbers.length && twoPrimesSet[0] == 0 && twoPrimesSet[1] == 0; i++) {
            for (int j = i + 1; j < numbers.length && twoPrimesSet[0] == 0 && twoPrimesSet[1] == 0; j++) {
                if (!numbers[i] && !numbers[j]) {
                    if ((i * 10) + j < numbers.length && (j * 10) + i < numbers.length) {
                        if (!numbers[(i * 10) + j] && !numbers[(j * 10) + i]) {
                            twoPrimesSet[0] = i;
                            twoPrimesSet[1] = j;
                        }
                    }
                }
            }
        }
        int[] threePrimesSet = new int[3];
        for (int i = twoPrimesSet[1] + 1; i < numbers.length && threePrimesSet[2] == 0; i++) {
            if (!numbers[i]) {
                if ((twoPrimesSet[0] * 10) + i < numbers.length && (twoPrimesSet[1] * 10) + i < numbers.length) {
                    if (!numbers[(twoPrimesSet[0] * 10) + i] && !numbers[(twoPrimesSet[1] * 10) + i]
                            && !numbers[(i * 10) + twoPrimesSet[0]] && !numbers[(i * 10) + twoPrimesSet[1]]) {
                        threePrimesSet[0] = twoPrimesSet[0];
                        threePrimesSet[1] = twoPrimesSet[1];
                        threePrimesSet[2] = i;
                    }
                }
            }
        }
        int[] fourPrimesSet = new int[4];
        for (int i = threePrimesSet[2] + 1; i < numbers.length && fourPrimesSet[3] == 0; i++) {
            if (!numbers[i]) {
                if ((threePrimesSet[0] * 10) + i < numbers.length && (threePrimesSet[1] * 10) + i < numbers.length && (threePrimesSet[2] * 10) + i < numbers.length) {
                    if (!numbers[(threePrimesSet[0] * 10) + i] && !numbers[(threePrimesSet[1] * 10) + i] && !numbers[(threePrimesSet[2] * 10) + i]
                            && !numbers[(i * 10) + threePrimesSet[0]] && !numbers[(i * 10) + threePrimesSet[1]] && !numbers[(i * 10) + threePrimesSet[2]]) {
                        fourPrimesSet[0] = threePrimesSet[0];
                        fourPrimesSet[1] = threePrimesSet[1];
                        fourPrimesSet[2] = threePrimesSet[2];
                        fourPrimesSet[3] = i;
                    }
                }
            }

        }
        int[] fivePrimeSet = new int[5];
        for (int i = fourPrimesSet[3] + 1; i < numbers.length && fivePrimeSet[3] == 0; i++) {
            if (!numbers[i]) {
                if ((fourPrimesSet[3] * 10) + i < numbers.length && (i*10) + fourPrimesSet[3] < numbers.length) {
                    if (!numbers[(fourPrimesSet[0] * 10) + i] && !numbers[(fourPrimesSet[1] * 10) + i] && !numbers[(fourPrimesSet[2] * 10) + i] && !numbers[(fourPrimesSet[3] * 10) + i]
                            && !numbers[(i * 10) + fourPrimesSet[0]] && !numbers[(i * 10) + fourPrimesSet[1]] && !numbers[(i * 10) + fourPrimesSet[2]] && !numbers[(i * 10) + fourPrimesSet[3]]) {
                        fivePrimeSet[0] = fourPrimesSet[0];
                        fivePrimeSet[1] = fourPrimesSet[1];
                        fivePrimeSet[2] = fourPrimesSet[2];
                        fivePrimeSet[3] = fourPrimesSet[3];
                        fivePrimeSet[4] = i;
                    }
                }
            }

        }
        System.out.println(fivePrimeSet[0] + fivePrimeSet[1] + fivePrimeSet[2] + fivePrimeSet[3] + fivePrimeSet[4]);
    }
}
