package javasessions.day03_StringDataType_StringConca_MathOper;

public class StringConcatenation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);  //It is not concatenation, just math operation

        System.out.println("---------------");

        String x = "Hello";
        String y = "Selenium";
        System.out.println(x+y); //It is concatenation --> HelloSelenium

        System.out.println("---------------");
        System.out.println(a+x); //It is still concatenation --> 10Hello
        System.out.println("---------------");

        //Java runs from left to right then, the first 2 are number so perform math
        //result will find 2 words. output:30HelloSelenium

        System.out.println(a+b+x+y);    //It is concatenation and math operation
                                        //30HelloSelenium

        System.out.println("---------------");

        //Java runs from left to right then, the first 2 are Strings so perform concatenation
        //result will find 1 number then, (HelloSelenium + 10 = String) then y so again, String + y = String
        //output:HelloSelenium1020

        System.out.println(x+y+a+b); //It is just concatenation
                                     //HelloSelenium1020

        System.out.println("---------------");

        //Still execute left to right but when finds brackets it will be executed first what is inside.
        //output:HelloSelenium30

        System.out.println(x+y+(a+b)); //It is just concatenation

        System.out.println("---------------");

        System.out.println(a+b+x+y+a+b); //30HelloSelenium1020
        System.out.println(a+b+x+y+(a+b)); //30HelloSelenium30

        System.out.println("---------------");

        double c = 12.33;
        double d = 23.44;
        System.out.println(x+y+c+d); //HelloSelenium12.3323.44
        System.out.println(x+y+a+b+c+d); //HelloSelenium102012.3323.44

        System.out.println("---------------");

        char g = 'm';
        char h = 'n';

        String l = "testing";
        String u = "automation";

        System.out.println(l+u); //testingautomation
        System.out.println(l+u+g+h); // testingautomationmn

        System.out.println("---------------");

        char t1 = 'a'; //97 ascii
        char t2 = 'b'; //98 ascii
        System.out.println(t1+t2); //97+98 = 195

        char t3 = 'z'; //122
        System.out.println(t1+t2+t3); //317
        System.out.println(t1); //a
        System.out.println(t2-t1); // 1

        System.out.println("---------------");
        char gerder = 'm';
        System.out.println(gerder);

        System.out.println("---------------");

        System.out.println('a'+'b'); //195
        System.out.println("a+b"); //a+b

        System.out.println("---------------");

        //a-z: 97-122
        //A-Z: 65-90
        //0-9: 48-57
        System.out.println('$'+'a');//36+97=133

        System.out.println("---------------");

        //Because there is explicit casting will show up the ascii value of char
        System.out.println((byte)+'a'); // explicit casting
        System.out.println((byte)+'$'); // explicit casting
        System.out.println((int) +'b'); // explicit casting

        System.out.println("---------------");
        int s1 = 100;
        int s2 = 200;
        System.out.println("The value of s1 = " + s1);
        System.out.println("The value of s2 = " + s2);
        System.out.println("The sum of s1+s2 = " + (s1+s2));






    }
}
