package problems;

import utils.Utils;

public class Problem3 {

    /*
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?
     */

    public static void solve(){
        largestPrimeFactor();
    }

    public static void largestPrimeFactor() {
        long number = 600851475143L;
        int numberSqrt = (int) Math.sqrt(number);
        boolean found = false;
        while(!found){
            if(number % numberSqrt == 0 && Utils.isPrime(numberSqrt)){
                found = true;
            }
            else {
                numberSqrt--;
            }
        }
        System.out.println(numberSqrt);
    }

}
