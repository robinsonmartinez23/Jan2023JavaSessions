package day0_InterviewPreparation;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesLargeArrays {

    /**
     * Removing duplicates of int[] arr. This algorithm works well for large arrays and many
     * duplicates values.
     * @param arr
     * @return
     */
    public static int[] removeDuplicatesOfLarge(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (Integer i : set) {
            result[index++] = i;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,2,2,3,4,0,-1,-1};
        int[] removed = removeDuplicatesOfLarge(array);
        System.out.println(Arrays.toString(removed));
    }
}
