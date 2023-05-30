package day21_Inheritance_MethodOverriding_RunTimePolymorphism_Top_DownCasting;

public class Car extends Vehicle{
    public final void service() {
        System.out.println("Car service");
    }

    public void start() {
        System.out.println("Car -- start");
    }

    public void stop() {
        System.out.println("Car -- stop");
    }

    public void refuel() {
        System.out.println("Car -- refuel");
    }

    @Override
    public void gasEngine() {
        System.out.println("Car -- gas engine");
    }


    public static void billing() {
        System.out.println("Car - billing");
    }

    private void pickColor() {
        System.out.println("Car -- pick color");
    }



    public void test(int i, String j) {

    }
}
