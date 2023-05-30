package javasessions.noorteck;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 5};
        int[] reversed = reverseArray(arr);
        System.out.println(Arrays.toString(reversed));
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = arr.length - 1, j =0; i >= 0; i--,j++) {
            reversedArray[j] = arr[i];
        }
        return reversedArray;
    }


}
