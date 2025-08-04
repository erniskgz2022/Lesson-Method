public class Varargs_Task1 {
    public static void main(String[] args) {
       getTablis(2,4,5,7,8);
    }

    public static void  getTablis(int ... arr){

        for (int numbers : arr){
            for (int i = 1; i < 10; i++){
                System.out.println(numbers + " x " + i + " = " + (numbers*i) );
            }
        }
    }
}
