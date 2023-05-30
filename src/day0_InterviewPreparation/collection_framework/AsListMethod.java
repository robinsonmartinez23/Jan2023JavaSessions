package day0_InterviewPreparation.collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListMethod {
    public static void main(String[] args) {
        System.out.println("Receiving Integer object parameters (1,2,3,4,5) directly");
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        System.out.println("integerList = " + integerList);

        System.out.println("Using addAll()");
        List<Integer> integerList1 = new ArrayList<>();
        integerList1.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("integerList1 = " + integerList1);

        System.out.println("Receiving Integer[]");
        Integer[] integerArray1 = {1,2,3,4,5};
        List<Integer> integerList2 = new ArrayList<>(Arrays.asList(integerArray1));
        System.out.println("integerList2 = " + integerList2);

        System.out.println("Receiving an int[] and using add() that convert each element of array in Integer");
        int[] arr = {1,2,3,4,5,};
        List<Integer> integerList3 = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            integerList3.add(arr[i]);
        }
        integerList3.add(6);

        System.out.println(integerList3);


        System.out.println("Receiving an int[] and converting it to Integer[] (THE LONGEST WAY");
        int[] intArray = {1, 2, 3, 4, 5};
        Integer[] integerArray2 = new Integer[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            integerArray2[i] = Integer.valueOf(intArray[i]);
        }
        List<Integer> integerList4 = Arrays.asList(integerArray2);
        System.out.println("integerList3 = " + integerList4);
    }
}
