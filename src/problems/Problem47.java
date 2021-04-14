package problems;

import utils.Utils;

public class Problem47 {

    public static void solve() {
        distinctPrimesFactors();
    }

    public static void distinctPrimesFactors(){
        int number = 2;
        int count = 0;
        while(count < 4){
            if(number == 134043){
                System.out.println();
            }
            if(Utils.primeFactors(number) == 4){
                count++;
            }
            else {
                count = 0;
            }
            number++;
        }
        System.out.println(number-4);
    }

}
