package day28_StringConstantPool_StringObject_Literals_Inmutable_StringBuilder.AccessModifiers;

public class Car {
    public String name;     // public: Entire Project
    protected int price;    // protected: IN the entire package and sub-classes in different packages
    private int millage;    // private: Only in the same class
    String brand;           // default: Only in the same package


    /**********VISIBILITY************
     * public > protected > default > private
    *********************************/


    public static void main(String[] args) {
        Car c = new Car();
        c.name = "Hello";       // public
        c.price = 1000;         // protected
        c.brand = "Hello";      // default
        c.millage = 1000;       // private


    }
}
