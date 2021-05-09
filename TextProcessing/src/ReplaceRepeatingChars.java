import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        char base = line.charAt(0);
        sb.append(base);
        for (int i = 1; i < line.length(); i++) {
            char currentSymbol = line.charAt(i);
            if (currentSymbol != base) {
                sb.append(currentSymbol);
                base = currentSymbol;
            }
        }
        System.out.println(sb);
    }
}
