import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        int age = 19;
        boolean hasTicket = true;

//        if (age > 18) {
//            System.out.println("Доступ разрешен");
//        } else {
//            System.out.println("Доступ не разрешен");
//        }
//        if (hasTicket) {
//            System.out.println("Добро пожаловать в кино");
//        }
//        System.out.println("End");
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number%2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");*/
        /*String s;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество баллов: ");
        int score = Integer.parseInt(scanner.nextLine());
        if (score > 89) {
            s = "Отлично";
                } else if (score > 74) {
            s = "Хорошо";
        } else if (score > 59) {
            s = "Удовлетворительно";
                    } else {
            s = "Пересдача";
        }
        System.out.println(s);*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = Integer.parseInt(scanner.nextLine());
        String s1;
        if (number == 0) {s1 = "Число равно 0";} else {
            if (number % 2 == 0) {
                s1 = "Четное";
            } else {
                s1 = "Нечетное";
            }
            if (number > 0) {
                s1 = s1+" Положительное";
            } else if (number < 0) {
                s1 = s1+" Отрицательное";
            }
         }
        System.out.println(s1 );*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите c: ");
        int c = Integer.parseInt(scanner.nextLine());
        int max;
        if (a>=b) {
            if (a>=c) {max = a;}
            else {max = c;}
                  } else if (b>c) {
                      max = b;} else {
            max = c;
        }
        System.out.println("max = "+max);
    }
}
