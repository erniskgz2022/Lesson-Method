package Varargs;

public class Vararg_HomeWork {
    public static void main(String[] args) {

        int [] varargs = {10,20,30,40,50};
        System.out.println(contains(60,varargs));
    }

    public static Boolean contains (int a, int ...varargs){

        for (int vararg : varargs) {
            if (vararg == a) {
                return true;
            }

        }
        return false;
    }
}
