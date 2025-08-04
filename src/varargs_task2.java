public class varargs_task2 {
    public static void main(String[] args) {
        getnumber(2,33,65,88,99,56,45);

    }

    public static void getnumber (int ... varargs){
        int jupsan = 0;
        int taksan = 0;
        for (int number : varargs){
            if (number % 2 == 0){
               jupsan++;
            }else {
                taksan++;
            }

        }
        System.out.println("Jup sandardyn sany: " + jupsan);
        System.out.println("Tak sandardyn sany: " + taksan);
    }

    //todo Экинчи вариянт Эгер жуп сандарды бир сапка чыгара турган болсок

//    int jupSan = 0;
//    int takSan = 0;
//
//        System.out.print("Jup sandar: ");
//        for (int number : varargs) {
//        if (number % 2 == 0) {
//            System.out.print(number + " ");
//            jupSan++;
//        }
//    }
//
//        System.out.println(); // Жаңы сапка өтүү
//
//        System.out.print("Tak sandar: ");
//        for (int number : varargs) {
//        if (number % 2 != 0) {
//            System.out.print(number + " ");
//            takSan++;
//        }
//    }
//
//        System.out.println(); // Жаңы сап
//        System.out.println("Jup sandardyn sany: " + jupSan);
//        System.out.println("Tak sandardyn sany: " + takSan);
//    }
}
