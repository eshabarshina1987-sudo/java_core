import java.util.Locale;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Введите название товара: ");
        String tovar1 = scanner.nextLine();
        System.out.print("Введите цену товара: ");
        double sum1 = scanner.nextDouble();
        System.out.print("Введите количество товара: ");
        int count1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите название товара: ");
        String tovar2 = scanner.nextLine();
        System.out.print("Введите цену товара: ");
        double sum2 = scanner.nextDouble();
        System.out.print("Введите количество товара: ");
        int count2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите название товара: ");
        String tovar3 = scanner.nextLine();
        System.out.print("Введите цену товара: ");
        double sum3 = scanner.nextDouble();
        System.out.print("Введите количество товара: ");
        int count3 = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("%-12s %8s %5s %10s%n", "Товар","Цена","Кол","Сумма");
        System.out.println("-".repeat(38));
        System.out.printf("%-12s %8.2f %5d %10.2f%n", tovar1,sum1,count1,sum1*count1);
        System.out.printf("%-12s %8.2f %5d %10.2f%n", tovar2,sum2,count2,sum2*count2);
        System.out.printf("%-12s %8.2f %5d %10.2f%n", tovar3,sum3,count3,sum3*count3);
        System.out.println("-".repeat(38));
        System.out.printf("%-12s %25.2f%n", "Итого",sum1*count1+sum2*count2+sum3*count3);
        /*System.out.print("Введите имя: ");
        String userName = scanner.nextLine();

        System.out.print("Введите год рождения: ");
        //int userBirth = scanner.nextInt();
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            System.out.println("Привет, "+userName+"!");
            System.out.println("Ваш возраст:  "+ (2026 - age));
        } else {
            System.out.println("Введите число");
        }*/
    }
}
