import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (input) {
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber, secondNumber);
                break;

        }

    }

    static void add(int numberOne, int numberTwo) {
        System.out.println(numberOne + numberTwo);
    }

    static void multiply(int numberOne, int numberTwo) {
        System.out.println(numberOne * numberTwo);
    }

    static void subtract(int numberOne, int numberTwo) {
        System.out.println(numberOne - numberTwo);
    }

    static void divide(int numberOne, int numberTwo) {
        System.out.println(numberOne / numberTwo);
    }

}
