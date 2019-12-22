import java.util.Scanner;

/**
 * Hackerrank problems solving
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 * <p>
 * Submitted by Dmitry Blagushin (aka Dzmitry Blahushyn)
 * 22/12/2019
 */


public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int positionOverSeaLevel = 0;
        int valleys = 0;

        for (int i = 0; i < n; i++) {
            switch (s.charAt(i)) {
                case 'D':
                    if (positionOverSeaLevel == 0) {
                        valleys++;
                    }
                    positionOverSeaLevel--;
                    break;
                case 'U':
                    positionOverSeaLevel++;
                    break;
            }
        }
        return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int numberOfSteps = 8;
        String stepsLevel = "UDDDUDUU";

        int result = countingValleys(numberOfSteps, stepsLevel);

        System.out.println(result);
    }
}