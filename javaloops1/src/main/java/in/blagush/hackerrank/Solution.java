package in.blagush.hackerrank;

import java.util.Scanner;

/**
 * Hackerrank problems solving
 * https://www.hackerrank.com/challenges/java-loops-i/problem
 * <p>
 * Submitted by Dmitry Blagushin (aka Dzmitry Blahushyn)
 * 25/12/2019
 */


public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }

        scanner.close();
    }
}

