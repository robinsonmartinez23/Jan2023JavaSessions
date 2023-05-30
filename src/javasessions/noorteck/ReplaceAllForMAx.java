package javasessions.noorteck;

import java.util.Arrays;

public class ReplaceAllForMAx {
    public static void main(String[] args) {

        int[] num1 = {2, 4, 8, 12, 4, 5, 6, 8, 9, 12, 555};
        ReplaceAllForMAx replaceAllForMAx = new ReplaceAllForMAx();
        replaceAllForMAx.SetLargest(num1);
        int maxValue = num1[num1.length - 1];

        for (int i = 0; i <= num1.length - 1; i++) {
            num1[i] = maxValue;
        }
        System.out.println(Arrays.toString(num1));
    }

    public int[] SetLargest(int[] num) {
        for (int i = 0, j = 1; i <= num.length - 2; i++, j++) {
            if (num[i] > num[j]) {
                int tem = num[i];
                num[i] = num[j];
                num[j] = tem;
            }
        }
        return num;
    }
}
