public class Varargs_Task4 {
    public static void main(String[] args) {
        System.out.println(method(5,false,"Mektep","banan","limon"));
    }

    public static String method (int index, boolean isUpperCase, String ... words){
        if (index < 0 || index >= words.length){
            return "Takogo indexa v massive net!";
        }

        String word = words[index];

        if (isUpperCase){
            return word.toUpperCase();
        }else {
            return  word.toLowerCase();
        }

    }
}
