package javasessions.assiggments;

public class IncrementalDecrementalOperators {

//  1. What will be the output of the following program?
//
//            public static void main(String[] args)
//            {
//                int i = 11;
//
//                i = i++ + ++i;
//
//                System.out.println(i);
//            }
//
//      Answer: 24

//      2. Guess the output of the following program?
//
//            public static void main(String[] args)
//            {
//                int a=11, b=22, c;
//
//                c = a + b + a++ + b++ + ++a + ++b;
//
//                System.out.println("a="+a);
//                System.out.println("b="+b);
//                System.out.println("c="+c);
//            }
//
//        Answer: a:13, b:24, c:103

//  3. What will be the output of the below program?
//
//            public static void main(String[] args) {
//                int i=0;
//                i = i++ - --i + ++i - i--;
//                System.out.println(i);
//            }
//
//        Answer: 0

//    4.  Is the below program written correctly?
//
//              public static void main(String[] args){
//                  boolean b = true;
//                  b++;
//                  System.out.println(b);
//              }
//
//    Answer: Compile error, boolean variable (true,false) can add ++ or --
//
//    5. What will be the output of the below program?
//              public static void main(String[] args){
//                  int i=1, j=2, k=3;
//                  int m = i-- - j-- - k--;
//                  System.out.println("i="+i);
//                  System.out.println("j="+j);
//                  System.out.println("k="+k);
//                  System.out.println("m="+m);
//              }
//    Answer: i:0, j:1, k:2, m:-4

//    6. What will be the output of the following program?
//                public static void main(String[] args) {
//                    int a=1, b=2;
//                    System.out.println(--b - ++a + ++b - --a);
//                }
//    Answer: 0
//    7. What will be the value of i, j and k in the below program?

//                public static void main(String[] args) {
//                    int i=19, j=29, k;
//                    k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
//                    System.out.println("i="+i);
//                    System.out.println("j="+j);
//                    System.out.println("k="+k);
//                }
//    Answer: i=19, j=29, k=-20
//    8. What is wrong with the below program? Why it is showing compilation error?

//                public static void main(String[] args) {
//                    int i = 11;
//                    int j = --(i++);
//                }

//    Answer: Because -- or ++ must be place one to a variable

//    9. Guess the value of p in the below program?
//            public static void main(String[] args) {
//                int m = 0, n = 0;
//                int p = --m * --n * n-- * m--;
//                System.out.println(p);
//            }
//    Answer: -1*-1*-1*-1 = 1
//    10.  What will be the output of the following program?
//            public static void main(String[] args) {
//                 int a=1;
//                 a = a++ + ++a * --a - a--;
//                 System.out.println(a);
//            }
//    Answer: a=1+3*2-2 = 5
//    11. What will be the outcome of the below program?
//            public static void main(String[] args) {
//                int a = 11++;
//                System.out.println(a);
//            }
//    Answer: error ++ o -- must be applied to a variable (variable expected)
//    12. What will be the outcome of the below program?
//            public static void main(String[] args) {
//                int ch = 'A';
//                System.out.println(ch++);
//            }
//    Answer: 65
//    13. What will be the outcome of the below program?
//            public static void main(String[] args) {
//                int ch = 'A';
//                System.out.println(++ch);
//            }
//    Answer: 66
//    14.
            public static void main(String[] args) {
                double d = 1.5, D = 2.5;
                System.out.println(d++ + ++D);
            }
//    Answer: 5.0


}
