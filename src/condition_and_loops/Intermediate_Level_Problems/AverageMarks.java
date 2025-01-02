package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int t = in.nextInt();
        int e = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int ss = in.nextInt();

        float result = (float) (t + e + m + s + ss) /5;
        System.out.println(result);

    }
}
