package problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem56 {

    public static void powerfulDigitSum() {
        List<BigInteger> bigIntegers = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 100; j++) {
                bigIntegers.add(BigInteger.valueOf(i).pow(j));
            }
        }
        long result = 0;
        for (BigInteger bigInteger : bigIntegers) {
            long auxResult = digitalSum(bigInteger);
            if(auxResult > result){
                result = auxResult;
            }
        }
        System.out.println(result);
    }

    public static long digitalSum(BigInteger bigInteger) {
        long result = 0;
        String strBigInteger = bigInteger.toString();
        for (int i = 0; i < strBigInteger.length(); i++) {
            result += Long.parseLong(strBigInteger.substring(i, i + 1));
        }
        return result;
    }

}
