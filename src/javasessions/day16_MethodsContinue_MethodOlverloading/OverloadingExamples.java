package javasessions.day16_MethodsContinue_MethodOlverloading;

public class OverloadingExamples {

    /****************METHOD OVERLOADING****************
     * Within the same class, if we have number of methods
     * 1. With the same name
     * 2. With the different parameters
     * 3. With the different number of parameters
     * 4. With the different order of parameters
     * 5. Return type doesn't matter
     ***************************************************/

    public void test(){
        System.out.println("test Method");
    }
    public void test(int i){
        System.out.println(i);
    }
    public void test(int i, int j){
        System.out.println(i+j);
    }
    public void test(String p){
        System.out.println(p);
    }
    public void test(String p, int i){
        System.out.println(p + i);
    }
    public void test(int i, String p){
        System.out.println(p +i);
    }

    public void login(){

    }
    public void login(String user, String pwd){

    }
    public void login(String user, String pwd, String role){

    }
    //search

    public void search(){

    }
    public void search(String productName){

    }
    public void search(String productName, double price){

    }
    public void search(String productName, double price, String color){

    }
    //payment
    public void doPayment(String upi){

    }
    public void doPayment(String cc, int cvv){

    }
    public void doPayment(String paypal, String pws, int otp){

    }
    //uber
    public void booking(String carType, String fromLocation, String toLocation){

    }
    public void booking(String carType, String fromLocation, String toLocation, int totalPassengers){

    }

    public static void main(String[] args) {
        OverloadingExamples obj = new OverloadingExamples();
        obj.login("robin@gmail","Robin");
        obj.login("robin@gmail","Robin","SDET");
    }
}
