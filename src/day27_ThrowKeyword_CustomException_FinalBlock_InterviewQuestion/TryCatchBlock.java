package day27_ThrowKeyword_CustomException_FinalBlock_InterviewQuestion;

public class TryCatchBlock {

    int age;

    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("A");
        System.out.println("A");

        TryCatchBlock obj = new TryCatchBlock();
        obj = null;
        try{
            obj.age =20;  // Null pointer Exception
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        try {
            int i = 9 / 0;            // Unchecked exception (Run time exception)
            System.out.println("Hello"); // Will not be executed go to the catch
        }catch(Exception e){             // If we know the exception is better put it here
            System.out.println("Hello"); // Will not be executed
            e.printStackTrace();
        }
        System.out.println("Bye");      // It will be printed
    }
}
