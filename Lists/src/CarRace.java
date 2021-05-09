import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> times = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        double sumLeftSide = 0;
        double sumRightSide = 0;
        int finishIndex = times.size() / 2;

        for (int i = 0; i < finishIndex; i++) {
            sumLeftSide += times.get(i);
            if (times.get(i) == 0) {
                sumLeftSide *= 0.8;
            }

        }
        for (int i = times.size() - 1; i > finishIndex; i--) {
            sumRightSide += times.get(i);
            if (times.get(i) == 0) {
                sumRightSide *= 0.8;
            }

        }
        if (sumLeftSide < sumRightSide) {
            System.out.printf("The winner is left with total time: %.1f", sumLeftSide);
        } else {
            System.out.printf("The winner is right with total time: %.1f", sumRightSide);
        }
    }
}
