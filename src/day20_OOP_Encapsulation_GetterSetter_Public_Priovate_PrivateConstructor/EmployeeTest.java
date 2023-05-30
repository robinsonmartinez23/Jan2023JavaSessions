package day20_OOP_Encapsulation_GetterSetter_Public_Priovate_PrivateConstructor;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robin",18,120,"Caracas","Venezuela");
//        e1.setName("Robin");          // We don't use the use of setter to create objects
//        e1.setAge(43);                // The constructor helps us out to do that
//        e1.setCity("Caracas");
//        e1.setSalary(120000);
//        e1.setCountry("Venezuela");
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());
        System.out.println(e1.getCity());
        System.out.println(e1.getCountry());

        System.out.println("-------------------");
//        Setter helps us to update existing ifo
        e1.setAge(44);
        e1.setSalary(120000);
        e1.setCity("Orlando");
        e1.setCountry("USA");

        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());
        System.out.println(e1.getCity());
        System.out.println(e1.getCountry());


    }
}
