package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfWeekArr = {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        int n = Integer.parseInt(scanner.nextLine());

        if (n  >= 1 && n <= 7){
            System.out.println(dayOfWeekArr[n - 1]);
        }else System.out.println("Invalid day!");
    }
}
