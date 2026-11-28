import java.util.Locale;
import java.util.Scanner;

public class HomeWork09 {
    public static void main(String[] args) {
//        Пользователь вводит фамилию, имя и отчество одной строкой. Необходимо:
//        Удалить лишние пробелы.
//        Преобразовать фамилию в верхний регистр.
//        Сократить имя и отчество до инициалов.
//        Вывести количество символов в фамилии.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fio = scanner.nextLine();
        String[] init = fio.trim().toUpperCase(Locale.ROOT).split(" ");
        System.out.println("ФИО: "+init[0]+" "+init[1].substring(0,1)+"."+init[2].substring(0,1)+".");
        System.out.println("Длина фамилии: "+init[0].length());
//        Задание 2. Анализ предложения
//        Пользователь вводит предложение на русском языке. Необходимо определить:
//        Количество слов.
//        Количество символов без учёта пробелов.
//        Количество гласных букв.
//        Самое длинное слово.
//        Самое короткое слово.
//        Если несколько слов имеют одинаковую максимальную или минимальную длину, вывести первое из них.
//        "Я изучаю язык программирования"
//        Количество слов: 4
//        Количество символов без пробелов: 27
//        Количество гласных: 13
//        Самое длинное слово: программирования
//        Самое короткое слово: Я
        System.out.print("Введите предложение: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        int countSimbol = 0;
        int numberOfVowel = 0;
        String maxWord = words[0];
        String minWord = words[0];
        for (int i=0; i< words.length; i++) {
            countSimbol+=words[i].length();
            if (maxWord.length() < words[i].length()) maxWord = words[i];
            if (minWord.length() > words[i].length()) minWord = words[i];
            for (int j = 0; j<words[i].length(); j++) {
                if ("аеёиоуыэюя".indexOf(words[i].toLowerCase(Locale.ROOT).charAt(j)) >= 0) numberOfVowel++;
            }
        }
        System.out.println("Количество слов: "+words.length);
        System.out.println("Количество символов без пробелов: "+countSimbol);
        System.out.println("Количество гласных: "+numberOfVowel);
        System.out.println("Самое длинное слово: "+maxWord);
        System.out.println("Самое короткое слово: "+minWord);
    }
}
