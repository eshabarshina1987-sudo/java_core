/*
Скопируйте код в класс Bugs.
Найдите пять проблем: две не дадут скомпилировать, три дадут неверный результат.
Исправьте каждую и поясните комментарием, что было не так.
int sum = 14, count = 4;
double avg = sum / count; - подсвечивает так как результат не получится целочисленным
long ms = 1000 * 60 * 60 * 24 * 365; - подсвечивает, так как переполнение типа получается, нужно к числу добавить L
int price = 9.99; - ошибка компиляции, так как дробное число пытаемся присвоить целочисленному
byte a = 10, b = 20;
byte c = a + b; - ошибка компиляции, при вычислении необходимо явно указать (byte)a+b или c сделать int
System.out.println("Сумма: " + a + b); - выведет значение 1020, а не 30, так как нет скобок.
 */
public class Bugs {
    public static void main(String[] args) {
        int sum = 14, count = 4;
        double avg = (double)sum / count;
        long ms = 1000L * 60 * 60 * 24 * 365;
        double price = 9.99;
        byte a = 10, b = 20;
        int c = a + b;
        System.out.println("Сумма: " + (a + b));
        System.out.println(avg);
        System.out.println(ms);
        System.out.println(price);
    }
}
