package problems;

public class Problem52 {

    public static void permutedMultiples() {
        int number = 1;
        int count = 2;
        while (count <= 6) {
            boolean isPermutation = true;
            while (isPermutation && count <= 6) {
                int auxNumber = number * count;
                String strNumber = String.valueOf(number);
                String strAuxNumber = String.valueOf(auxNumber);
                if (strNumber.length() == strAuxNumber.length()) {
                    for (int i = 0; i < strNumber.length(); i++) {
                        if (!strAuxNumber.contains(strNumber.substring(i, i + 1))) {
                            isPermutation = false;
                            break;
                        }
                    }
                } else {
                    isPermutation = false;
                }
                count++;
            }
            if (!isPermutation) {
                count = 2;
                number++;
            }
        }
        System.out.println(number);
    }

}
