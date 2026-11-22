public class HomeWork08_2 {
    //2. Рекурсия — Вычислите факториал и N-е число Фибоначчи рекурсивно и в цикле. Сравните время работы при N = 40.
    static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    static long factorialCircle(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    static long fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 2) + fibRecursive(n - 1);
    }

    static long fibCircle(int n) {
        if (n <= 1) {
            return n;
        }
        long first = 0;
        long res = 1;
        for (int i = 2; i <= n; i++) {
            long next = first + res;
            first = res;
            res = next;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 40;
        long startTime = System.nanoTime();
        long resultRec = factorialRecursive(n);//Значение превышает тип long, но для замера времени отработки подойдет, наверное
        long endTime = System.nanoTime();
        long durationRec = (endTime - startTime);
        System.out.println("Вычисление факториала рекурсией заняло (нс): " + durationRec);

        startTime = System.nanoTime();
        long resultCir = factorialCircle(n);//Значение превышает тип long, но для замера времени отработки подойдет, наверное
        endTime = System.nanoTime();
        long durationCir = (endTime - startTime);
        System.out.println("Вычисление факториала циклом заняло (нс): " + durationCir);
        //System.out.println("Значение рекурсией: " + resultRec + ", значение циклом: " + resultCir);

        startTime = System.nanoTime();
        resultRec = fibRecursive(n);//Значение превышает тип long, но для замера времени отработки подойдет, наверное
        endTime = System.nanoTime();
        durationRec = (endTime - startTime);
        System.out.println("Вычисление Фибоначчи рекурсией заняло (нс): " + durationRec);

        startTime = System.nanoTime();
        resultCir = fibCircle(n);//Значение превышает тип long, но для замера времени отработки подойдет, наверное
        endTime = System.nanoTime();
        durationCir = (endTime - startTime);
        System.out.println("Вычисление Фибоначчи циклом заняло (нс): " + durationCir);

        //System.out.println("Значение рекурсией: " + resultRec + ", значение циклом: " + resultCir);
    }
}
