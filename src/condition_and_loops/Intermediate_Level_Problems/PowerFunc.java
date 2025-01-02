package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class PowerFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a and b values: ");
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(Math.pow(a , b));
    }
}
