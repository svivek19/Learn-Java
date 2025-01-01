package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int res = 1;
        for (int i = 2; i <= num; i++){
            res *= i;
        }
        System.out.print(res);

    }

}
