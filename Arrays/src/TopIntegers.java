import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayAsString = scanner.nextLine().split(" ");
        int[] array = new int[arrayAsString.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arrayAsString[i]);
        }
        for (int i = 0; i < array.length - 1; i++) {
            int currentNumber = array[i];
            boolean isTopInteger = true;
            for (int j = i + 1; j < array.length; j++) {
                if (currentNumber <= array[j]) {
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger) {
                System.out.print(currentNumber + " ");
            }
        }
        System.out.println(array[array.length - 1]);
    }
}
