package condition_and_loops;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Base: ");
        double base = sc.nextDouble();
        System.out.println("Enter a height: ");
        double height = sc.nextDouble();

        double result = base * height;
        System.out.println("Area Of Parallelogram is: " + result);
    }
}
