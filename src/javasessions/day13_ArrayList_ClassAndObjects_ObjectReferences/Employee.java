package javasessions.day13_ArrayList_ClassAndObjects_ObjectReferences;

public class Employee {

    //String name = "Robin"; //Class variable - Class data member - Global variable
    String name;
    int age;
    String city;

    public static void main(String[] args) {
        //String name = "Amanda"; //Local variable
        //System.out.println(name);   // Amanda

        //Class is a template or blueprint of an object.
        //Object = is an instance of a class.

        //Object of a class = new keyword

        Employee obj = new Employee(); // => It is a new object with reference to obj
        obj.name = "Robin";
        obj.age = 43;
        obj.city = "FL";
        System.out.println(obj.name+" "+obj.age+" "+obj.city);
        System.out.println("--------------");
        Employee obj1 = new Employee();  // => It is a new object with reference to obj1
        System.out.println(obj1.name); // default null
        System.out.println(obj1.age); // default 0
        System.out.println(obj1.city); // default null
        System.out.println("--------------");
        obj1.name = "Amanda";
        obj1.age = 64;
        obj1.city = "NY";
        System.out.println(obj1.name+" "+obj1.age+" "+obj1.city);
        System.out.println("--------------");

        new Employee();  // => It is a new object without no reference and empty (No reference Object)
        new Employee().name = "Robin"; // => It is a new object without no reference and name value
        new Employee().age = 43; // => It is a new object without no reference and age value
        new Employee().city = "FL"; // => It is a new object without no reference and city value
    }
}
