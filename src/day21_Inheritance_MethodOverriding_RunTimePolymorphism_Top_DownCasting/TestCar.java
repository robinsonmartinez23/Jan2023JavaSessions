package day21_Inheritance_MethodOverriding_RunTimePolymorphism_Top_DownCasting;

public class TestCar {
    public static void main(String[] args) {

        BMW bmw = new BMW();        //Regular object creation
        bmw.autoParking();          //Individual
        bmw.theftSafety();          //Individual
        bmw.stop();                 //inherited by parent
        bmw.refuel();               //inherited by parent
        bmw.engine();               //inherited by Grandpa
        bmw.start();                //Overridden from parent
        bmw.gasEngine();            //Overridden from Overridden (Grandpa or older)
        BMW.billing();              //Static


        System.out.println("-------");
        Car car = new Car();        //Regular object creation
        car.stop();                 //Individual
        car.refuel();               //Individual
        car.start();                //Individual
        car.engine();               //Inherited by parent
        car.gasEngine();            //Overridden from parent
        Car.billing();              //Static

        System.out.println("-------");
        // Child class object can be referred by parent class ref variable:
        // Top/Up casting : NOTE: Can access only overridden and inherited methods
        Car car1 = new BMW();
        car1.start();               //Override BMW method
        car1.gasEngine();           //Override BMW method
        car1.stop();                //Inherited from parent
        car1.refuel();              //Inherited from parent
        car1.engine();              //Inherited from Grandpa
        //car1.autoParking();       //not allowed for individual methods -- ref type check is failed
        //car1.theftSafety();       //not allowed for individual methods -- ref type check is failed

        // Child class object can be referred by grandparent class ref variable:
        Vehicle v1 = new BMW();

        // Down casting:
        // Parent class object can be referred by child class ref variable: typing (BMW) as usual, we
        // downcast fixing the compile time error, however, in Runtime ClassCastException will appear.
        // In conclusion down casting is not allowed.

//		BMW b1 = (BMW)new Car();        //ClassCastException
//		BMW b2 = (BMW)new Vehicle();    //ClassCastException


    }
}
