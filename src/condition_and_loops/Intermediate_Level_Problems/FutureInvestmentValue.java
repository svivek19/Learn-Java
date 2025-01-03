package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the present value (initial investment): ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double futureValue = calculateFutureValue(presentValue, annualInterestRate, years);

        System.out.printf("The future investment value is: %.2f\n", futureValue);

        scanner.close();
    }

    static double calculateFutureValue (double presentValue, double annualInterestRate, double years){
        double rate = annualInterestRate / 100;
        return presentValue * Math.pow(1 + rate, years);
    }


}
