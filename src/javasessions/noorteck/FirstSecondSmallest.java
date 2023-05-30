package javasessions.noorteck;

import java.util.Arrays;

public class FirstSecondSmallest {
    public static void main(String[] args) {
        FirstSecondSmallest firstSecondSmallest = new FirstSecondSmallest();
        int[] num = {24,4222, 61,8,55,129};
        firstSecondSmallest.getTwoSmallest(num);
    }

    private void getTwoSmallest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tem;
                if (arr[i] > arr[j]) {
                    tem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The first smallest is "+arr[0]);
        System.out.println("The second smallest is "+arr[1]);
    }
}
