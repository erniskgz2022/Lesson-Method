package Varargs;

public class Varargs_Task {
    public static void main(String[] args) {
        varargsMethod(10,20,30,40,50,60,70,80,90,100);

    }

    public  static void varargsMethod (int ... numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Summa: " +sum);
    }
}
