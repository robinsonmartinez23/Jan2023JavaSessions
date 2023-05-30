package day28_StringConstantPool_StringObject_Literals_Inmutable_StringBuilder.AccessModifiers2;

import day28_StringConstantPool_StringObject_Literals_Inmutable_StringBuilder.AccessModifiers.Car;

public class Audi extends Car {
    public static void main(String[] args) {
        Audi a = new Audi();
        a.name = "Hello";           // public ALL OVER AVAILABLE!!!
        a.price = 1000;             // protected, is available bc is a Audi is a subclass of Car
        //a.brand = "Hello";        // default no reachable only in same package
        //a.millage = 1000;         // private no reachable only in same class

    }
}
