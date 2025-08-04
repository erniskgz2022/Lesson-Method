import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        System.out.print("Сүйлөм жазыныз: ");
        String word = new Scanner(System.in).nextLine();

        String [] words = word.split(" ");
        String akyrkysoz = words[words.length -1];

        System.out.println("Акыркы сөздүн узундугу " + akyrkysoz.length() + " - " + akyrkysoz);
    }
}
