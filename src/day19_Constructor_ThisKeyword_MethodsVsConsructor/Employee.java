package day19_Constructor_ThisKeyword_MethodsVsConsructor;

public class Employee {

    String name;
    int age;
    double salary;

    /************************Constructor*************************
     * Name is the same as the class
     * Can NOT have any return any value/void
     * Constructor will be called when you create the object
     * Constructor can be overloaded
     * Constructor MUST be public
     * Constructor only works when an object is created
     * Can NOT be inherited
     * We can overload the constructor (Any method can be overloaded)
    **************************************************************/

    public Employee(){
        System.out.println("Default constructor");
    }
    public Employee(String name){
        System.out.println("1 parameter constructor");
    }
    public Employee(String name, int age){
        System.out.println("2 param constructor");
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Robin";
        emp.age = 43;
        emp.salary = 120000;

    }
}
