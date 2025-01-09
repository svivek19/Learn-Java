package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while (n != 0){
            int last = n % 10;
            sum += last;
            n /= 10;
        }
        System.out.println(sum);
    }
}
