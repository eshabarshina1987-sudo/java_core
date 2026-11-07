/*
Объявите int a = 17 и int b = 5.
Выведите сумму, разность, произведение, частное и остаток.
Выведите частное ещё раз — как дробное число.
Числа в выводе берите из переменных, вычисления — в скобках.
 */
public class FromPresentation3_2 {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;
        System.out.println("Sum: "+ (a+b));
        System.out.println("Difference: "+ (a-b));
        System.out.println("Product: "+ (a*b));
        System.out.println("Quotient: "+ (a/b));
        System.out.println("Remainder: "+ (a%b));
        System.out.println("Quotient: "+ ((double)a/b));
    }
}
