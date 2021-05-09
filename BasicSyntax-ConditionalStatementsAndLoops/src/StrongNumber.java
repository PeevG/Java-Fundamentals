import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - 48;

            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact *= j;
            }
            sum += fact;
        }
        int numNumber = Integer.parseInt(num);
        if (sum == numNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
