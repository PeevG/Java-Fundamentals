import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int smallerFirst = getSmallestNumber(a, b);
        int smallestNumber = getSmallestNumber(smallerFirst, c);

        System.out.println(smallestNumber);
    }

    static int getSmallestNumber(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}
