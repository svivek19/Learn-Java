package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class DepreciationofValue {
    static float depreciation (float v, float t, float r){
        return (float) (v  * Math.pow((1 - r / 100), t));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the initial value (V): ");
        float v = in.nextFloat();
        System.out.println("Enter the time period (T): ");
        float t = in.nextFloat();
        System.out.println("Enter the rate of depreciation (R): ");
        float r = in.nextFloat();

        System.out.println("Depreciation of Value is: " + depreciation(v , t, r));
    }
}
