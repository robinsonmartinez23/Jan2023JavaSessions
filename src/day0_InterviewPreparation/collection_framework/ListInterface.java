package day0_InterviewPreparation.collection_framework;

import java.util.*;

public class ListInterface {
    public static <Interger> void main(String[] args) {


        System.out.println("---------List Interface-------");
        System.out.println("- Has index: YES \n" +
                "- Accept duplicates: YES \n" +
                "- Keep Insertion Order: YES \n" +
                "- Multi null values: YES");

        System.out.println("--------ArrayList Class--------");
        /**
         * - ArrayList provides faster retrieving of elements because internally is based on Array
         * - Deleting is slow because values needs to be shifted
         * - Adding a values needs to assign extra space dynamically when run out of space
         */

        /**
         * ArrayList of Strings(Objects) use Arrays.asList(arr) to add in bulk.
         */
        String[] arr = {"Amanda","Robin","Frank","Mari"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);

        /**
         *  ArrayList of int receives as parameter a list using Array.asList
         *  (4,5,1,5,2). Or a list
         */
        Integer[] integers = {1,2,3};
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(integers));
        System.out.println(arrayList1);

        List<Integer> list = Arrays.asList(1,2,3);
        ArrayList<Integer> arrayList2 = new ArrayList<>(list);
        System.out.println(arrayList2);

        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(4,5,1,5,2));
        System.out.println(arrayList3);

        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(arrayList4);

        int[] arr1 = {1,3,4,5,6,7};
        java.util.List<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < arr1.length ; i++) {
            listInteger.add(Integer.valueOf(arr1[i]));
        }
        System.out.println("-----ArrayList Methods------");
        //size:
        System.out.println(listInteger.size());  //6
        //Add at the end of list
        listInteger.add(8) ;
        //Add to specific place of the ArrayList
        listInteger.add(1,2);
        System.out.println(listInteger);
        //Replaces the element at the specified position (6) in the ArrayList
        listInteger.set(6,100);
        System.out.println(listInteger);
        //Retrieve specific element of ArrayList based on index position
        int value = listInteger.get(0);
        System.out.println("Index 0: "+value);
        //Returns true if the ArrayList is empty, false otherwise.
        System.out.println(listInteger.isEmpty());  // false
        //Returns true if the ArrayList contains the specified element, false otherwise.
        System.out.println(listInteger.contains(4)); // true
        //Returns the index of the first occurrence of the specified element in the
        //ArrayList, or -1 if the element is not present.
        System.out.println(listInteger.indexOf(10));  //-1
        listInteger.add(2,3);
        System.out.println(listInteger.indexOf(3));  // index 2 Will return the first occurrence
        //Returns the index of the last occurrence of the specified element in the
        //ArrayList, or -1 if the element is not present.
        System.out.println(listInteger.lastIndexOf(3)); // index 3
        //Adding multi null values
        listInteger.add(null);
        listInteger.add(null);
        //Print ArrayList
        System.out.println(listInteger);
        //Returns an array containing all the elements in the List.
        System.out.println(Arrays.toString(listInteger.toArray()));
        //Removes all elements from the ArrayList.
        listInteger.clear();
        //Print ArrayList
        System.out.println(listInteger);
        System.out.println("-------Vector-------");

        System.out.println("-------Stack-------");


        System.out.println("-------LinkedList-------");
        /**
         * - LikedList provides faster insertion and deletion of elements because is double linked
         * - Deleting reassign the links
         * - Adding a value create new links
         * - It is ineffective to retrieve values because spaces are not next to each other
         * in memory and need to go through the list to reach one.
         */
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < arr1.length ; i++) {
            linkedList.add(Integer.valueOf(arr1[i]));
        }
        //size:
        System.out.println(linkedList.size());  //6
        //Add at the end of list
        linkedList.add(8) ;
        //Add to specific place of the ArrayList
        linkedList.add(1,2);
        System.out.println(linkedList);
        //Replaces the element at the specified position (6) in the ArrayList
        linkedList.set(6,100);
        System.out.println(linkedList);
        //Retrieve specific element of ArrayList based on index position
        int value1 = linkedList.get(0);
        System.out.println("Index 0: "+value1);
        //Returns true if the ArrayList is empty, false otherwise.
        System.out.println(linkedList.isEmpty());  // false
        //Returns true if the ArrayList contains the specified element, false otherwise.
        System.out.println(linkedList.contains(4)); // true
        //Returns the index of the first occurrence of the specified element in the
        //ArrayList, or -1 if the element is not present.
        System.out.println(linkedList.indexOf(10));  //-1
        linkedList.add(2,3);
        System.out.println(linkedList.indexOf(3));  // index 2 Will return the first occurrence
        // Returns the index of the last occurrence of the specified element in the
        // ArrayList, or -1 if the element is not present.
        System.out.println(linkedList.lastIndexOf(3)); // index 3
        //Adding multi null values
        linkedList.add(null);
        linkedList.add(null);
        //Print ArrayList
        System.out.println(linkedList);
        //Returns an array containing all the elements in the List.
        System.out.println(Arrays.toString(linkedList.toArray()));
        //Removes all elements from the ArrayList.
        linkedList.clear();
        //Print ArrayList
        System.out.println(linkedList);

    }
}
