import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isBetween = charactersLength(input);
        boolean isLetterOrDigits = ifOnlyLettersAndDigits(input);
        boolean isHasTwoDigits = ifHasTwoDigits(input);

        if (isBetween && isLetterOrDigits && isHasTwoDigits) {
            System.out.println("Password is valid");
        }
        if (!isBetween) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isLetterOrDigits) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isHasTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    static boolean charactersLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    static boolean ifOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isDigit = (symbol >= 48 && symbol <= 57);
            boolean isLetter = (symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122);

            if (!isDigit && !isLetter) {
                return false;
            }
        }
        return true;
    }


    static boolean ifHasTwoDigits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                counter++;
            }
        }
        if (counter >= 2) {
            return true;
        }
        return false;
    }
}
