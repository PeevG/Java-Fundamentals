import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        for (int i = string.length() - 1; i >= 0; i--) {
            String reversedString = "";
            char ch = string.charAt(i);
            reversedString += ch;

            System.out.print(reversedString);
        }

    }
}
