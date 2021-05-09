import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = calculateFactorialNum(firstNum) * 1.0 / calculateFactorialNum(secondNum);

        System.out.printf("%.2f", result);
    }

    static long calculateFactorialNum(int firstNum) {
        long factorial = 1;
        for (int i = 1; i <= firstNum; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
