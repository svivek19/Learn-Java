package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class SumOfPositiveEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter numbers (enter 0 to terminate):");

        while (true){
            int num = scanner.nextInt();

            if (num == 0 ) break;

            if (num < 0){
                sumNegative += num;
            } else if (num > 0) {
                if (num % 2 == 0){
                    sumPositiveEven += num;
                } else {
                    sumPositiveOdd += num;
                }
            }
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

        scanner.close();
    }
}
