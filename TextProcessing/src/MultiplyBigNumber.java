import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine();
        int digit = Integer.parseInt(scanner.nextLine());
        StringBuilder biggie = new StringBuilder();

        if (digit == 0) {
            System.out.println(0);
            return;
        }

        while (bigNumber.charAt(0) == '0') {
            bigNumber = bigNumber.substring(1);
        }

        int reminder = 0;


        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int newBigNumber = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
            int result = newBigNumber * digit + reminder;
            reminder = 0;
            if (result > 9) {
                reminder = result / 10;
                result = result % 10;
            }

            biggie.append(result);
        }
        if (reminder != 0) {
            biggie.append(reminder);
        }

        System.out.println(biggie.reverse().toString());
    }
}
