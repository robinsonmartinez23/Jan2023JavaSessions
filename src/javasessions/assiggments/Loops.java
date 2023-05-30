package javasessions.assiggments;

public class Loops {
    public static void main(String[] args) {
//      1. WAP to print following output:
//        I am Batman
//        I am Batman
//        I am Batman
//        I am Batman
//        I am Batman

        for (int i = 0; i < 5; i++) {
            System.out.println("I am Batman");
        }
        System.out.println("-------------------");
//      2. WAP to print following output:
//        I am Batman 1
//        I am Batman 2
//        I am Batman 3
//        I am Batman 4
//        I am Batman 5
//        I am Batman 6
//        I am Batman 7
//        I am Batman 8
//        I am Batman 9
        for (int i = 1; i < 10; i++) {
            System.out.println("I am Batman " + i);
        }
        System.out.println("-------------------");
//    3. WAP to print 10 to 1 using for, while and do-while loop
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("-------------------");
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
        System.out.println("-------------------");
        int k = 10;
        do{
            System.out.println(k);
            k--;
        }while (k>=1);

    }
}
