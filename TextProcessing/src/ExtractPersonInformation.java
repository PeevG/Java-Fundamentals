import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(scanner.nextLine());

            String name = sb.substring(sb.indexOf("@") + 1, sb.indexOf("|"));
            String age = sb.substring(sb.indexOf("#") + 1, sb.indexOf("*"));

            System.out.println(name + " is " + age + " years old.");
        }
    }
}
