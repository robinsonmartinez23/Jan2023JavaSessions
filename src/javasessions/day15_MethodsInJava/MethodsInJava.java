package javasessions.day15_MethodsInJava;

public class MethodsInJava {

    /*************************Methods***************************
     * Methods can NOT be created inside a method for example main method

     ************************************************************/
     //1. no parameters, no return
    public void test(){
        System.out.println("Test Method");
        int i = 10;
        System.out.println(i);
    }
    //2. no input with some return
    public int totalAmount(){
        System.out.println("Total Amount Method");
        int i = 10;
        int tax = 5;
        int finalPayment = i + tax;
        return finalPayment;
    }
    public String trainerName(){
        System.out.println("Trainer Name Method");
        String name = "Robin";
        return name;
    }
    public char getGender(){
        System.out.println("Get Gender");
        char c ='a';
        return c;
    }
    //3.Some argument, some return
    public int add(int a, int b){
        System.out.println("Adding two numbers");
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        MethodsInJava obj = new MethodsInJava();
        obj.test();
        int value = obj.totalAmount();
        System.out.println(value);
        String tr = obj.trainerName();
        System.out.println(tr);
        if(tr.equals("Robin")){
            System.out.println("Robin is a SDET");
        }
        System.out.println(obj.getGender());      //It is not a good practice
        char tem = obj.getGender();
        System.out.println(tem);                  //It is the right practice
        int s1 = obj.add(10,20);
        System.out.println(s1);
        int s2 = obj.add(30,40);
        System.out.println(s2-5);
    }
}
