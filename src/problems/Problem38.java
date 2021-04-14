package problems;

public class Problem38 {

    public static void solve() {
        pandigitalMultiples();
    }

    public static void pandigitalMultiples() {
        int number = 9999;
        boolean found = false;
        while (!found) {
            String strNumber = String.valueOf(number);
            int multiply = 2;
            while(strNumber.length() < 9 && strNumber.chars().distinct().count() == strNumber.length()){
                strNumber = String.format("%s%s", strNumber, number*multiply);
                multiply++;
            }
            if(strNumber.chars().distinct().count() == 9 && !strNumber.contains("0")){
                found = true;
                System.out.println(strNumber);
            }
            else{
                number--;
            }
        }
    }

}
