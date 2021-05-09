import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
                "Sunday"};

        int day = new Scanner(System.in).nextInt();
        if (day >= 1 && day <= 7) {
            System.out.println(daysOfWeek[day - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}