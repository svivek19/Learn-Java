package condition_and_loops;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a p Diagonal: ");
        float p = in.nextFloat();
        System.out.println("Enter a q Diagonal: ");
        float q = in.nextFloat();

        float result = p*q/2;

        System.out.println("Area Of Rhombus: " + result);

    }
}
