package day28_StringConstantPool_StringObject_Literals_Inmutable_StringBuilder;

public class StringImmutable {
    public static void main(String[] args) {
        String s = "Selenium";
        String t = s + "Hello";
        System.out.println(s);
        System.out.println(t);
        System.out.println("-----------");
        String st = "Java";
        System.out.println(st+"Python");
        System.out.println(st);
        st = st+"Automation";
        System.out.println(st);


    }
}
