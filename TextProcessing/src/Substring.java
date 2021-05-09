import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String string = scanner.nextLine();

        int index = string.indexOf(string);
        while (index != -1) {
            string = string.replace(word, "");
            index = string.indexOf(word);
        }
        System.out.println(string);
    }
}
