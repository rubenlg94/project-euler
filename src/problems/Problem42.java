package problems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem42 {

    public static void solve() throws IOException {
        codedTriangleNumbers();
    }

    public static void codedTriangleNumbers() throws IOException {
        String fileContent = new String(Files.readAllBytes(Paths.get("./src/resources/p42_words.txt")));
        String[] words = fileContent.replace("\r", "").split(",");
        List<String> letters = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
        List<Integer> triangleNumbers = new ArrayList<>();
        triangleNumbers.add(1);
        int nMax = 1;
        int count = 0;
        for (String word : words) {
            int wordValue = 0;
            for (int i = 0; i < word.length(); i++) {
                String letter = word.substring(i, i + 1);
                wordValue += letter.indexOf(letter) + 1;
            }
        }
    }

}
