package javasessions.day17_PolymosphismConcept;

public class Browsers {

    /**************************************
     *  Object can NOT hold static variables or methods
     *  static will be stored in CMA ->Perm Generation Memory (static memory) --> Metaspace (After JDK 1.8)is dynamic memory
     *  Any method can be overloaded
     *  Always call static methods with the class name
     *  Object can call/access static properties but is a warning and not good practice
     */
    String name;
    static String hq = "Orlando";

    public int getBrowserVersion(){
        System.out.println("Get browser version");
        return 100;
    }

    public static String getBrowserVendor(){
        System.out.println("Get browser vendor");
        return "Mozilla";
    }

    public static void main(String[] args) {
        Browsers obj = new Browsers();
        System.out.println(obj.name); //
        System.out.println(hq); //directly bc is under the same class
        System.out.println(Browsers.hq);//using class name

        obj.getBrowserVersion();
        getBrowserVendor(); //directly bc is under the same class
        Browsers.getBrowserVendor(); //using class name

    }
}
