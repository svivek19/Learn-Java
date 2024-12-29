import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int val = in.nextInt();

        int count = 0;

        while (val > 0){
            int reminder = val % 10;
            if (reminder == 3) count++;
            val /= 10;
        }

        System.out.println("No of counts: " + count );
    }
}
