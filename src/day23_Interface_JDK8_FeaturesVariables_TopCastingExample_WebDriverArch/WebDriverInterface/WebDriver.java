package day23_Interface_JDK8_FeaturesVariables_TopCastingExample_WebDriverArch.WebDriverInterface;

public interface WebDriver extends SearchContext{
    public void get(String url);
    public String getTitle();
    public void  click(String element);
    public void  sendKeys(String element, String value);
    public void close();

}
