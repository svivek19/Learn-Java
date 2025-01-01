package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class CalculateAverageOfNNumbers {
    public static float avgOfNumbers(int n){
            return (float) (1 + n)/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(avgOfNumbers(n));
    }
}
