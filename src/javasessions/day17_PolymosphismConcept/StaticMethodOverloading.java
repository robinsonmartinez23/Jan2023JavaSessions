package javasessions.day17_PolymosphismConcept;

public class StaticMethodOverloading {
    public static void login(){

    }
    public static void login(int i){

    }
    public static void login(int i, int j){

    }


    //IMPORTANT NOTE: JVM always will look for public static void main with String array parameter
    //(no matter name) and no extra parameters by default is args

    //source code(.java)->
    // compile time->.class(decision of method calling)->
    // JVM->
    // Run it->
    // machine code

    public static void main(String[] args) {
        System.out.println("Main Method");
        StaticMethodOverloading.main(10);
        StaticMethodOverloading.main(10,20);
        StaticMethodOverloading obj = new StaticMethodOverloading();
        obj.main(1,12.4);
    }
    public static void main(String[] args, int a) {
        System.out.println("Main Method with String array and int");
    }
    public static void main(int[]a) {
        System.out.println("Main Method with inr array");
    }
    public static void main(String a) {
        System.out.println("Main Method with String");
    }
    public static void main(int a) {
        System.out.println("Main Method with int"+a);
    }
    public void main(int a, double b) {                     //It is not static then we need create a obj
        System.out.println("Main Method not static with int and double");
    }
    public static void main() {
        System.out.println("Main Method without value");
    }
    public static void main(int a, int b) {
        System.out.println("Main Method with a and b int values"+ a + b);
    }

}
