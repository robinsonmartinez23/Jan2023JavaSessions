package javasessions.day07_Loops;

public class LoopsConcept {
    public static void main(String[] args) {

        /*1 to 10
        1. while it is a loop that we use when we don't know how many times we need to go check
           the condition.*/

//        int i = 0;
//        while (i<=10){
//            System.out.println(i); // it is infinitive loop 11111111111111111....
//        }

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            //i++;                  // 12345678910 from i=0
            i = i + 2;                // 13579 from i=1  2468 from i=0
            //++i;
        }
        System.out.println("------------------------");
        while (true) {
            System.out.println("Hello");
            break;                          // Without "break" it is infinitive loop Hello Hello...
        }
        System.out.println("------------------------");
        int k = 1;
        while (true) {
            System.out.println("Hello");
            if (k == 5) {
                break;
            }
            k++;
        }
        System.out.println("------------------------");

//      2. for loop
//      1 to 10

        for (int j = 1; j <= 10; j++) {  // 13579 if j=j+2 from j+=2 , 0246810 if j+=2 from j=0
            System.out.println(j);       // without j++ infinitive
            //j++;                       // it can be placed here too but is not good
        }
        System.out.println("------------------------");

        int l=1;
        for ( ;l<=10; ){
            System.out.println("Hello");
            l++;
        }
        System.out.println("------------------------");

        int p;
        for(p=1; p<=5;p++){
            System.out.println(p);
        }
        System.out.println("------------------------");
        // a to z
        for(char ch = 'a'; ch<='z';ch++){
            System.out.println(ch +" = "+(byte)ch );         // or ((byte)ch); for ASCII values
        }
        System.out.println("------------------------");
        // double. float, short, byte, long -- for/while try using this primitives
        // WAP to print Robin 100 times
    }
}
