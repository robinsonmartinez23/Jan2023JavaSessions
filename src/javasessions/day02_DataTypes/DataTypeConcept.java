package javasessions.day02_DataTypes;

public class DataTypeConcept {
    public static void main(String[] args) {
        //Data types
        /*1. Primitive data types
         * 		Boolean type: true / false
         * 		Numeric type:
         * 			a. character type: char
         * 			b. Integral type: Value
         * 				b.1.Integer: byte, short, int, long
         * 				b.2.Floating-point: float, double
         */

        /*2. Primitive data types
         *   	Array, String, Classes, Collections, Interfaces, Maps
         */

        //1. byte:
        //size: 1 byte = 8 bits
        //range:-128 to 127 ==> -2^7 to 2^7-1
        byte b = 10;
        b = 20;
        // byte c = 130; it is out of rage
        byte c = 30;
        byte d = 0;
        byte e = -25;


        System.out.println("size: 1 byte = 8 bits\nrange:-128 to 127 ==> -2^7 to 2^7-1");
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("-------------");

        //2. short
        //size 2 bytes = 16 bits ==> -2^15 to 2^15
        //range -32768 to 32767
        short s = 234;
        short s1 = -1565;
        System.out.println("size 2 bytes = 16 bits ==> -2^15 to 2^15\nrange -32768 to 32767");
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

        System.out.println("-------------");

        //3. int
        //size: 4 bytes = 32 bits
        //range: -2147483648 to 2147483647 ==> -2^31 to 2^31-1
        System.out.println("size: 4 bytes = 32 bits\nrange: -2147483648 to 2147483647 ==> -2^31 to 2^31-1");
        int i = 23300;
        int j = 909998;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("-------------");

        //4. long
        //size: 8 bytes = 64 bits
        //range: -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807 ==> 2^63 to 2^63-1

        //BigInteger

        long num = 13745691367498L;
        long distance = 87136487136l;
        long phone = 4694494350L;

        System.out.println(distance);
        System.out.println("-------------");

        //5.float
        //size: 4 bytes = 32 bits
        //range: after dot (.) it can take up to 7 digits
        float f1 = 1.4f;
        float f2 = (float)1.4; //(explicit casting)
        float f3 = 100; //(implicit casting) = 100.0

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f2 = " + f3);

        System.out.println("-------------");
        //6. double
        //size:  8 bytes = 64 bits
        //range: after dot (.) it can take up to 15 digits
        double d1 = 12.546;
        double d2 = 0.646546612;
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        System.out.println("-------------");

        //BigDecimal

        //7. char:
        //size: 2 bytes = 16 bits
        //range: 0-9, a-z, A-Z, special characters
        char c1 = 'a'; //a-z
        char c2 = 'A'; //A-Z
        char c3 = '1'; //0-9
        char c4 = '%';
        char c5 = 153;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);

        System.out.println("-------------");
        //8. boolean: true/false
        //size: aprox. 1 bit
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("bool1 = " + bool1);
        System.out.println("bool2 = " + bool2);

    }

}
