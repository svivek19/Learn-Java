package condition_and_loops;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");
        int a = sc.nextInt();
        System.out.println("Enter the base: ");
        int b = sc.nextInt();

        int p = 2 * (a+b);

        System.out.println("Perimeter Of Parallelogram is: " + p);
    }
}
