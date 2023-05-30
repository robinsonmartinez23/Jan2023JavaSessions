package javasessions.day16_MethodsContinue_MethodOlverloading;

import java.util.ArrayList;

public class Concept {
    // WAF
    // Supply a browser name String: chrome, firefox, IE, etc
    // buss logic: launch the browser
    // return true

    public boolean launchBrowser(String browserName) {
        System.out.println("Browser name: " + browserName);
        boolean flag = true;
        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                System.out.println("launch chrome");
                break;
            case "firefox":
                System.out.println("launch firefox");
                break;
            case "ie":
                System.out.println("launch ie");
                break;
            default:
                System.out.println("Please pass right browser " + browserName + " is not recognized browser");
                flag = false;
                break;
        }
        return flag;
    }

    public void testing() {
        System.out.println("Testing Method");
        //return;                               // It is allowed but not necessary in a void method
    }

    //WAF
    //supply input param: Company Name (String): IBM,MS,Google
    //return: the list of employee of the com: ArrayList<String>


    public ArrayList<String> getEmployeeList(String compName) {
        System.out.println("Company name is: " + compName);
        ArrayList<String> empList = new ArrayList<String>();  // pc = 0
        if (compName.equalsIgnoreCase("IBM")) {
            empList.add("Robin");
            empList.add("Maria");
            empList.add("Amanda");
        } else if (compName.equalsIgnoreCase("MS")) {
            empList.add("Frank");
            empList.add("Carlos");
            empList.add("Irma");
            empList.add("Rosa");
        } else if (compName.equalsIgnoreCase("Google")) {
            empList.add("Sol");
            empList.add("Marcos");
            empList.add("Pepe");
            empList.add("Juan");
            empList.add("Jose");
        } else {
            System.out.println("Company name was not found choose btw IBM, MS or Google");
        }
        return empList;
    }

    public static void main(String[] args) {

        Concept c = new Concept();
        ArrayList<String> ibmList = c.getEmployeeList("IBM");
        System.out.println(ibmList+" Are the employees");

        ArrayList<String> googleList = c.getEmployeeList("Google");
        System.out.println(googleList+" Are the employees");

        ArrayList<String> ctsList = c.getEmployeeList("CTS");
        System.out.println(ctsList);

        System.out.println("-----------------------");

        boolean isLaunched = c.launchBrowser("opera");
        if (isLaunched) {
            System.out.println("Enter url...");
        } else {
            System.out.println("Wrong browser, you are no able to enter url... ");
        }
    }
}
