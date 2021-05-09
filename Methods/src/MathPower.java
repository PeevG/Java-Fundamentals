import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int powerValue = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(getValueOfNumberRaisedToPower(number, powerValue)));
    }

    static double getValueOfNumberRaisedToPower(double a, int b) {
        double result = Math.pow(a, b);
        return result;
    }
}
