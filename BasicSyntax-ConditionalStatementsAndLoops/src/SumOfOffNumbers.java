import java.util.Scanner;

public class SumOfOffNumbers {
    public static void main(String[] args) {

        int countOddToPrint = new Scanner(System.in).nextInt();

        int printedCount = 0;
        int number = 0;
        int sum = 0;

        while (printedCount < countOddToPrint) {
            number++;
            if (number % 2 == 1) {
                System.out.println(number);
                printedCount++;
                sum += number;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}