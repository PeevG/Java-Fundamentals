import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] lineElements = line.split(" ");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < lineElements.length; i++) {
            int nums = Integer.parseInt(lineElements[i]);
            numbers.add(nums);
        }

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputParts = input.split("\\s+");
            if (inputParts[0].equals("Delete")) {
                // while (!numbers.isEmpty()) {
                numbers.removeAll(Arrays.asList(Integer.parseInt(inputParts[1])));
                // }
            } else if (inputParts[0].equals("Insert")) {
                if (Integer.parseInt(inputParts[2]) < numbers.size()) {
                    numbers.add(Integer.parseInt(inputParts[2]), Integer.parseInt(inputParts[1]));
                }
            }

            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
