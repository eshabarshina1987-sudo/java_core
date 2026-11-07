/*
4. Обмен значениями — Поменяйте значения двух переменных int местами двумя способами: через третью переменную и без неё
 */
public class ChangeVar {
    public static void main(String[] args) {
       //Первый вариант через дополнительную переменную
        int a = 5;
        int b = 8;
        int temp;
        System.out.println("First a = "+a+" b = "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Second a = "+a+" b = "+b);
        //Второй вариант без дополнительной переменной
        int c = 1;
        int d = 2;
        System.out.println("First c = "+c+" d = "+d);
        c = c ^ d;
        d = c ^ d;
        c = c ^ d;
        System.out.println("Second c = "+c+" d = "+d);
    }
}
