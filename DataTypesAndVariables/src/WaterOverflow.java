import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int currentCapacity = 0;
        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (currentCapacity + liters > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                currentCapacity += liters;
            }
        }
        System.out.println(currentCapacity);
    }
}