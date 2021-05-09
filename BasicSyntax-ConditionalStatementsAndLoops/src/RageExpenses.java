import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = scanner.nextInt();
        double headsetPrice = scanner.nextDouble();
        double mousePrice = scanner.nextDouble();
        double keyboardPrice = scanner.nextDouble();
        double displayPrice = scanner.nextDouble();

        double headsetCost = (lostGamesCount / 2) * headsetPrice;
        double miceCost = (lostGamesCount / 3) * mousePrice;
        double keyboardCost = (lostGamesCount / 6) * keyboardPrice;
        double displayCost = (lostGamesCount / 12) * displayPrice;
        double expenses = headsetCost + miceCost + keyboardCost + displayCost;

        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}