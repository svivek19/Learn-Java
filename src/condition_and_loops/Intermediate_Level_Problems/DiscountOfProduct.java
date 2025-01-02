package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter original price: ");
        double originalPrice = in.nextDouble();
        System.out.println("Enter Discount %: ");
        double discount = in.nextDouble();

        double dicount_amount = originalPrice * discount / 100;
        double balance_amount = originalPrice - dicount_amount;

        System.out.println("discount amount is: " + dicount_amount);
        System.out.println("balance amount is: " + balance_amount);
    }
}
