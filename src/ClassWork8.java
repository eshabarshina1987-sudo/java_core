import java.util.Scanner;

public class ClassWork8 {
    static int sumTwoInteger(int x, int y) {
        int result = x + y;
        return result;
    }

    static void printCinema(int[][] cinema) {
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int [][] userInput (int [][] cinema) {
        boolean notResult = true;
        Scanner scanner = new Scanner(System.in);
        while (notResult) {
            System.out.print("Введите ряд: ");
            int r = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.print("Введите место: ");
            int m = Integer.parseInt(scanner.nextLine()) - 1;
            if (r >= 0 &&
                    m >= 0 &&
                    r < cinema.length &&
                    m < cinema[r].length) {
                if (cinema[r][m] == 0) {
                    cinema[r][m] = 1;
                    notResult = false;
                } else {
                    System.out.println("Выбранное место занято. Попробуйте еще раз!");
                }
            }
        }
        return cinema;
    }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) return false;
        }
        return true;
    }
    static long sumDigin(int n) {
        if (n<0) n*=-1;
        if (n < 10) {
            return n; // базовый случай
        };
        return (n%10) + sumDigin(n/10);
    }
    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//        System.out.println("Сумма чисел = " + sumTwoInteger(a, b));

//        int[][] cinema = {
//                {0, 0, 0, 0},
//                {0, 0, 0, 0},
//                {0, 0, 0, 0}
//        };
//        printCinema(cinema);
//        userInput(cinema);
//
//        printCinema(cinema);
//for (int i = 2; i<=100; i++) {
//        if (isPrime(i)) { System.out.print(i +" ");}}
        System.out.println(sumDigin(1111));

    }
}
