import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> people = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String name = parts[0];
            if (parts.length == 3) {
                if (people.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    people.add(name);
                }
            } else {
                if (!people.remove(name)) {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (String person : people) {
            System.out.println(person);
        }

    }
}
