package day27_ThrowKeyword_CustomException_FinalBlock_InterviewQuestion;

public class MultipleTryCatch {

    int age;
    public static void main(String[] args) {

        try{
            int i = 9/0;
            TryCatchBlock obj = new TryCatchBlock();
            obj = null;
            obj.age = 20;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }

        System.out.println("Bye");
    }
}
