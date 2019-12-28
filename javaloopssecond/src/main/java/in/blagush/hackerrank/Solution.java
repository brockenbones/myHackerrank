package in.blagush.hackerrank;

import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            System.out.print(a + b);
            for (int j = 1; j < n; j++) {
                int summ = a;
                for (int k = 0; k <= j; k++) {
                    summ += (int) Math.pow(2, k) * b;
                }
                System.out.print(" " + summ);
            }
            System.out.println();
        }
        in.close();
    }
}
