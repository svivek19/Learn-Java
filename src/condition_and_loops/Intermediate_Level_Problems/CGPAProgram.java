package condition_and_loops.Intermediate_Level_Problems;

import java.util.Scanner;

public class CGPAProgram {
    static float cgpaCalc (float tamil, float english, float maths, float science, float social){
        return (tamil + english + maths + science + social) / 5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tamil mark: ");
        float tamil = sc.nextFloat();
        System.out.println("Enter english mark: ");
        float english = sc.nextFloat();
        System.out.println("Enter maths mark: ");
        float maths = sc.nextFloat();
        System.out.println("Enter science mark: ");
        float science = sc.nextFloat();
        System.out.println("Enter social mark: ");
        float social = sc.nextFloat();

        System.out.println("CGPA is: " + cgpaCalc(tamil, english, maths, science, social));
    }
}
