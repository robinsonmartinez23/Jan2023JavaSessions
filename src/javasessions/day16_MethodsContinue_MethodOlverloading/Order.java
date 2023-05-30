package javasessions.day16_MethodsContinue_MethodOlverloading;

public class Order {

    public int getOrder(String customerName, int price, int tax){ // Only using int values!!!
        int p = price;
        int t = tax;
        int total = p+t;
        return total;
    }
    public static void main(String[] args) {
        Order obj = new Order();
        int rsl = obj.getOrder("Towels", 1000, 5); // We are not using the String parameter
                                                                        // in the method. It is not good practice.
        System.out.println(rsl);
    }
}
