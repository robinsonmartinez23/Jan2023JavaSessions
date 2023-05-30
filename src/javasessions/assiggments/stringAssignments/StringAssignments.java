package javasessions.assiggments.stringAssignments;

public class StringAssignments {
    public static void main(String[] args) {
        //1. Write a program to check two different strings equality.
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println("---------------------------");

        //2. Remove all spaces in a String . 
        // For example : “   Hello  Everyone  “ . Expected result: “HelloEveryone”.

        //3. Write a program that will print out the last character and first character of a word.
        String str3 = "Hello";
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(str1.length() - 1));
        System.out.println("---------------------------");
        //4. Write a program to verify a word or a character contained in the sentence.
        String str4 = "Hello the life si beautiful";
        System.out.println(str4.contains("life"));
        System.out.println(str4.contains("p"));
        System.out.println("---------------------------");
        //5.Write a function/ method to reverse your own name.
        String name = "Robinson";

        //6. Write a program that gives you the last half of the string.

        //7.Write a program to get the 3rd “ e “ of the string .
        // For example: “Welcome to Naveen Automation Labs!“.  First "e" of Naveen

        //8. Write a method which gives an index of (-1) if string is not available. it should return integer. if String is present, then it should return the specific index.

        //9. Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) .

        //10. Assume that a string consists of 3 words, print out the middle one.

        //11. get only numeric part from this String:

        //String s = "your transaction id is: 12345 and reference id is 34567";
    }

}
