import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String biggerKegModel = "";
        double maxValue = Double.MIN_VALUE;

        double volume = 0;
        for (int i = 0; i < n; i++) {
            String modelOfEachKeg = scanner.nextLine();
            Double radiusOfEachKeg = Double.parseDouble(scanner.nextLine());
            int heightOfEachKeg = Integer.parseInt(scanner.nextLine());

            volume = Math.PI * (radiusOfEachKeg * radiusOfEachKeg) * heightOfEachKeg;

            if (volume > maxValue) {
                maxValue = volume;
                biggerKegModel = modelOfEachKeg;
            }

        }
        System.out.println(biggerKegModel);
    }
}
