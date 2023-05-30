package day0_InterviewPreparation;

import java.util.Arrays;

public class RemoveDuplicatesShortArrays {
    /**
     * Removing duplicates of int[] arr. This algorithm works well for short arrays
     * that haven't so many duplicate values.
     * @param arr
     * @return
     */
    public static int[] removeDuplicatesOfShort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[length - 1];
                    length--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(arr, length);
    }

    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,0,-1,-1};
        int[] removed = removeDuplicatesOfShort(array);
        System.out.println(Arrays.toString(removed));
    }
}
