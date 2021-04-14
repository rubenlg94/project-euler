package problems;

public class Problem40 {

    public static void solve() {
        champernownesConstant();
    }

    public static void champernownesConstant() {
        String champernowne = "";
        int number = 1;
        int result = 1;
        while (champernowne.length() < 1000000) {
            champernowne = String.format("%s%d", champernowne, number);
            number++;
        }
        for (int i = 1; i <= 1000000; i *= 10) {
            int digit = Integer.parseInt(champernowne.substring(i - 1, i));
            result *= digit;
        }
        System.out.println(result);
    }

}
