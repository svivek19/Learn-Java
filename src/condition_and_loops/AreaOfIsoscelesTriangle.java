package condition_and_loops;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the equal side: ");
        double side = in.nextDouble();
        System.out.println("Enter the base of the triangle: ");
        double base = in.nextDouble();

        double height = Math.sqrt(side * side - (base / 2 * base / 2));

        double area = base * height / 2 ;

        System.out.println("Area of Isosceles Triangle is: " + area);
    }
}
