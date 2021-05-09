import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String firstEle : secondArray) {
            for (String secondEle : firstArray) {
                if (firstEle.equals(secondEle)) {
                    System.out.print(firstEle + " ");
                }
            }
        }
    }
}
