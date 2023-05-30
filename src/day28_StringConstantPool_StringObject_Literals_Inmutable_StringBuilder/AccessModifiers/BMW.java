package day28_StringConstantPool_StringObject_Literals_Inmutable_StringBuilder.AccessModifiers;

public class BMW extends Car{
    public static void main(String[] args) {
        BMW b = new BMW();
        b.name = "Hello";           // public ALL OVER AVAILABLE!!!
        b.price = 1000;             // protected
        b.brand = "Hello";          // default
        //b.millage = 1000;         // private no reachable only in same class

    }
}
