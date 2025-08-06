package Method_Void;

public class HomeWork {
    public static void main(String[] args) {

        findSum();
    }

    public static void findSum() {
       int sum = 0;
        for (int i = 1; i < 300; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0){
                sum += i;
            }
        }
        System.out.println("Жооп: " + sum);
    }
}
