package javasessions.day05_ConditionalStatements_IfElseConditions;

public class SwitchCaseConcept {
    public static void main(String[] args) {

        // Switch works perfect for multiple options but still have some limitations
        // if there are too many cases it will be useless
        String browser = "chrome";
        switch(browser){
            case "chrome":
                System.out.println("launch chrome");
                break;
            case "firefox":
                System.out.println("launch safari");
                break;
            case "safari":
                System.out.println("launch safari");
                break;
            case "ie":
                System.out.println("launch ie");
                break;
            default:
                System.out.println("Please pass right browser");
                break;
        }
    }
}
