package condition_and_loops;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a side: ");

        float side = in.nextFloat();
        float p = 3 * side;

        System.out.println("Perimeter Of Equilateral Triangle: " + p);
    }
}
