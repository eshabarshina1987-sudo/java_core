import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1. Сумма и среднее — Считывайте числа, пока пользователь не введёт 0,
//        и выведите их количество, сумму и среднее.
        int sum = 0;
        int cnt = 0;
        boolean res = true;
        do {
            System.out.print("Введите число: ");
            int a = Integer.parseInt(scanner.nextLine());
            if (a == 0) {
                res = false;
            } else {
                sum += a;
                cnt++;
            }
        } while (res);
        System.out.println("Сумма равна: "+ sum);
        System.out.println("Количество: "+ cnt);
        System.out.println("Среднее значение: "+ ((double)sum/cnt));

//        2. Угадай число — Программа загадывает число от 1 до 100, пользователь угадывает
//        с подсказками «больше» и «меньше». В конце выведите число попыток.
        int num = (int) (Math.random() * (100 - 2 + 1)) + 1;
        int col = 0;
        boolean cycle = true;
        while (cycle){
            System.out.print("Введите свой вариант: ");
            int inNum = Integer.parseInt(scanner.nextLine());
            col++;
            if (inNum == num) {
                System.out.println("Верно!");
                cycle = false;
            } else if (inNum > num) {
                System.out.println("Вы ввели большее значение!");
            } else {
                System.out.println("Вы ввели меньшее значение!");
            }
        }
        System.out.println("Количество попыток: "+ col);

//        3. Простые числа — Выведите все простые числа до N, используя вложенный цикл и break.
        System.out.print("Введите число: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n < 2) {
            System.out.println("Простое число должно быть больше 1");
        } else {
            for (int i=2;i<=n;i++) {
                boolean isTrue = true;
                for (int j=2; j*j<=i;j++) {
                    if (i % j == 0) {
                        isTrue = false;
                        break;
                    }
                }
                if (isTrue) {
                    System.out.print(i+" ");
                }
            }

        }
    }
}
