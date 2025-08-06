package Varargs;

public class Varargs_Task6 {
    public static void main(String[] args) {
    String [] result = replaceTheWord("Alma","bir", "eki","uch", "tort","besh","alty");
    for (String word : result){
        System.out.print(word + " ");
    }
    }

    public static String [] replaceTheWord (String word, String ... words){

        for (int i = 1; i < words.length; i += 2){
            words[i] = word;
        }
        return words;
    }
}
