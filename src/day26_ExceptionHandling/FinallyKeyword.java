package day26_ExceptionHandling;

public class FinallyKeyword {
    public static void main(String[] args) {

        //NOTE: We can use finally block WITHOUT catch but there is not uses cases.
        //NOTE: Only one finally block ALWAYS at the end, ever before catch.

        System.out.println("hi");
        try{
            int i= 9/3;  // 9/0
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("Hello");
        } finally {
            System.out.println("Finally Block");        // Always come up with o without exception
        }
    }
}
