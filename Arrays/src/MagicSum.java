import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayAsString = scanner.nextLine().split(" ");
        int[] numbers = new int[arrayAsString.length];

        for (int i = 0; i < arrayAsString.length; i++) {
            numbers[i] = Integer.parseInt(arrayAsString[i]);
        }
        int givenNumber = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == givenNumber) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
