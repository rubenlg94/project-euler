package problems;

import java.math.BigInteger;

public class Problem48 {

    public static void solve() {
        selfPowers();
    }

    public static void selfPowers(){
        int count = 1;
        BigInteger result = BigInteger.valueOf(0);
        while (count <= 1000){
            result = result.add(BigInteger.valueOf(count).pow(count));
            count++;
        }
        String strResult = result.toString();
        System.out.println(strResult.substring(strResult.length()-10));
    }

}
