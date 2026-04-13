import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел
        System.out.print("Введите первое число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число b: ");
        int b = scanner.nextInt();

        // Сравнение чисел
        System.out.println("\n=== Сравнение чисел ===");
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("\n=== Арифметические операции ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        // Проверка деления на ноль
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("a / b = Деление на ноль невозможно!");
        }

        scanner.close();
    }
}