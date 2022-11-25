import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // запрос чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:" );
        int a = scanner.nextInt();
        System.out.println("Введите второе число:" );
        int b = scanner.nextInt();
        // вывод результата
        System.out.println("Сумма чисел: " + (a + b));
        System.out.println("Разность чисел: " + (a - b));
        System.out.println("Произведение чисел: " + (a * b));
        System.out.println("Частное чисел: " + ((double) a / b));
    }
}
