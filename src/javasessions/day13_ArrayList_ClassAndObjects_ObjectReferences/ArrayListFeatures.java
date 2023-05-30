package javasessions.day13_ArrayList_ClassAndObjects_ObjectReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {
    public static void main(String[] args) {
        //By default, vc is 10 but, we can change it so vc = 20, pc = 0, LF = 20/2 => 10
        ArrayList<Integer> ar = new ArrayList<>(20);
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(100);
        numList.add(200);
        numList.add(300);
        numList.add(400);
        System.out.println(numList.size()); //4
        numList.remove(2);
        System.out.println(numList.size()); //3
        System.out.println(numList.get(2)); //400
        //System.out.println(numList.remove(100)); // IndexOutOfBoundException (IOB)
        numList.remove(0);
        System.out.println(numList);
        System.out.println("------------------");
        ArrayList<String> empList = new ArrayList<>(Arrays.asList("Tom", "Peter","Robin","Ravi"));
        System.out.println(empList.size()); //4
        System.out.println(empList);

        empList.add("Lisa");
        System.out.println(empList.size()); //5
        System.out.println(empList);

        //We can add index of existing used index and all elements will move to the right
        // or the exact next last index.
        empList.add(0,"Amanda");    //0 => existing used index
        empList.add(6,"Frank");     //6 => exact last
        //empList.add(8,"Mari"); //8 IndexOutOfBoundException (IOB)
        System.out.println(empList);
        System.out.println("------------------");
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        System.out.println(nums.size());
        System.out.println("------------------");
        List<String> pagesList = Arrays.asList("Login Page","HomePage","RegPage","CartPage");
        System.out.println(pagesList);
        System.out.println("------------------");
        ArrayList<Integer> nList = new ArrayList<>();
        nList.add(100);
        nList.add(260);
        nList.add(10);
        nList.add(4000);
        nList.add(40);
        nList.add(5);
        System.out.println(nList);

        Collections.sort(nList);
        System.out.println(nList);

        Collections.reverse(nList);
        System.out.println(nList);

        System.out.println("------------------");
        int test[] = {23,2,45,100,1,900};
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        System.out.println("------------------");
        ArrayList<String> myList = new ArrayList<String>(Collections.nCopies(5,"Iphone"));
        System.out.println(myList.size());
        System.out.println(myList);
    }
}
