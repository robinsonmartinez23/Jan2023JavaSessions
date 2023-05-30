package day19_Constructor_ThisKeyword_MethodsVsConsructor;

public class EmployeeTest {
    String name;
    int age;
    double salary;

    public EmployeeTest(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        EmployeeTest e1 = new EmployeeTest("Tom", 20,120000);
        System.out.println(e1.toString());
    }
}
