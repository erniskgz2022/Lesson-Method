package Method_Void;

import java.util.Scanner;

public class Praktika_Method_Taks1 {
    public static void main(String[] args) {
        System.out.print("Write number: ");
        int numbers = new Scanner(System.in).nextInt();
        getMonth(numbers);
    }

    public static void getMonth(int numbers) {
        switch (numbers) {
            case 1:
                System.out.println("Январь - 31 күн");
                break;
            case 2:
                System.out.println("Февраль - 28 күн");
                break;
            case 3:
                System.out.println("Март - 31 күн");
                break;
            case 4:
                System.out.println("Апрель - 30 күн");
                break;
            case 5:
                System.out.println("Май - 31 күн");
                break;
            case 6:
                System.out.println("Июнь - 30 күн");
                break;
            case 7:
                System.out.println("Июль - 31 күн");
                break;
            case 8:
                System.out.println("Август - 31 күн");
                break;
            case 9:
                System.out.println("Сентябрь - 30 күн");
                break;
            case 10:
                System.out.println("Октябрь - 31 күн");
                break;
            case 11:
                System.out.println("Ноябрь - 30 күн");
                break;
            case 12:
                System.out.println("Декабрь - 31 күн");
                break;
            default:
                System.out.println("Айдын номери 1ден 12ге чейин болушу керек!");
        }
    }
}
