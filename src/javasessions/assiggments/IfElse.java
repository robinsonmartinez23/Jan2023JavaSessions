package javasessions.assiggments;

import java.util.Locale;

public class IfElse {

//    public static void main(String[] args) {
//  1.Find out the greatest number out of three different given numbers:
//        int a = 25;
//        int b = 78;
//        int c = 87;
//        if (a > b && a > c){
//            System.out.println("The greatest is a= "+a);
//        }else if(b>c){
//            System.out.println("The greatest is b= "+b);
//        }else{
//            System.out.println("The greatest is c= "+c);
//        }
//    }
//  2. Write a Java program to test a number is positive or negative.

    //    public static void main(String[] args) {    // 0 is considered a + number
//        int num = 0;
//        if(num>=0){
//            System.out.println(num +" is positive");
//        }else{
//            System.out.println(num +" is negative");
//        }
//    }
//  3. WAP to check number is odd or even using If - Else
//    public static void main(String[] args) {      // 0 is considered even number
//        int num = 5;
//        if (num % 2 == 0) {
//            System.out.println(num+" is even");
//        } else {
//            System.out.println(num+" is odd");
//        }
//    }
//  4. WAP to check given alphabet character is Vowel or Consonant using Switch - Case
//    public static void main(String[] args) {
//        char ch = 'i';
//        switch (ch) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println(ch+" is a vowel");
//                break;
//            default:
//                System.out.println(ch+" is a consonant");
//        }
//    }
//    5. WAP to run your test cases in a specific environment like: QA, Stage,
//       Dev, UAT, Prod using Switch - Case
//    public static void main(String[] args) {
//        String env = "STAGE ";
//        switch (env.toLowerCase().trim()) {
//            case ("qa"):
//                System.out.println("It is QA environment");
//                break;
//            case ("stage"):
//                System.out.println("It is Stage environment");
//                break;
//            case ("dev"):
//                System.out.println("It is Dev environment");
//                break;
//            case ("uat"):
//                System.out.println("It is UAT environment");
//                break;
//            case ("prod"):
//                System.out.println("It is Prod environment");
//                break;
//            default:
//                System.out.println("It is not a valid environment");
//                break;
//        }
//    }
//    6. WAP to book the specific type of car from the Uber app using Switch - Case.
//       Car Type: Mini, Sedan, SUV, Premium
//        public static void main(String[] args) {
//            String car = " SEDAN ";
//            switch (car.toLowerCase().trim()) {
//                case ("mini"):
//                    System.out.println("Your car is a Mini");
//                    break;
//                case ("sedan"):
//                    System.out.println("Your car is a Sedan");
//                    break;
//                case ("suv"):
//                    System.out.println("Your car is a SUV");
//                    break;
//                case ("premium"):
//                    System.out.println("Your car is a Premium");
//                    break;
//                default:
//                System.out.println("Please select the right car type");
//                break;
//        }
//    }
//  7.  WAP to launch browsers using If-ElseIf and Switch Case
//      Browser: Chrome/Firefox/IE/Safari
//    public static void main(String[] args) {
//        String browser = " ChrOme ";
//        switch(browser.toLowerCase().trim()){
//            case("chrome"):
//                System.out.println("The browser is Chrome");
//                break;
//            case("firefox"):
//                System.out.println("The browser is Firefox");
//                break;
//            case("ie"):
//                System.out.println("The browser is IE");
//                break;
//            case("safary"):
//                System.out.println("The browser is Safari");
//                break;
//        }
//    }
// 8. WAP to define the interest rate on the basis of Loan type using Switch Case
//    Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
//    For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
    public static void main(String[] args) {
        int salary = 25000;
        String typeOfLoan = "Housing";

        switch(typeOfLoan.toLowerCase().trim()){
            case("car"):
                System.out.println("The rate of loan 17%");
                break;
            case("housing"):
                if(salary<35000){
                    System.out.println("NOT APPLICABLE FOR Housing Loan");
                    break;
                }
                System.out.println("The rate of loan 4.5%");
                break;
            case("personal"):
                System.out.println("The rate of loan 18%");
                break;
            case("education"):
                System.out.println("The rate of loan is 4%");
                break;
            default:
                System.out.println("Enter a valid loan");

        }
    }
}
