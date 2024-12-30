import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius value: ");

        int area = sc.nextInt();
        double result = Math.PI * (area * area);

        System.out.println("Area is: " + result);
    }
}
