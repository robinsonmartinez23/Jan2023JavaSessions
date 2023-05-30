package day28_StringConstantPool_StringObject_Literals_Inmutable_StringBuilder;

public class StringConcept {
    public static void main(String[] args) {
        //String: Non-primitive variable
        //Memory: String Constant Pool SCP (Pool Memory) / Inside of Heap memory
        String s = "Hello";     // String Literal
        String s1 = "Hello";    // String Literal
        String s2 = "hello";    // String Literal
        System.out.println(s==s1);  // Here works because both are in pool, 2 references are being comparing
        System.out.println(s==s2);
        //2 Objects (Hello, hello) 3 references. Both are in the Pool Memory
        System.out.println("-----------------");
        String s3 = new String("Java");     // With new keyword
        String s4 = new String("Hello");    // With new keyword
        System.out.println(s==s4);  // That's why we don't compare string with (==). Here we compare an Object with a reference
        System.out.println(s.equals(s4)); // ALWAYS COMPARE 2 String WITH EQUALS
        System.out.println("-----------------");
        // Here we create another "Java" object. What's why we prefer create String Literals
        String s5 = new String("Java");
        System.out.println("----------------");
        String s6 = new String ("Selenium"); // Here 1 object created in heap
        // With intern() we create a duplicate object in the Pool Memory without reference
        s6.intern(); // Here 2nd object is created in pool without reference
        String t1 = "Selenium"; // Now, the unreferenced Selenium has t1 reference
        System.out.println("-------------");
        String s7 = new String();
        System.out.println(s7.length()); // 0

    }
}
