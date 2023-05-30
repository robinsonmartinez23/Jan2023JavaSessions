package day27_ThrowKeyword_CustomException_FinalBlock_InterviewQuestion;

public class ThrowsKeyword {
    public void m1(){
        System.out.println("M1 Method");
        m2();
    }
    public void m2() throws ArithmeticException{
        System.out.println("M2 Method");
        try {
            m3();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
    public void m3() throws ArithmeticException{
        System.out.println("M3 Method");
        int i = 9/0;
    }

    public static void main(String[] args) throws ArithmeticException{
        ThrowsKeyword obj = new ThrowsKeyword();
        obj.m1();
        System.out.println("Bye");
    }
}
