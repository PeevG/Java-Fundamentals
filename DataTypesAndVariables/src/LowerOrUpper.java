import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String character = scanner.nextLine();

        if (character == character.toLowerCase()) {
            System.out.println("lower-case");
        } else if (character == character.toUpperCase()) {
            System.out.println("upper-case");
        }
    }
}