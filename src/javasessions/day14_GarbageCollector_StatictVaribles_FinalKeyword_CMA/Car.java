package javasessions.day14_GarbageCollector_StatictVaribles_FinalKeyword_CMA;

public class Car {
    String brand;
    String color;
    int price;
    static final int wheels = 4;

    /*****************STATIC KEYWORD**************
     * static is a common value of an object.
     * static variables are saved in Common Memory Allocation CMA
     * static variable will create only 1 copy in CMA for all objects
     * We can access static variables from the object but is not a good practice
     * Always call static variables through the class name
     * static is ONLY for object classes, it means,
       we can NOT declare static in variables in main or any method
     * Static can a variable, method or class.
     ***************FINAL KEYWORD*****************
     * final keyword does NOT allow to change the value of any instance/static variable
     * final can be created in main
     *********************************************/

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.color = "White";
        c1.price = 1000;

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.color = "White";
        c2.price = 1000;


        Car c3 = new Car();
        c3.brand = "BMW";
        c3.color = "White";
        c3.price = 1000;



    }
}
