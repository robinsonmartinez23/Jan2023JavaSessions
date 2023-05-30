package javasessions.day15_MethodsInJava;

public class Student {
    //Write a function WAF
    //pass a parameter: studentName (String)
    //return the student marks --> int
    public int getStudentMarks(String studentName){
        System.out.println("Getting marks for: "+studentName);
        int mark = -1;
        if (studentName.equalsIgnoreCase("Riya")){
            mark = 90;
        }else if(studentName.equalsIgnoreCase("Robin")){
            mark = 100;
        }else if(studentName.equalsIgnoreCase("Amanda")) {
            mark = 80;
        }else{
            System.err.println("No student found..pls pass a valid student name");
        }
        return mark;
    }

    public static void main(String[] args) {
        Student student = new Student();

        int m1 = student.getStudentMarks("Robin");
        System.out.println(m1);

        if (m1>=0){
            System.out.println("Print the sheet");
        }

        int m2 = student.getStudentMarks("Amanda");
        System.out.println(m2+60);

        if (m2>=0){
            System.out.println("Print the sheet");
        }

        int m3 = student.getStudentMarks("Tom");
            System.out.println(m3);

        if (m3>=0){
            System.out.println("Print the sheet");
        }
    }
}
