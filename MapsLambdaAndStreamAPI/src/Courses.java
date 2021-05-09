import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" : ");
            String course = tokens[0];
            String student = tokens[1];

            courses.putIfAbsent(course, new ArrayList<>());

            courses.get(course).add(student);

            input = scanner.nextLine();

        }
        courses
                .entrySet()
                .stream()
                .sorted((c1, c2) -> Integer.compare(c2.getValue().size(), c1.getValue().size()))
                .forEach((entry -> {
                    System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue().size()));
                    entry
                            .getValue()
                            .stream()
                            .sorted((s1, s2) -> s1.compareTo(s2))
                            .forEach(s -> System.out.println(String.format("-- %s", s)));
                }));
    }
}
