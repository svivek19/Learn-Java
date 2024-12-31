package condition_and_loops;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int add  = num1 + num2;

        System.out.println("Addition Of Two Numbers is: " + add);
    }
}
