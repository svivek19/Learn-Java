package condition_and_loops;

import java.util.Scanner;

public class SumofAllNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int n;

        do {
            n = sc.nextInt();
            s += n;
        } while ( n != 0);
        System.out.println("Sum: " + s );
    }
}
