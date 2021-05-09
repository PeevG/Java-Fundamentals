import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");

        StringBuilder result = new StringBuilder();

        for (String s : str) {
            int count = s.length();
            for (int i = 0; i < count; i++) {
                result.append(s);
            }
        }
        System.out.println(result);

    }
}
