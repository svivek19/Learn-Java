package condition_and_loops;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a 'a' side: ");
        float side = in.nextFloat();

        double result = (Math.sqrt(3)/4) * Math.pow(side, 2);
        System.out.println("Area Of Equilateral Triangle is: " + result);
    }
}
