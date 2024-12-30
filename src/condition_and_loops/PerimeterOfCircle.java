package condition_and_loops;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float r = in.nextFloat();
        double pi = Math.PI;
        double result = 2 * pi * (r);

        System.out.println("Perimeter Of Circle: " + result);

    }
}
