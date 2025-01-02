package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for (int i =1; i <= num; ++i){
            sum += i;
        }

        System.out.println(sum);
    }
}
