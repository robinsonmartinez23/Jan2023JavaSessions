package day21_Inheritance_MethodOverriding_RunTimePolymorphism_Top_DownCasting;

public class BMW extends Car{

    // Method Overriding: Poly + Morphism --> Run Time (Dynamic)
    // When you have a method in parent class and the same method in child class:
    // With the same name
    // With the same number of parameters
    // With the same sequence of parameters
    // With the same return
    @Override
    public void start() {       // Different implementation of parent class
        System.out.println("BMW -- electronic start");
    }

    @Override
    public void gasEngine() {  // Different implementation of override in parent class.
        System.out.println("BMW -- injection engine");  // On this case the compiler decision
                                                        // will be in btw this and the override
                                                        // choosing this method.
    }


    public void autoParking() {
        System.out.println("BMW -- auto parking");
    }

    public void theftSafety() {
        System.out.println("BMW -- theftSafety");
    }

    //method hiding: when u have a static method in parent and the same static method in child class.
    //can not be overriden
    public static void billing() {
        System.out.println("BMW - billing");
    }


    private void pickColor() {
        System.out.println("BMW -- pick color");
    }

    public void test(String j, int i) {

    }
}
