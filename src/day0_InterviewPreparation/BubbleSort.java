package day0_InterviewPreparation;

import java.util.Arrays;

public class BubbleSort {
    /**
     * Sort
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5,-1,0,3,2,1,3,999,7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
