import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = scanner.nextInt();
        int ticketPrice = 0;

        switch (dayType.toLowerCase()) {
            case "weekday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 12;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 18;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 12;
                }
                break;
            case "weekend":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 15;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 20;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 15;
                }
                break;
            case "holiday":
                if (age >= 0 && age <= 18) {
                    ticketPrice = 5;
                } else if (age > 18 && age <= 64) {
                    ticketPrice = 12;
                } else if (age > 64 && age <= 122) {
                    ticketPrice = 10;
                }
                break;

        }
        if (ticketPrice != 0) {
            System.out.println(ticketPrice + "$");
        } else
            System.out.println("Error!");
    }
}
