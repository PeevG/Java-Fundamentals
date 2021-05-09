import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String edno = scanner.nextLine();
        String dve = scanner.nextLine();

        returnSomething(edno, dve);
    }

    static void returnSomething(String scener, String vhod) {

        if (scener.equals("int")) {
            int num = Integer.parseInt(vhod);
            System.out.println(num * 2);
        } else if (scener.equals("real")) {
            double num = Double.parseDouble(vhod);
            System.out.printf("%.2f", num * 1.5);
        } else if (scener.equals("string")) {
            String something = vhod;
            System.out.println("$" + something + "$");
        }
    }
}
