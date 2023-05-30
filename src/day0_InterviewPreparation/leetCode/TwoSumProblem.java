package day0_InterviewPreparation.leetCode;

import java.util.Arrays;

public class TwoSumProblem {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}
