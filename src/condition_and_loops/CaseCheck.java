package condition_and_loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if (ch <= 'a' && ch <= 'z'){
            System.out.println("Uppercase");
        } else {
            System.out.println("Lowercase");
        }

    }
}
