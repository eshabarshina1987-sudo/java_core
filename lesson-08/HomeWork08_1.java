import java.util.Arrays;
import java.util.Scanner;
//1. Утилиты для массивов — Напишите методы sum, average, max и contains для массива int[].

public class HomeWork08_1 {
    static int sum (int[] b) {
        int sum = 0;
        for (int massive : b) {
            sum += massive;
        }
     return sum;
    }
    static double average (int[] b) {
        return ((double)sum(Arrays.copyOf(b,b.length))/b.length);
    }
    static int max (int[] b) {
        int max = b[0];
        for (int massive : b) {
            if (max < massive) max = massive;
        }
        return max;
    }
    static boolean contains (int[] b, int search) {
        boolean isTrue = false;
        for (int massive : b) {
            if (massive == search) {isTrue = true;}
        }
        return isTrue;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("Сумма чисел в массиве равна: "+sum(Arrays.copyOf(a,a.length)));
        System.out.println("Среднее значение в массиве равно: "+average(Arrays.copyOf(a,a.length)));
        System.out.println("Максимальное значение в массиве равно: "+max(Arrays.copyOf(a,a.length)));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите искомое число: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не правильное значение!");
        }
        else {
        int search = Integer.parseInt(scanner.nextLine());
            System.out.println("Результат поиска: "+contains(Arrays.copyOf(a,a.length), search));
        }

    }
}
