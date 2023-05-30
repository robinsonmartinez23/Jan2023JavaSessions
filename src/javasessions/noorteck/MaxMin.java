package javasessions.noorteck;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class MaxMin {
    public static void main(String[] args) {
        MaxMin maxmin = new MaxMin();
        int[] num = {100,6,4,8,10,7,3,564,4,32,1,1000};
        maxmin.getMaxMin(num);
    }
    void getMaxMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0, j = 1; i < arr.length-1 ; i++,j++) {
            int tempMax = Math.max(arr[i],arr[j]);
            int tempMin = Math.min(arr[i],arr[j]);
            if(tempMax > max){
                max = tempMax;
            }
            if(tempMin < min){
                min = tempMin;
            }
        }
        System.out.println("Max: "+max+" and Min: "+min);
    }
}
