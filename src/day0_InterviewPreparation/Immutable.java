package day0_InterviewPreparation;

public class Immutable {

        public static void main(String[] args) {
            String str = "Hello";
            String str2 = str+" World";
            System.out.println(str);
            System.out.println(str2);
            System.out.println("------------------------");
            StringBuffer sb = new StringBuffer("Hello");
            sb = sb.append(" World");
            System.out.println(sb);

        }
}
