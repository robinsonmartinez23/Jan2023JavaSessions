package day29_StringMethods2;

import day26_ExceptionHandling.MyException;

public class StringReverse {

    //Selenium --> muineleS

    public static String reverseString(String str){

        if(str == null){
            System.out.println("NULL can NOT be reversed, please pass a valid value");
            throw new MyException("NULL VALUE");
            //return str;   // We can return this
            //return "-1";  // We can return this
        }
        if(str.length()==1){
            return str;
        } else if (str.length()==0) {
            System.out.println("Blank value can NOT be reversed, please pass a valid value");
        }
        String reversed = "";
        for(int i = str.length()-1; i>=0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {

        // Test cases

        System.out.println(reverseString("Selenium"));
        System.out.println(reverseString("A"));
        System.out.println(reverseString("AA"));
        System.out.println(reverseString("Selenium testing java language"));
        //System.out.println(reverseString(null)); // NullPointerException
        System.out.println(reverseString(""));
        System.out.println("---------------");
        String m = "Selenium";
        StringBuilder sb = new StringBuilder(m);
        System.out.println(sb.reverse());
    }
}
