import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        int repeatCounter = Integer.parseInt(scanner.nextLine());

        String repeated = repeatedStr(str, repeatCounter);
        System.out.println(repeated);
    }

    static String repeatedStr(String string, int counter) {

        String[] repetitions = new String[counter];

        for (int i = 0; i < counter; i++) {
            repetitions[i] = string;
        }
        return String.join("", repetitions);
    }
}
