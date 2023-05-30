package javasessions.noorteck;

import java.util.Arrays;

public class DeleteDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {7,7,1,1,3,3,3,5,7,8,9};
        int[] arranged = SortArray.arrangeArray(arr);
        int[] deleted = removeDuplicates(arranged);
        System.out.println(Arrays.toString(deleted));
    }

    public static int[] removeDuplicates(int[] array) {
        int[] result = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                result[j++] = array[i];
            }
        }
        result[j] = array[array.length-1]; //[1,3,5,7,8,9,0,0,0,0,0]
        int[] finalResult = new int [j+1]; //[0,0,0,0,0,0]
        System.arraycopy(result,0,finalResult,0,j+1);
        return finalResult;
    }
}
