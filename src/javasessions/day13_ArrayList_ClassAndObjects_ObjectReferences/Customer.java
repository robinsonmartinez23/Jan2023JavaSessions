package javasessions.day13_ArrayList_ClassAndObjects_ObjectReferences;

public class Customer {

    /********************************************
    Object is created in heap memory
    Object name (reference of object) is created in stack memory
    Object without name is called no reference object    new Customer();  In stack memory
    It is just a reference without object                Customer c1;     In stack memory
    Null reference object                                Customer c1 = new User1();
                                                         c1 = null;
     ********************************************/
    String name;        // default null
    int age;            // default 0
    String city;
    //double salary;    // default 0.0
    //boolean isActive; // false
    //char gender;      // \0000 null character value
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.name = ("Robin");
        c1.age = (43);
        c1.city = ("FL");

        Customer c2 = new Customer();
        c2.name = ("Amanda");
        c2.age = (64);
        c2.city = ("NY");

        Customer c3 = new Customer();
        c3.name = ("Frank");
        c3.age = (73);
        c3.city = ("CS");

        Customer c4 = new Customer();
        c4.name = ("Mari");
        c4.age = (41);
        c4.city = ("MI");

        Customer c5 = new Customer();
        c5 = null;                          //Null reference object
        new Customer();                     //Object without name is called no reference object
        Customer u6;                        //It is just a reference without object


        System.out.println(c1.name+" "+c1.age+" "+c1.city); // Robin 43 FL
        System.out.println(c2.name+" "+c2.age+" "+c2.city); // Amanda 64 NY
        System.out.println(c3.name+" "+c3.age+" "+c3.city); // Frank 73 CS
        System.out.println(c4.name+" "+c4.age+" "+c4.city); // Mari 41 MI
        System.out.println("------------------------");
        c1= c2;
        System.out.println(c1.name+" "+c1.age+" "+c1.city); // Amanda 64 NY
        System.out.println(c2.name+" "+c2.age+" "+c2.city); // Amanda 64 NY
        System.out.println(c3.name+" "+c3.age+" "+c3.city); // Frank 73 CS
        System.out.println(c4.name+" "+c4.age+" "+c4.city); // Mari 41 MI
        System.out.println("------------------------");
        c2= c3;
        System.out.println(c1.name+" "+c1.age+" "+c1.city); // Amanda 64 NY
        System.out.println(c2.name+" "+c2.age+" "+c2.city); // Frank 73 CS
        System.out.println(c3.name+" "+c3.age+" "+c3.city); // Frank 73 CS
        System.out.println(c4.name+" "+c4.age+" "+c4.city); // Mari 41 MI
        System.out.println("------------------------");
        c3= c4;
        System.out.println(c1.name+" "+c1.age+" "+c1.city); // Amanda 64 NY
        System.out.println(c2.name+" "+c2.age+" "+c2.city); // Frank 73 CS
        System.out.println(c3.name+" "+c3.age+" "+c3.city); // Mari 41 MI
        System.out.println(c4.name+" "+c4.age+" "+c4.city); // Mari 41 MI
        System.out.println("------------------------");
        c4= c1;
        System.out.println(c1.name+" "+c1.age+" "+c1.city); // Amanda 64 NY
        System.out.println(c2.name+" "+c2.age+" "+c2.city); // Frank 73 CS
        System.out.println(c3.name+" "+c3.age+" "+c3.city); // Mari 41 MI
        System.out.println(c4.name+" "+c4.age+" "+c4.city); // Amanda 64 NY

    }
}
