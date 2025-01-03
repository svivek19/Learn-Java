package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverseString = "";
        for (int i = s.length()-1; i >= 0; i--){
            reverseString += s.charAt(i);
        }
        System.out.println(reverseString);

    }
}
