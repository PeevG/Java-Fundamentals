import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> users = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputTokens = scanner.nextLine().split("\\s+");
            String command = inputTokens[0];
            String username = inputTokens[1];

            if (command.equals("register")) {
                String licensePlate = inputTokens[2];

                if (users.containsKey(username)) {
                    System.out.println("ERROR: already registered with plate number " + licensePlate);

                } else {
                    users.put(username, licensePlate);
                    System.out.printf("%s registered %s successfully%n", username, licensePlate);
                }

            } else if (command.equals("unregister")) {
                if (users.containsKey(username)) {
                    users.remove(username);
                    System.out.println(String.format("%s unregistered successfully", username));
                } else {
                    System.out.println(String.format("ERROR: user %s not found", username));
                }
            }

        }
        users.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
