import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceInMeters = Integer.parseInt(scanner.nextLine());
        double distanceInKilometers = distanceInMeters * 0.001;
        System.out.printf("%.2f", distanceInKilometers);

    }
}