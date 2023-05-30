package javasessions.noorteck;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 7, 1, 7};
        int[] arranged = arrangeArray(arr);
        System.out.println(Arrays.toString(arranged));
    }

    public static int[] arrangeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length-1; j++) {
                if (array[i] > array[j]) {
                    int tem = array[j];
                    array[j] = array[i];
                    array[i] = tem;
                }
            }
        }
        return array;
    }
}
