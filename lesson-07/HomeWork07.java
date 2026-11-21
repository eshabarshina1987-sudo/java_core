import java.util.Scanner;

public class HomeWork07 {
    public static void main(String[] args) {
//        1. Минимум и максимум — Заполните массив случайными числами и найдите минимальный и максимальный элементы и их индексы.
        int[] score = {95, 10, 20, 100, 98, 0, 5};
        int max = 0;
        int maxI = 0;
        int min = score[0];
        int minI = score[0];
        for (int i = 0; i < score.length; i++) {
        if (score[i] > max) {
            max = score[i];
            maxI = i;
        }
        if (score[i] < min) {
            min = score[i];
            minI = i;
        }
        }
        System.out.println("Максимум: "+max+", его индекс: "+maxI);
        System.out.println("Минимум: "+min+", его индекс: "+minI);

//        2. Циклический сдвиг — Сдвиньте элементы массива вправо на k позиций, где k может быть больше длины массива:
//        если у нас есть массив: 1, 2, 3, 4, 5 - то при циклическом сдвиге на 2 позиции получим: 4, 5, 1, 2, 3
//        продумать вариант когда мы попытаемся произвести циклический сдвиг на 7 или 8 позиций.
        int[] a = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("На сколько сдвинуть массив: ");
        int k = Integer.parseInt(scanner.nextLine());
        if (k > a.length) { k = k % a.length; }
        int j = a.length-k;
        for (int i = 0; i<a.length; i++) {
            if (j < a.length ) {System.out.print(a[j]+" "); j++;}
            else {System.out.print(a[j-a.length]+" ");j++;}
        }
        System.out.println();
//        3. Матрица — Заполните матрицу N×N и найдите суммы главной и побочной диагоналей
//        (побочная диагональ похожа на главную, только начинается из правого верхнего угла)

        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum1 = 0;
        int sum2 = 0;
        int l = matrix.length;
        for (int i=0; i<l; i++) {
            sum1 += matrix[i][i];
            sum2 += matrix[l-i-1][l-i-1];
        }
        System.out.println("Cумма главной и побочной диагоналей равна: "+ (sum1+sum2));
    }
}
