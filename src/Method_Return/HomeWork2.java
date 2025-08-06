package Method_Return;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 1, 9};
        int[] sorted = sortSandardi(array);
        System.out.println("Kemyy tartibinde: " + Arrays.toString(sorted));
    }

    public static int[] sortSandardi(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }return arr;
    }
}
