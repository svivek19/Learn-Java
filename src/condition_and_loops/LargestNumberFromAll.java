package condition_and_loops;

import java.util.Scanner;

public class LargestNumberFromAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n , res = Integer.MIN_VALUE;

        do {
           n = in.nextInt();
           res = Math.max(res, n);
        } while ( n != 0);

        System.out.println("Max number is: " + res);
    }
}
