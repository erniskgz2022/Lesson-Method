package Method_Return;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(getResult(8));
    }

    public static String getResult (int number){

        if (number % 2 == 0){
            return "Jup San";
        }else {
            return "Tak San";
        }
    }
}
