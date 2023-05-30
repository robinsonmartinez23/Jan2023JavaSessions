package day20_OOP_Encapsulation_GetterSetter_Public_Priovate_PrivateConstructor;

public class Browser {


    public void launchBrowser(){
        System.out.println("Launching browser");
        checkBrowserVersion();
        checkOSCompatibility();
        checkRAM();
        checkCPU();
        System.out.println("Browser is launched");
    }
    private void checkBrowserVersion(){
        System.out.println("Checking browser version");
    }
    private void checkOSCompatibility(){
        System.out.println("Checking browser compatibility");
    }
    private void checkRAM(){
        System.out.println("Checking RAM");
    }
    private void checkCPU(){
        System.out.println("Checking CPU");
    }

}
