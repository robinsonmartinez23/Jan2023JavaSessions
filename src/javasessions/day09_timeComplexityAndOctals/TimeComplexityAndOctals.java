package javasessions.day09_timeComplexityAndOctals;

public class TimeComplexityAndOctals {
    public static void main(String[] args) {
        //For loops O(n)  Linear Regression
        int p = 1;
        while (p <= 10) {
            System.out.println("Hi");
            System.out.println(p);
            p++;

        }
        System.out.println("----------------");
        // For nested loops of 2 O(n^2)      Quadratic Regression
        // For nested loops of 3 O(n^3)      Cubic Regression
        for (int m = 0; m <= 3; m++){

            for (int q=0; q<=4; q++){
                System.out.print(m+""+q+" ");
            }
            System.out.println();
        }

        // Binary Search in a search array will produce O(log n)
        // If we us for in array search will produce O(n) that is worst


        int t1 = 065; // Octal number starting by 0 --> all digits 0-7
        System.out.println(t1);
        //Octal to decimal
        //065 = (0 x 8^2) + (6 x 8^1) + (5 x 8^0) =
        //           0    +     48    +    5      = 53
    }
}
