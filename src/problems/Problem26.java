package problems;

import java.util.Arrays;

public class Problem26 {

    public static void solve() {
        reciprocalCycles();
    }

    public static void reciprocalCycles(){
        long result = 0;
        for(double i = 2; i < 1000; i++){
            double fraction = 1 / i;
            long fractionCycle = Arrays.asList(String.valueOf(fraction).toCharArray()).stream().distinct().count();
            if(fractionCycle > result){
                result = fractionCycle;
                System.out.println("i: "+i+" cycle: "+result);
            }
        }
        System.out.println(result);
    }

}
