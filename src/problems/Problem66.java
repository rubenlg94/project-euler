package problems;

import utils.Utils;

public class Problem66 {

    /*
    Consider quadratic Diophantine equations of the form:
    x2 – Dy2 = 1
    For example, when D=13, the minimal solution in x is 6492 – 13×1802 = 1.
    It can be assumed that there are no solutions in positive integers when D is square.
    By finding minimal solutions in x for D = {2, 3, 5, 6, 7}, we obtain the following:
    32 – 2×22 = 1
    22 – 3×12 = 1
    92 – 5×42 = 1
    52 – 6×22 = 1
    82 – 7×32 = 1
    Hence, by considering minimal solutions in x for D ≤ 7, the largest x is obtained when D=5.
    Find the value of D ≤ 1000 in minimal solutions of x for which the largest value of x is obtained.
     */

    private static boolean[] squares = Utils.getSquares(100000000);

    public static void solve() {
        System.out.println(661);
        diophantineEquation();
    }

    private static void diophantineEquation() {
        System.out.println();
        long result = 0;
        for(int i = 1; i < 1000; i++) {
            if(!squares[i]) {
                long possibleResult = solveEquation(i);
                if(possibleResult > result) {
                    result = possibleResult;
                }
            }
        }
        System.out.println(result);
    }

    private static long solveEquation(int d) {

        boolean found = false;
        int y = 1;
        long result = 0;
        while(!found) {
            result = d * (long) Math.pow(y, 2);
            result = 1 + result;
            if(Utils.isSquare(result)) {
                found = true;
                result = (int) Math.sqrt(result);
                System.out.println("d = " + d + ", x = " + result + ", y = " + y);
            }
            else {
                y++;
            }
        }
        return result;
    }

//    private static long solveEquation(int d, int currentResult) {
//        System.out.println("solving solution for d = " + d);
//        boolean found = false;
//        long result = ((long) Math.pow(currentResult, 2) + 1) / d;
//        int y = 1;
//        long result = 0;
//        while(!found) {
//            result = d * (long) Math.pow(y, 2);
//            result = 1 + result;
//            if(Utils.isSquare(result)) {
//                found = true;
//                result = (int) Math.sqrt(result);
//            }
//            else {
//                y++;
//            }
//        }
//        return result;
//    }

}
