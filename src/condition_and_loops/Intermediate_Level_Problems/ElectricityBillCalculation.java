package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class ElectricityBillCalculation {
    public static int calcBill(int units){
        if (units <= 100){
            System.out.println(units * 10);
        } else if (units <= 200) {
            System.out.println( (100 * 10) + (units - 100) * 15);
        } else if (units <= 300) {
            System.out.println( (100 * 10) + (units - 200) * 20);
        } else if ( units > 300) {
            System.out.println( (100 * 10) + (100 * 15) + (100 * 20) + (units - 300) * 25);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units: ");
        int units = sc.nextInt();
        calcBill(units);
    }
}
