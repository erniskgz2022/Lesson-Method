package Method_Void;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("Write name: ");
        String name = new Scanner(System.in).nextLine();
        myName(name);

//        System.out.println("Bir san giriniz: ");
//        int number = new Scanner(System.in).nextInt();
//        if (number == 1){
//            hello();
//        }else if (number == 2){
//            bye();
//        }else {
//            System.out.println("1 je 2 san kiriniz!");
//        }
    }

    public static void myName (String name){
        System.out.println("Salam "  + name);
    }

//    public static  void hello () {
//        System.out.println("Hello");
//    }
//    public static  void bye () {
//        System.out.println("Bye");
//    }
}