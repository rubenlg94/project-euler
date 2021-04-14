package problems;

import utils.Utils;

public class Problem43 {

    public static void solve() {
        substringDivisibility();
    }

    public static void substringDivisibility(){
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] auxNumbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuilder pandigital = new StringBuilder();
        int current = 0;
        for(int i = 0; i < numbers.length; i++){
            int factorial = Utils.factorial(i);
            int selected = current / factorial;
            current = current % factorial;
            while (pandigital.toString().contains(String.valueOf(auxNumbers[selected]))){
                selected++;
                if(selected >= auxNumbers.length){
                    selected = 0;
                }
            }
            pandigital.append(auxNumbers[selected]);

        }
    }

}
