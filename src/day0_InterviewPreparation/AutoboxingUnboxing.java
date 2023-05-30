package day0_InterviewPreparation;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        /*
         *  Autoboxing: Convert a primitive or non-primitive to an Object
         */

        //- primitive to object
        int a = 10;
        //Integer intA = Integer.valueOf(a); // Explicit, redundant. The numeric value of a number
                                             // is in fact the same number.
        Integer intA = a; // a now is an object.
        int sum = intA + 5;
        System.out.println(sum);

        //- non-primitive to object
        String str = "30";
        //Integer num = str; // We need to explicit use valueOf() bc str is NOT non-primitive
        Integer num = Integer.valueOf(str);
        int sum1 = num +10;
        System.out.println(sum1);


        /*
         *  Unboxing: Convert an Object to primitive or non-primitive.
         *            We use parse. Parse receives as parameter a String.
         */

        Integer integer = 20;
        int num2 = Integer.parseInt(integer.toString());
        int total = num2 +5;
        System.out.println(total); // 25

        String str2 = "50";
        int num3 = Integer.parseInt(str2);
        int total2 = num3 + 10;
        System.out.println(total2); // 60
    }
}
