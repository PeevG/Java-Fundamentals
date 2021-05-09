import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>\\d+\\.?\\d+)!(?<quantity>\\d+)");

        double finalPrice = 0.0;

        List<String> furniture = new LinkedList<>();

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                finalPrice += price * quantity;
                furniture.add(name);
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture: ");
        furniture.forEach(e -> System.out.println(e));
        System.out.println(String.format("Total money spend: %.2f", finalPrice));
    }
}
