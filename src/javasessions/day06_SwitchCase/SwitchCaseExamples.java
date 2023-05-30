package javasessions.day06_SwitchCase;

public class SwitchCaseExamples {
    public static void main(String[] args) {

        //byte, short, int, char --> valid
        //long, float, double,boolean --> invalid

        int num = 10;
        switch (num) {
            case 10:
                System.out.println(num);
                break;
            default:
                break;
        }
        System.out.println("------------");

        String stName = "Robin";
        int marks = 0;
        switch (stName) {
            case "Robin":
                System.out.println("Robin pass");
                marks = 100 - 20;
                break;
            case "Amanda":
                System.out.println("Amanda pass");
                marks = 100;
                break;
            default:
                System.out.println("Student was not found " + stName);
                marks = -1;
                break;
        }
        System.out.println(marks);
        if(marks >=0){
            System.out.println("Print the mark sheet");
        }else{
            System.out.println("");
        }
    }
}
