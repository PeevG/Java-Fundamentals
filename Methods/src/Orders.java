import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                coffeePrice(quantity);
                break;
            case "water":
                waterPrice(quantity);
                break;
            case "coke":
                cokePrice(quantity);
                break;
            case "snacks":
                snacksPrice(quantity);
                break;
        }
    }

    static void coffeePrice(int quantity) {
        double priceOfCoffee = 1.50;
        System.out.printf("%.2f", priceOfCoffee * quantity);
    }

    static void waterPrice(int quantity) {
        double priceOfWater = 1.00;
        System.out.printf("%.2f", priceOfWater * quantity);
    }

    static void cokePrice(int quantity) {
        double priceOfCoke = 1.40;
        System.out.printf("%.2f", priceOfCoke * quantity);
    }

    static void snacksPrice(int quantity) {
        double priceOfSnacks = 2.00;
        System.out.printf("%.2f", priceOfSnacks * quantity);
    }
}
