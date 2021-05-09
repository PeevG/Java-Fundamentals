import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double totalSpent = 0.0;

        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {

            if (input.equals("OutFall 4")) {
                if (balance >= 39.99) {
                    totalSpent += 39.99;
                    balance = balance - 39.99;
                    System.out.println("Bought OutFall 4");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("CS: OG")) {
                if (balance >= 15.99) {
                    totalSpent += 15.99;
                    balance = balance - 15.99;
                    System.out.println("Bought CS: OG");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("Zplinter Zell")) {
                if (balance >= 19.99) {
                    totalSpent += 19.99;
                    balance = balance - 19.99;
                    System.out.println("Bought Zplinter Zell");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("Honored 2")) {
                if (balance >= 59.99) {
                    totalSpent += 59.99;
                    balance = balance - 59.99;
                    System.out.println("Bought Honored 2");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("RoverWatch")) {
                if (balance >= 29.99) {
                    totalSpent += 29.99;
                    balance = balance - 29.99;
                    System.out.println("Bought RoverWatch");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (input.equals("RoverWatch Origins Edition")) {
                if (balance >= 39.99) {
                    totalSpent += 39.99;
                    balance = balance - 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                } else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }
            if (balance <= 0) {
                System.out.println("Out of money!");
                return;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, balance);
    }
}
