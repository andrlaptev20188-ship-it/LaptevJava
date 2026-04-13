import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух строк
        System.out.print("Введите первую строку a: ");
        String a = scanner.nextLine();

        System.out.print("Введите вторую строку b: ");
        String b = scanner.nextLine();

        // Сравнение строк
        System.out.println("\n=== Результат сравнения ===");

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}