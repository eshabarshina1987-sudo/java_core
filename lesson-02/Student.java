/*1. Анкета студента — Объявите переменные для имени, возраста, роста, веса и признака «студент»,
     подобрав подходящие типы, и выведите их.*/

public class Student {
    public static void main(String[] args) {
        String name = "Elena";
        int age = 39;
        double height = 169.6;
        double weight = 106.7;
        boolean isStudent = true;
        System.out.println("Name:\t\t" +name+"\nAge:\t\t"+age+"\nHeight:\t\t"
                +height+"\nWeight:\t\t"+weight+"\nisStudent:\t"+isStudent);
    }
}
