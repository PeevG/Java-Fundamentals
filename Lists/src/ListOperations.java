import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputParts = input.split(" ");
            String command = inputParts[0];

            if (command.equals("Add")) {
                int numToAdd = Integer.parseInt(inputParts[1]);
                numbers.add(numToAdd);
            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(inputParts[2]);
                if (numbers.size() > index && index >= 0) {
                    numbers.add(index, Integer.parseInt(inputParts[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Remove")) {
                int index = Integer.parseInt(inputParts[1]);
                if (numbers.size() >= index && index >= 0) {
                    numbers.remove(Integer.parseInt(inputParts[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.equals("Shift")) {
                int count = Integer.parseInt(inputParts[2]);
                if (inputParts[1].equals("left")) {
                    for (int i = 0; i < count; i++) {
                        int first = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(first);
                    }
                } else if (inputParts[1].equals("right")) {
                    for (int i = 0; i < count; i++) {
                        int last = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.size() - 1);
                        numbers.add(0, last);
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
