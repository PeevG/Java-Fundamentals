import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());


        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputParts = input.split("\\s+");

            if (inputParts[0].equals("Add")) {
                int passengers = Integer.parseInt(inputParts[1]);
                wagons.add(passengers);
            } else {
                int passengers = Integer.parseInt(inputParts[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int totalPassengers = passengers + wagons.get(i);
                    if (totalPassengers <= maxCapacity) {
                        wagons.set(i, totalPassengers);
                        break;
                    }
                }

            }

            input = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");

        }
    }
}
