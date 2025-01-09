package condition_and_loops.Intermediate_Level_Problems;

public class DaysCalculate {
    public static void main(String[] args) {
        int may_month_count = 31;
        int count = 0;

        for (int day = 1; day <= may_month_count; day++){
            if (day % 2 == 0){
                count++;
            }
        }

        System.out.println("Vivek can go out on" + " " + count + " " + "day in may");
    }
}
