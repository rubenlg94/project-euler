package problems;

import utils.Utils;

public class Problem50 {

    public static void solve() {
        consecutivePrimeSum();
    }

    public static void consecutivePrimeSum() {
        boolean[] numbers = Utils.getNotPrimes();
        int numberOfPrimes = 0;
        int result = 0;
        for (int i = 2; i <= 1000000; i++) {
            int auxResult = 0;
            int auxNumberOfPrimes = 0;
            for (int j = i; j <= 1000000; j++) {
                if (!numbers[j]) {
                    auxNumberOfPrimes++;
                    auxResult += j;
                    if(auxResult == 997663){
                        System.out.println();
                    }
                    if (auxNumberOfPrimes > numberOfPrimes && auxResult > 1000 && auxResult < 1000000 && !numbers[auxResult]) {
                        result = auxResult;
                        numberOfPrimes = auxNumberOfPrimes;
                    }
                }
                if (auxResult > 1000000) {
                    break;
                }
            }
        }
        System.out.println(result);
        System.out.println(numberOfPrimes);
    }

    public static void consecutivePrimeSum2(){
        boolean[] numbers = Utils.getNotPrimes();
        int numberOfPrimes = 0;
        int result = 0;
        for (int i = 2; i <= 1000000; i++) {
            int auxResult = 0;
            int auxNumberOfPrimes = 0;
            for (int j = i; j <= 1000000; j++) {
                if (!numbers[j]) {
                    auxNumberOfPrimes++;
                    auxResult += j;
                    if (auxNumberOfPrimes > numberOfPrimes && auxResult > 1000 && auxResult < 1000000 && !numbers[auxResult]) {
                        result = auxResult;
                        numberOfPrimes = auxNumberOfPrimes;
                    }
                }
                if (auxResult > 1000000) {
                    break;
                }
            }
        }
        System.out.println(result);
        System.out.println(numberOfPrimes);
    }

}
