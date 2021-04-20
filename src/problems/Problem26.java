package problems;

public class Problem26 {

    public static void solve() {
        reciprocalCycles();
    }

    public static void reciprocalCycles() {
        int maxCycle = 0;
        int result = 2;
        for(int denominator = 2; denominator < 1000; denominator++) {
            int currentCycle = recurringCycle(denominator);
            if(currentCycle > maxCycle) {
                maxCycle = currentCycle;
                result = denominator;
            }
        }
        System.out.println(result);
    }

    private static int recurringCycle(int denominator) {
        double division = 1.0 / denominator;
        System.out.println(division);
        boolean found = false;
        int pow = 1;
        while(!found) {
            double result = division * Math.pow(10, pow);
            double decimalPart = result - (int) result;
            String strResult = String.valueOf(result);
            String strDivision = String.valueOf(division);
            if(decimalPart == 0 || strResult.substring(strResult.indexOf(".")).equals(strDivision.substring(strDivision.indexOf(".")))) {
                found = true;
            }
            else {
                pow++;
            }
        }
        return pow;
    }

}
