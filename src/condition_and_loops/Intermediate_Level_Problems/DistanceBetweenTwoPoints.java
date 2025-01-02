package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of x1: ");
        double x1 = in.nextDouble();
        System.out.println("Enter value of x2: ");
        double x2 = in.nextDouble();
        System.out.println("Enter value of y1: ");
        double y1 = in.nextDouble();
        System.out.println("Enter value of y2: ");
        double y2 = in.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;

        double distance = Math.sqrt(dx * dx + dy * dy);

        System.out.println("Distance is: " + distance);
    }
}
