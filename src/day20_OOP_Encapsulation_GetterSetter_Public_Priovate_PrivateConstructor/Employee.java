package day20_OOP_Encapsulation_GetterSetter_Public_Priovate_PrivateConstructor;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String city;
    private String country;

    public Employee(String name, int age, double salary, String city, String country) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.city = city;
        this.country = country;
    }


    // Getter & Setter MUST be public

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }


}
