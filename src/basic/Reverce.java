package basic;

public class Reverce {
    public static void main(String[] args) {
        int num = 42424345;

        int ans = 0;

        while (num > 0){
            int reminder = num % 10;
            num /= 10;
            ans = ans * 10 + reminder;
        }

        System.out.println(ans);
    }
}
