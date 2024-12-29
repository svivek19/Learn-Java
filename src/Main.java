import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        armstrongNumber(a, b);

    }

    static void armstrongNumber(int a, int b){
        for (int i = a; i< b; i++){
            int number = i;
            int check = 0;

            while (number > 0){
                int reminder = number % 10;
                check += (reminder*reminder*reminder);
                number /= 10;
            }

            if (check == i){
                System.out.println(i + "Armstrong number");
            }
        }
    }
}
