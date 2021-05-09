import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (operator.equals("/")) {
            System.out.println((delenie(firstNumber, secondNumber)));
        } else if (operator.equals("*")) {
            System.out.println((umnojenie(firstNumber, secondNumber)));
        } else if (operator.equals("+")) {
            System.out.println((plius(firstNumber, secondNumber)));
        } else if (operator.equals("-")) {
            System.out.println((izvajdane(firstNumber, secondNumber)));

        }
    }

    static int delenie(int a, int b) {
        return a / b;
    }

    static int umnojenie(int a, int b) {
        return a * b;
    }

    static int plius(int a, int b) {
        return a + b;
    }

    static int izvajdane(int a, int b) {
        return a - b;
    }
}
