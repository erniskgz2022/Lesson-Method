package Varargs;

public class Varargs_Task3 {
    public static void main(String[] args) {
        getNumbers(3,5,6,8,34,54,76,82,95);
    }

    public static void getNumbers (int ... numbers){
        int summa = 0;
        int count = 0;

        for (int number : numbers){
            summa += number;
            count++;
        }
        double ortocho = (double) summa / count;
        System.out.println("Sandyn sany: " + count);
        System.out.println("Sandyn ortocho arifmetikasi: " + ortocho);
    }
}
