package problems;

public class Problem6 {

    /*
    The sum of the squares of the first ten natural numbers is,
    1^2 + 2^2 + ... + 10^2 = 385
    The square of the sum of the first ten natural numbers is,
    (1 + 2 + ... + 10)^2 = 55^2 = 3025
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
    3025 - 385 = 2640.
    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */

    public void solve() {
        sumSquareDifference();
    }

    public static void sumSquareDifference() {
        int sumOfTheSquares = 0;
        int sumOfTheNumbers = 0;
        for (int i = 0; i <= 100; i++) {
            sumOfTheSquares += i * i;
            sumOfTheNumbers += i;
        }
        System.out.println((sumOfTheNumbers * sumOfTheNumbers) - sumOfTheSquares);
    }

}
