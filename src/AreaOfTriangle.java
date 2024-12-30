import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and height: ");

        int base = in.nextInt();
        int height = in.nextInt();

        int area = height * base / 2;

        System.out.println("Area of Triangle is: " + area);
    }
}
