package condition_and_loops;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a length and width: ");

        float length = in.nextFloat();
        float width = in.nextFloat();

        float result = length * width;
        System.out.println("Area of Rectangle is: " + result);
    }
}
