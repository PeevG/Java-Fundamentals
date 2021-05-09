import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("int")) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println(getBiggerNumber(a, b));
        } else if (input.equals("char")) {
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            System.out.println(getSymbol(a, b));
        } else if (input.equals("string")) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(getString(a, b));
        }

    }

    static int getBiggerNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static char getSymbol(char a, char b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static String getString(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }
}


