import java.util.Arrays;
import java.util.Scanner;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(" "))
                .map(s -> Integer.parseInt(s))
                .sorted((a, b) -> Integer.compare(b, a))
                .limit(3)
                .forEach(i -> System.out.print(i + " "));
    }
}
