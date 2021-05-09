import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayToStay = scanner.nextLine();

        double price = 0;
        switch (groupType) {
            case "Students":
                switch (dayToStay) {
                    case "Friday":
                        price = groupSize * 8.45;
                        break;
                    case "Saturday":
                        price = groupSize * 9.80;
                        break;
                    case "Sunday":
                        price = groupSize * 10.46;
                        break;
                }
                if (groupSize >= 30) {
                    price *= 0.85;
                }
                break;
            case "Business":
                if (groupSize >= 100) {
                    groupSize -= 10;
                }
                switch (dayToStay) {
                    case "Friday":
                        price = groupSize * 10.90;
                        break;
                    case "Saturday":
                        price = groupSize * 15.60;
                        break;
                    case "Sunday":
                        price = groupSize * 16.00;
                        break;
                }
                break;
            case "Regular":
                switch (dayToStay) {
                    case "Friday":
                        price = groupSize * 15;
                        break;
                    case "Saturday":
                        price = groupSize * 20;
                        break;
                    case "Sunday":
                        price = groupSize * 22.50;
                        break;
                }
                if (groupSize >= 10 && groupSize <= 20) {
                    price *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}