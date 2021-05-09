import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            printLineOfIncreasingNumbers(i);
        }

        for (int i = n - 1; i >= 1; i--) {
            printLineOfIncreasingNumbers(i);
        }
    }

    static void printLineOfIncreasingNumbers(int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            System.out.print(i);
            if (i < maxNumber) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

