package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class CalculateCommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter total sales: ");
        double total = in.nextDouble();
        System.out.println("Enter commission earned: ");
        double commission = in.nextDouble();
        double presentage = commission / total * 100;
        System.out.println("Commission presentage is: " + presentage);

    }
}
