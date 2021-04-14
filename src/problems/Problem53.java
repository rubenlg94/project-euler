package problems;

import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Problem53 {

    public static void combinatoricSelections(){
        List<Long> factorials = new ArrayList<>();
        factorials.add(1L);
        int total = 0;
        for(int i = 1; i <= 100; i++){
            factorials.add(Utils.factorialLong(i));
        }
        for(int i = 100; i >= 1; i--){
            for(int j = i - 1; j >= 1; j++){
                long result = factorials.get(i) / (factorials.get(j) * factorials.get(i - j));
                if(result > 1000000){
                    total += j;
                    break;
                }
            }
        }
        System.out.println(total);
    }

}
