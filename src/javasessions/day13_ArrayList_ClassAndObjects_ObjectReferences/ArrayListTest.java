package javasessions.day13_ArrayList_ClassAndObjects_ObjectReferences;


import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<Object>(); // Avoid creating raw ArrayList
        ar.add(100);
        ar.add("testing");
        ar.add("h");
        ar.add(true);
        for (Object each : ar) {
            System.out.println(each);
        }
    }
}
