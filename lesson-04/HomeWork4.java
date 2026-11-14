import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя:  ");
        String name = scanner.nextLine();
        System.out.print("Введите ваш год рождения: ");
        int birth = Integer.parseInt(scanner.nextLine());
        System.out.println("Приветствую, " + name + "! Ваш возраст - " + (2026 - birth));

        String s;
        System.out.print("Введите количество баллов: ");
        if (scanner.hasNextInt()) {
            int score = scanner.nextInt();
            if (score > 0 && score < 101) {
                if (score > 89) {
                    s = "Отлично";
                } else if (score > 74) {
                    s = "Хорошо";
                } else if (score > 59) {
                    s = "Удовлетворительно";
                } else {
                    s = "Пересдача";
                }
                System.out.println(s);
            } else {
                System.out.println("Количество баллов вне диапазона!");
            }
        } else {
            System.out.println("Нужно ввести число цифрами");
        }
        scanner.nextLine();
        System.out.print("Введите первое число: ");
        if (scanner.hasNextDouble()) {
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Введите второе число: ");
            if (scanner.hasNextDouble()) {
                double b = Double.parseDouble(scanner.nextLine());
                System.out.print("Введите математический оператор: ");
                String act = scanner.nextLine();

                if ("+".equals(act)) {
                    System.out.println("Результат: " + (a + b));
                } else if ("-".equals(act)) {
                    System.out.println("Результат: " + (a - b));
                } else if ("*".equals(act)) {
                    System.out.println("Результат: " + (a * b));
                } else if ("/".equals(act)) {
                    System.out.println("Результат: " + (a / b));
                } else {
                    System.out.println("Не правильно введен оператор");
                }
            } else {
                System.out.println("Нужно было вводить число!");
            }
        } else {
            System.out.println("Нужно было вводить число!");
        }
    }
}
