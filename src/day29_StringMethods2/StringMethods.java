package day29_StringMethods2;

public class StringMethods {
    public static void main(String[] args) {


        System.out.println("-------SUBSTRING--------");
        String msg = "Your transaction id is 12345";
        System.out.println(msg.substring(msg.indexOf("is")+2).trim());
        String trId = msg.substring(msg.indexOf("is")+2).trim();
        System.out.println(trId);

    }
}
