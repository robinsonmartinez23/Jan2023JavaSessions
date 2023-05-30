package javasessions.day11_ArrayLimitation_ForEach_ArrayMemoryAllocation;

import java.util.Arrays;

public class ArrayLimitations {
    public static void main(String[] args) {
        int product[] = new int[50];
        //Limitations of array
        //1. Size is fixed: Static array==>to solve this problem, we need to use dynamic array - ArrayList
        //2. Type of data to overcome this, we can use Objet array.

        //Object is a Class in Java
        Object employees[] = new Object[5];   //It is still a static array
        employees[0]="Robin";
        employees[1]=30;
        employees[2]=2.3;
        employees[3]='m';
        employees[4]=true;

        System.out.println(Arrays.toString(employees));

        for (int i = 0; i <= employees.length-1 ; i++) {
            System.out.println(employees[i]);
        }
    }
}
