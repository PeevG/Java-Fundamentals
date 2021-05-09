import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInt = Integer.parseInt(scanner.nextLine());
        int secondInt = Integer.parseInt(scanner.nextLine());
        int thirdInt = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractThirdFromSum(firstInt, secondInt, thirdInt));

    }

    static int sumOfFirstTwo(int first, int second) {
        return first + second;
    }

    static int subtractThirdFromSum(int a, int b, int c) {
        return sumOfFirstTwo(a, b) - c;
    }
}
