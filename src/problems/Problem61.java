package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem61 {

    public static void cyclicalFigurateNumbers() {
        List<Integer> triangles = new ArrayList<>();
        List<Integer> squares = new ArrayList<>();
        List<Integer> pentagonals = new ArrayList<>();
        List<Integer> hexagonals = new ArrayList<>();
        List<Integer> heptagonals = new ArrayList<>();
        List<Integer> octagonals = new ArrayList<>();
        for (int i = 0; i < 250; i++) {
            triangles.add((i * (i + 1)) / 2);
            squares.add(i * i);
            pentagonals.add((i * ((3 * i) - 1)) / 2);
            hexagonals.add(i * ((2 * i) - 1));
            heptagonals.add((i * ((5 * i) - 3)) / 2);
            octagonals.add(i * ((3 * i) - 2));
        }
        triangles.removeIf(integer -> integer < 1000 || integer > 9999);
        squares.removeIf(integer -> integer < 1000 || integer > 9999);
        pentagonals.removeIf(integer -> integer < 1000 || integer > 9999);
        hexagonals.removeIf(integer -> integer < 1000 || integer > 9999);
        heptagonals.removeIf(integer -> integer < 1000 || integer > 9999);
        octagonals.removeIf(integer -> integer < 1000 || integer > 9999);

        int triangePosition = 0, squarePosition = 0, pentagonalPosition = 0, hexagonalPosition = 0, heptagonalPosition = 0, octagonalPosition = 0;
        for(Integer octagonal : octagonals){
            List<Integer> possibleTriangles = triangles.stream().filter(integer -> String.valueOf(integer).substring(0, 2).equals(String.valueOf(octagonal).substring(2))).collect(Collectors.toList());
            List<Integer> possibleHeptagonals = heptagonals.stream().filter(integer -> String.valueOf(integer).substring(0, 2).equals(String.valueOf(octagonal).substring(2))).collect(Collectors.toList());
            System.out.println();
        }
    }

}
