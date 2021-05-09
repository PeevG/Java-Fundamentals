import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = parseLineOfNumbers(scanner);

        boolean search = true;
        while (search) {
            search = false;

            for (int i = 0; i < numbers.size() - 1; i++) {
                double current = numbers.get(i);
                double nextNumber = numbers.get(i + 1);
                if (current == nextNumber) {
                    numbers.remove(i);
                    numbers.set(i, current + nextNumber);
                    search = true;
                    break;
                }
            }

        }
        for (double number : numbers) {
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }
    }


    private static List<Double> parseLineOfNumbers(Scanner scanner) {
        String line = scanner.nextLine();

        String[] numbersAsStrings = line.split(" ");

        List<Double> numbers = new ArrayList<>();
        for (String s : numbersAsStrings) {
            double number = Double.parseDouble(s);
            numbers.add(number);
        }
        return numbers;
    }
}
