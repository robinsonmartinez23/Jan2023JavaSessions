package javasessions.assiggments.constructorAssignment;

public class Employee {
    /**
     * What is the purpose of a getter method in Java?
     * Retrieve the instance value
     * Can a getter method return void?
     * Never
     * What is the access level of a getter method in Java?
     * ALWAYS public
     * What is the purpose of a setter method in Java?
     * Set or update the instance values
     * Can a setter method return a value other than void?
     * No, ALWAYS return void
     */
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(123456, "Robison", 120000);
        System.out.println("Employee's ID : "+employee.getId());
        System.out.println("Employee's name : "+employee.getName());
        System.out.println("Employee's salary : "+employee.getSalary());
    }
}
