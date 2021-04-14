package problems;

import utils.Utils;

public class Problem36 {

    public static void solve() {
        doubleBasePalindromes();
    }

    public static void doubleBasePalindromes(){
        long result = 0;
        for(int i = 0; i < 1000000; i++){
            if(Utils.isPalindrome(String.valueOf(i)) && Utils.isPalindrome(Integer.toBinaryString(i))){
                result += i;
            }
        }
        System.out.println(result);
    }

}
