import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int slashIndex = input.lastIndexOf('\\');
        int pointIndex = input.lastIndexOf('.');

        String fileName = input.substring(slashIndex + 1, pointIndex);
        String extension = input.substring(pointIndex + 1);

        System.out.println(String.format("File name: %s", fileName));
        System.out.println(String.format("File extension: %s", extension));
    }
}
