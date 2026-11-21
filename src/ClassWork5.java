import java.util.Scanner;

public class ClassWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите номер дня недели: ");
//        int i = Integer.parseInt(scanner.nextLine());
//        String dayOfWeek = switch (i) {
//            case 1-> "Понедельник";
//            case 2-> "Вторник";
//            case 3-> "Среда";
//            case 4-> "Четверг";
//            case 5-> "Пятница";
//            case 6-> "Суббота";
//            case 7-> "Воскресенье";
//            default->"Ввели значение вне диапазона";
//        };
//        System.out.println(dayOfWeek);

//        System.out.print("Введите номер месяца в году (1 .. 12): ");
//        int month = Integer.parseInt(scanner.nextLine());
//        String nameMonth = switch (month) {
//            case 12, 1, 2 -> "Зима";
//            case 3, 4, 5 -> "Весна";
//            case 6, 7, 8 -> "Лето";
//            case 9, 10, 11 -> "Осень";
//            default -> "Ввели не верные цифры, вне диапазона";
//        };
//        System.out.println(nameMonth);

//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Значение переменной i = " + i);
//        int sum = 0;
//        int min = 1;
//        int max = 10;
//        for (int i=min; i<=max; i++) {
//            sum += i;
//        }
//        System.out.println("Сумма чисел от "+min+" до "+max+" равна "+sum);
//        int n = 3;
//        while (n > 0) {
//            System.out.println(n);
//            n--;
//        }

        String choice = "";
        int a;
        int b;
        int result = 0;
        do {
            System.out.print("Выберите оператор: '+' Сложить, '-' Вычесть, '*' Умножить, '/' Разделить, 0 Выход: ");
            choice = scanner.nextLine();
            if (!"0".equals(choice)) {
                System.out.print("Введите первое число: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите второе число: ");
                b = Integer.parseInt(scanner.nextLine());
                result = switch (choice) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> a / b;
                    default -> 0;
                };
                System.out.println("Результат выполнения: " + result);
            }
        } while("0".equals(choice));
    }
}
