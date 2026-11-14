import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");

        String userName = scanner.nextLine();

        System.out.println("Привет, "+userName+"!");
    }
}
