/*Создайте класс Card.
 *Выведите своё имя, город и цель обучения — каждое на новой строке, через println.
 *Затем выведите те же данные в одну строку через print, разделяя их « | ».
 *Добавьте под визиткой линию из символов «=».*/

public class Card {
    public static void main(String[] args) {
        System.out.println("Елена");
        System.out.println("Бишкек");
        System.out.println("Повышение квалификации");
        System.out.print("Елена | ");
        System.out.print("Бишкек | ");
        System.out.println("backend");
        System.out.println("==========================");
    }
}