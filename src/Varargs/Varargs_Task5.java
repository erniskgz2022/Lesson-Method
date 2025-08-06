package Varargs;

public class Varargs_Task5 {
    public static void main(String[] args) {
        int result = getWordIsCount('a',"apple","Limon","Banan","Kyrgyz");
        System.out.println("Jynyityk: " + result);
    }

    public static int getWordIsCount (char symbol, String... words){
        int count = 0;
        for (String word : words){
            if (word.indexOf(symbol) != -1){
                count++;
            }
        }
        return count;
    }
}
