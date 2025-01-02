package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a total batting score: ");
        int score = in.nextInt();
        System.out.println("Number of dismissed: ");
        int dismiss = in.nextInt();

        System.out.println("Batting Average is: " + (float) score / dismiss);
    }
}
