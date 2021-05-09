import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String str : line) {
            int number = Integer.parseInt(str);
            numbers.add(number);
        }

        numbers.removeIf(n -> n < 0);
        Collections.reverse(numbers);


        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
