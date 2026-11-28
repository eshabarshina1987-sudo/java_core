import java.util.Locale;

public class ClassWork9 {
    public static void main(String[] args) {
//        String str = "Привет";
//        System.out.println(str);
//        System.out.println(str.length());
//        System.out.println(str.charAt(3));
//
//        System.out.println(str.contains("Иве"));
//        System.out.println(str.toUpperCase(Locale.ROOT));
//        System.out.println(str.toUpperCase(Locale.ROOT).contains("ИВЕ"));
//
//        System.out.println(str.indexOf("x"));
//
//        System.out.println(str.substring(0,3));
//
//        String clientName = "Шабаршина Елена Владимировна";
//        String [] newClientName = clientName.split(" ");
//        System.out.println(newClientName[0]);
//        System.out.println(newClientName.length);

        String result = "";
        for (int i = 1; i <= 5; i++) {
            result = result + i + ", ";
        }
        System.out.println(result);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            if (i > 1) sb.append(", ");
            sb.append(i);
        }
        System.out.println(sb.toString());
    }
}
