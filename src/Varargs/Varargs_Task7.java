package Varargs;

import java.util.Scanner;

public class Varargs_Task7 {
    public static void main(String[] args) {
        System.out.print("Write number: ");
        int number = new Scanner(System.in).nextInt();
        int summa = 0;
        System.out.print("Joop: ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i+ " ");
                summa += i;

            }
        }
        System.out.print("= " + summa);
    }

//    public  static  int [] getNumbers (boolean ... numbers){
//
//    }
}
