package day23_Interface_JDK8_FeaturesVariables_TopCastingExample_WebDriverArch.WebDriverInterface;

public class ChromeDriver implements WebDriver{

    public ChromeDriver(){
        System.out.println("Launch chrome driver");
    }
    @Override
    public void findElement(String element) {
        System.out.println("Finding element by using :"+element);
    }
    @Override
    public void get(String url) {
        System.out.println("Enter url");
    }
    @Override
    public String getTitle() {
        return "Amazon";
    }
    @Override
    public void click(String element) {
        System.out.println("Click on "+element);
    }
    @Override
    public void sendKeys(String element, String value) {
        System.out.println("Entering "+value+" into"+element);
    }
    @Override
    public void close() {
        System.out.println("Close browser");
    }
}
