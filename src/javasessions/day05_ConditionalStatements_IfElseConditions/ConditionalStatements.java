package javasessions.day05_ConditionalStatements_IfElseConditions;

public class ConditionalStatements {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b);
        if (a == b) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        System.out.println("-------");
        if (true) {
            System.out.println("Hi Selenium");
        } else {  //dead code, this never going to happens
            System.out.println("Bye Selenium");
        }
        System.out.println("-------");
        boolean flag = true;
        if (flag) {
            System.out.println("Hi Selenium");
        } else {
            System.out.println("Bye Selenium");
        }
        System.out.println("-------");
        boolean test = true;
        if (!test) { // false, then will not execute
            System.out.println("testing is done");
        } else {
            System.out.println("testing is pending");
        }
        System.out.println("-------");
        //Nested if
        int number = 150;
        if (number <= 100) {
            System.out.println("Calculating your marks");
            if (number >= 90) {
                System.out.println("Grade A");
                if (number == 100) {
                    System.out.println("You got 100% scholarship");
                } else {
                    System.out.println("You are not eligible for 100% scholarship");
                }
            }
            if (number >= 80) {
                System.out.println("Grade B");
            }
        } else {
            System.out.println("Please entre valid marks");
        }
        System.out.println("-------");

        // if if if if else not good practice bad performance

//        String browser = "chrome";
//        if(browser.equals("chrome")){
//            System.out.println("Lauch chrome");
//        }
//        if(browser.equals("firefox")){
//            System.out.println("Lauch firefox");
//        }
//        if(browser.equals("safari")){
//            System.out.println("Lauch safari");
//        }
//        if(browser.equals("ie")){
//            System.out.println("Lauch ie");
//        }else{
//            System.out.println("Please pass right browser");
//        }

        // if, else if, else if, else It is better but still is not a good practice either, bad performance

        String browser = "chrome";
        if (browser.equals("chrome")) {
            System.out.println("Lauch chrome");
        } else if (browser.equals("firefox")) {
            System.out.println("Lauch firefox");
        } else if (browser.equals("safari")) {
            System.out.println("Lauch safari");
        } else if (browser.equals("ie")) {
            System.out.println("Lauch ie");
        } else {
            System.out.println("Please pass right browser");
        }

    }
}
