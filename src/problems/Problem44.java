package problems;

public class Problem44 {

    public static void solve() {
        pentagonNumbers();
    }

    public static void pentagonNumbers() {
        int[] triangulars = new int[1000000];
        triangulars[0] = 1;
        triangulars[1] = 5;
        int increase = 7;
        for (int i = 2; i < 1000000; i++) {
            triangulars[i] = triangulars[i - 1] + increase;
            increase += 3;
        }
    }

}
