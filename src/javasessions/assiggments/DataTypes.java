package javasessions.assiggments;

public class DataTypes {
    public static void main(String[] args) {
//  1.  Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//      Expected Output :
//      Hello
//      Naveen K
        System.out.println("Hello");
        System.out.println("Naveen K");
//  2.  Write a Java program to print the sum of two numbers.
//      Test Data:
//      74 + 36
//      Expected Output:
//      110
        System.out.println(74+36);

//  3.  Write a Java program to divide two numbers and print on the screen.
//      Test Data:
//      50/3
//      Expected Output :
//      43
//      16
//      19
//      13

        System.out.println(50/3); // 16

//  4.  Write a Java program to compute the specified expressions and print the output. Go to the editor
//      Test Data:
//      ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//      Expected Output
//      2.138888888888889
        double num =  ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(num);
//  5.  Try to concat "Hello Selenium" with a character 't'.
        System.out.println("Hello Selenium"+"t");
//  6.  Create three int variables having values like : 100, 200, 3400. Add them and concatenate
//      and generate this output String :
//      "Your Total amount is. 3700".
        int n1 = 100;
        int n2 = 200;
        int n3 = 3400;
        System.out.println("\"Your Total amount is. "+(n1+n2+n3)+"\"");
//  7.  Print the ASCII value of the character 'h'.
        //int ch = 'h';
        System.out.println((int)'h'); // or pass ch
//  8.  Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
        int ch1 ='d'+3;
        char c = (char) ch1;
        System.out.println(c);
//  9.  Write a program to find the square of the number 3.9.



    }
}
