import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        String input = scanner.nextLine();
        String[] items = input.split(" ");
        int[] array = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            array[i] = Integer.parseInt(items[i]);
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}