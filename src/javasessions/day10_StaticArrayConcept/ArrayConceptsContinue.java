package javasessions.day10_StaticArrayConcept;

import java.util.Arrays;

public class ArrayConceptsContinue {
    public static void main(String[] args) {
        //2. Arrays Literals
        int a[] = {1, 2, 3, 4, 5, 6};
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
        double d[] = {1.1, 2.1, 3.1, 4.1};
        char c[] = {'a', 'b', 'c'};
        String browsers[] = {"Chrome", "IE", "Safari", "Firefox"};
        for (int i = 0; i <= browsers.length; i++) {
            System.out.println(browsers[i]);
            if (browsers[i].equals("IE")){
                System.out.println("This is the one");
                break;
            }
        }
    }
}
