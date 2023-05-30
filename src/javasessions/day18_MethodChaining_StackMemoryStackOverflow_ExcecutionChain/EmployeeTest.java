package javasessions.day18_MethodChaining_StackMemoryStackOverflow_ExcecutionChain;

public class EmployeeTest {
    String name;
    int age;
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void printMsg(){
        System.out.println("Hello");
    }
    public void getEmpInfo(EmployeeTest t2){
        t2.name = "Tom";
        t2.age = 20;
        System.out.println(t2.name);
        System.out.println(t2.age);
    }

    public static void main(String[] args) {
        EmployeeTest t1 = new EmployeeTest();
        t1.add(20,30);     // Call by value or argument
        t1.getEmpInfo(t1);     // Call be reference
        System.out.println(t1.name);
        System.out.println(t1.age);
    }

}
