package condition_and_loops;

import java.util.Scanner;

public class FactorsOftheNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a input: ");
        int num = in.nextInt();

        for ( int i = 1; i <= num; ++i){
            if (num % i == 0){
                System.out.println(i + " × " + (num / i) + " = " + num);
            }
        }
    }
}
