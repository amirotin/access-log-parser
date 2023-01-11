import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "access.log";
        if (args.length == 1) {
            fileName = args[0];
        }
        int numberOfLines = 0;
        int maxLineLength = 0;
        int minLineLength = Integer.MAX_VALUE;

        File logFile = new File(fileName);

        try (FileReader fileReader = new FileReader(logFile)) {
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                numberOfLines++;
                int lineLength = line.length();
                if (lineLength > 1024) {
                    throw new TooLongException(String.format("Длина строки %d превышает 1024 символа", numberOfLines));
                }
                if (lineLength > maxLineLength) {
                    maxLineLength = line.length();
                }
                if (lineLength < minLineLength) {
                    minLineLength = line.length();
                }
            }
            System.out.println("Количество строк: " + numberOfLines);
            System.out.println("Максимальная длина строки: " + maxLineLength);
            System.out.println("Минимальная длина строки: " + minLineLength);
        } catch (IOException | TooLongException e) {
            e.printStackTrace();
        }
    }
}
