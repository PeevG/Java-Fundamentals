import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        printMatrix(input);

    }

    static void printMatrix(int input) {

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print(input + " ");

            }
            System.out.println();
        }

    }
}
