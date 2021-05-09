import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstArray = scanner.nextLine();
        String secondArray = scanner.nextLine();

        String[] firstArrayAsStrings = firstArray.split(" ");
        int[] firstArrayInNumbers = new int[firstArrayAsStrings.length];
        for (int i = 0; i < firstArrayAsStrings.length; i++) {
            firstArrayInNumbers[i] = Integer.parseInt(firstArrayAsStrings[i]);
        }

        String[] secondArrayAsStrings = secondArray.split(" ");
        int[] secondArrayInNumbers = new int[secondArrayAsStrings.length];
        for (int i = 0; i < secondArrayAsStrings.length; i++) {
            secondArrayInNumbers[i] = Integer.parseInt(secondArrayAsStrings[i]);
        }

        boolean areEqual = true;
        int differenceAtIndex = -1;
        if (firstArrayInNumbers.length == secondArrayInNumbers.length) {
            for (int i = 0; i < firstArrayInNumbers.length; i++) {
                if (firstArrayInNumbers[i] != secondArrayInNumbers[i]) {
                    areEqual = false;
                    differenceAtIndex = i;
                    break;
                }
            }
        } else {
            areEqual = false;
        }
        if (areEqual) {
            int sum = 0;
            for (int number : firstArrayInNumbers) {
                sum += number;
            }

            System.out.println("Arrays are identical." + " Sum: " + sum);
        } else {
            System.out.println("Arrays are not identical. Found difference at " + differenceAtIndex + " index.");
        }
    }
}