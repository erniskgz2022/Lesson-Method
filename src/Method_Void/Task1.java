package Method_Void;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        getNumber();

    }
    public static void getNumber()
    {
        int [] array = new int[] {34,53,57,86,45,24,13,36,98,66};
        System.out.println("Massivteki Sandar: ");
        for (int j : array) {
            System.out.print(j + " ");

        }

        System.out.println();
        
        System.out.print("Wtite number: " );
        int number = new Scanner(System.in).nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                System.out.println("Massivtin ichinde bar. Index: " + i);
                break;
            }
        }
    }
}
