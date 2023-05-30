package day26_ExceptionHandling;

public class CrossBrowserTest {

    // throws: Used to delegate exception
    // throw: To create our own custom exception

    public static void main(String[] args) {
        String browser = "opera";
        if(browser.equals("chrome")){
            System.out.println("Launch chrome");
        }else if(browser.equals("firefox")){
            System.out.println("Launch chrome");
        }else if(browser.equals("safari")) {
            System.out.println("Launch safari");
        }else {
            System.out.println("Please entre right browser");
            throw new MyException("Browser not found");
        }
    }
}
