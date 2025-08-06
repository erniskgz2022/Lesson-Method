package String_Method;

import java.util.Scanner;

public class String_Method_Task {
    public static void main(String[] args) {

        System.out.print("Write word: ");
        String word = new Scanner(System.in).nextLine();
        String result = methods(word);
        System.out.println("Result: " + result);
    }

    public static String methods (String word) {
            word = word.trim().toUpperCase();

            if (word.contains("A")){
                int index = word.indexOf("A");
                return word.substring(0,index);
            }else {
                return "No";
            }
    }
}
