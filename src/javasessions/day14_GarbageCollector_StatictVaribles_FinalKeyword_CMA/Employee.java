package javasessions.day14_GarbageCollector_StatictVaribles_FinalKeyword_CMA;

public class Employee {

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


    String name;                            // Instance variable
    String lastname;                        // Instance variable
    String position;                        // Instance variable
    int age;                                // Instance variable
    int id;                                 // Instance variable
    String contractType;                    // Instance variable
    double salary;                          // Instance variable
    boolean married;                        // Instance variable
    final static boolean hasSSN = true;     // Static Variable - Common Memory Allocation
    final static String company = "IBM";    // Static Variable - Common Memory Allocation

    public static void main(String[] args) {
        Employee employee1 = new Employee();    //NEW Employee Object in Stack in heap memory
                                                //NEW reference employee1 in the stack memory
        Employee employee2 = new Employee();    //NEW Employee Object in Stack in heap memory
                                                //NEW reference employee2 in the stack memory

        employee1.name = "Robinson";
        employee1.lastname = "Martinez";
        employee1.position = "Tester";
        employee1.age = 43;
        employee1.id = 120779;
        employee1.contractType = "Contract";
        employee1.salary = 120000;
        employee1.married = false;

        employee2.name = "Amanda";
        employee2.lastname = "Martinez";
        employee2.position = "Developer";
        employee2.age = 64;
        employee2.id = 10757;
        employee2.contractType = "Contract";
        employee2.salary = 220000;
        employee2.married = true;

        System.out.println(employee1.name+", "+employee1.lastname+'\n'+"Position = "+ employee1.position+", "+
                "Age = "+employee1.age+", "+"Id = "+employee1.id+", "+"Contract = "+ employee1.contractType+", "+
                "Salary = "+", "+ employee1.salary+", "+"Married = "+ employee1.married+
                '\n'+"Company = "+Employee.company+", "+"SSN = "+Employee.hasSSN);
        System.out.println(employee2.name+", "+employee2.lastname+'\n'+"Position = "+ employee2.position+", "+
                "Age = "+employee2.age+", "+"Id = "+employee2.id+", "+"Contract = "+ employee2.contractType+", "+
                "Salary = "+", "+ employee2.salary+", "+"Married = "+ employee2.married+
                '\n'+"Company = "+Employee.company+", "+"SSN = "+Employee.hasSSN);
    }
}
