package day20_OOP_Encapsulation_GetterSetter_Public_Priovate_PrivateConstructor;

public class AmazonLogin {
    public static void main(String[] args) {
        //Registration Robin
        LoginPage user1 = new LoginPage("robin@hp.com","1234rmm");
        //Login
        user1.doLogin(user1.getUserName(), user1.getPassword());
        //Reset pwd
        user1.setPassword("412Rn");
        user1.doLogin(user1.getUserName(), user1.getPassword());

        //Registration Amanda
        LoginPage user2 = new LoginPage("amanda@hp.com","1234amp");
        user2.doLogin(user2.getUserName(), user2.getPassword());
    }
}
