package javasessions.day10_StaticArrayConcept;

import java.util.Arrays;

public class ArraysConcepts {
    public static void main(String[] args) {
        //1. With new key word
        int a[]= new int [4];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println("------------");
        //System.out.println(a[4]);  ArrayIndexOutOfBoundException
        //System.out.println(a[-1]);  ArrayIndexOutOfBoundException
        int l = a.length;
        System.out.println(l);
        int hi = a.length-1;
        System.out.println(hi);
        System.out.println("------------");
        for(int i = 0;i<= a.length-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("------------");
        System.out.println(Arrays.toString(a));
        System.out.println("------------");
        double d[] = new double [2];
        d[0]=12.33;
        d[1]=34.44;
        System.out.println(d[0]+" "+d[1]);
        System.out.println("------------");
        String n[]= new String[3];
        n[0]="Robin";
        n[1]="Ana";
        n[2]="Maria";
        System.out.println("Total employees"+n.length);
        System.out.println(Arrays.toString(n));
        System.out.println("------------");

    }
}
