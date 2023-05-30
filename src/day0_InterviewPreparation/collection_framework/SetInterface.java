package day0_InterviewPreparation.collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        System.out.println("---------Set Interface----------");
        System.out.println("- Has index: NO \n" +
                "- Accept duplicates: NO \n" +
                "- Keep Insertion Order: ONLY LinkedHashSet \n" +
                "- Is sorted: ONLY treeSet \n"+
                "- Multi null values: NO, hashSet and linkedHashSet \n" +
                "  accept ONLY ONE and treeSet DOESN'T");
        System.out.println("------------HashSet impl Set--------------");
        /**
         * - Stores elements in a hash table
         * - Good performance searching, adding and removing elements when insertion order
         *   is NOT important and are not allowed duplicates values.
         * - HashSet is a good choice when you need a collection of unique elements and fast
         *   access to elements based on their value.
         * - However, if you need to maintain the order of elements, or if you need to perform
         *   operations that involve comparing elements or subsets of elements, other data
         *   structures like TreeSet or LinkedHashSet may be more appropriate.
         */


        Set<Integer> hashSet = new HashSet<>(Arrays.asList(1,1,2,10,2,3,3,3,4,5,6,7,8,9,9,1,2,4));

        System.out.println("-------add------");
        System.out.println(hashSet);
        System.out.println(hashSet.add(12)); // true
        System.out.println(hashSet.add(1));  // false
        System.out.println(hashSet);
        System.out.println("-----remove------");
        System.out.println(hashSet);
        System.out.println(hashSet.remove(12));  // true
        System.out.println(hashSet.remove(30));  // false
        System.out.println(hashSet);
        System.out.println("-----contains------");
        System.out.println(hashSet.contains(1));    // true
        System.out.println(hashSet.contains(30));   // false
        System.out.println("-----isEmpty------");
        System.out.println(hashSet.isEmpty());      // false
        System.out.println("------size------");
        System.out.println(hashSet.size());         //10
        System.out.println("----hashCode----");
        System.out.println(hashSet.hashCode());
        System.out.println("----toArray----");
        Integer[] integerArray = hashSet.toArray(new Integer[hashSet.size()]); // Creating Integer[]
        System.out.println(Arrays.toString(integerArray));
        System.out.println(Arrays.toString(hashSet.toArray())); // Directly printing

        System.out.println("------------LinkedHashSet impl Set--------------");
        /**
         * - Unique elements as all Set implementations
         * - KEEP insertion order it is the difference with HashSet
         */

        System.out.println("--------------SortedSet ext Set----------------");
        /**
         * It is an interface that extends Set interface to implement Sorted
         * implementations
         */
        System.out.println("------------TreeSet impl SortedSet---------------");
        /**
         * - Unique elements as all Set implementations
         * - null values are NOT accepted
         */
    }
}
