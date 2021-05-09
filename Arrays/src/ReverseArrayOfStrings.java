import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        for (int i = 0; i < strings.length / 2; i++) {

            int swapIndex = strings.length - i - 1;

            String tmp = strings[i];
            strings[i] = strings[swapIndex];
            strings[swapIndex] = tmp;
        }
        System.out.println(String.join(" ", strings));
    }
}
