import java.io.*;
import java.util.*;

/**
 * Hackerrank problems solving
 * https://www.hackerrank.com/challenges/sock-merchant
 * <p>
 * Submitted by Dmitry Blagushin (aka Dzmitry Blahushyn)
 * 21/12/2019
 */


public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> socks = new HashMap<Integer, Integer>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            int socksByColor = socks.getOrDefault(ar[i], 0);
            socks.put(ar[i], socksByColor + 1);
        }

        Collection<Integer> values = socks.values();

        for (Integer value : values) {
            pairs += value / 2;
        }
        
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}