import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        String resource = scanner.nextLine();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            resources.putIfAbsent(resource, 0);
            int newQuantity = resources.get(resource) + quantity;
            resources.put(resource, newQuantity);

            resource = scanner.nextLine();
        }
        resources
                .forEach((k, v) -> System.out.println(String.format("%s -> %d", k, v)));
    }
}
