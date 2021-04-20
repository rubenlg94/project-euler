package problems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem67 {

    /*
    By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
    3
    7 4
    2 4 6
    8 5 9 3
    That is, 3 + 7 + 4 + 9 = 23.
    Find the maximum total from top to bottom in triangle.txt (right click and 'Save Link/Target As...'), a 15K text file containing a triangle with one-hundred rows.
     */

    private static List<List<Integer>> triangle = new ArrayList<>();

    public static void solve() throws IOException {
        maximumPathSum2();
    }

    private static void maximumPathSum2() throws IOException {
        String fileContent = new String(Files.readAllBytes(Paths.get("./src/resources/p67_input.txt")));
        triangle = Arrays.stream(fileContent.replace("\r", "").split("\n"))
                .map(s -> Arrays.stream(s.split(" ")).map(Integer::parseInt).collect(Collectors.toList())).collect(Collectors.toList());
        for (int i = triangle.size() - 2; i >= 0; i--) {
            updateRow(i);
        }
        System.out.println(triangle.get(0).get(0));
    }

    private static void updateRow(int rowNumber) {
        List<Integer> row = triangle.get(rowNumber);
        for (int j = 0; j < row.size(); j++) {
            int num = row.get(j);
            int left = triangle.get(rowNumber + 1).get(j);
            int right = triangle.get(rowNumber + 1).get(j + 1);
            row.set(j, Math.max(num + left, num + right));
        }
    }
}
