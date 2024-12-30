package condition_and_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

       int max = Math.max(c, Math.max(a,b));

        System.out.println("Max" + " " + max);

    }
}
