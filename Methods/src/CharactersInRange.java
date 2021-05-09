import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        printingChars(firstChar, secondChar);
    }

    static void printingChars(char a, char b) {
        if (a < b) {
            for (char i = (char) (a + 1); i < b; i++) {
                System.out.print(i + " ");
            }
        } else for (char i = (char) (b + 1); i < a; i++) {
            System.out.print(i + " ");
        }
    }
}

