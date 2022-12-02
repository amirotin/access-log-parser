import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Укажите путь до файла: ");
            String path = scanner.nextLine();

            if (path.equals("exit")) {
                break;
            }

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists) {
                System.out.println("Файл не существует");
                continue;
            }
            if (isDirectory) {
                System.out.println("Это директория");
                continue;
            }

            count++;
            System.out.println("Путь указан верно, файл существует. Файл номер " + count);
        }
    }
}
