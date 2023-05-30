package day20_OOP_Encapsulation_GetterSetter_Public_Priovate_PrivateConstructor;

public class LoginPage {
    private String userName;
    private String password;

    public LoginPage(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void doLogin(String un, String pwd){
        System.out.println("Enter username = "+un);
        System.out.println("Enter password = "+pwd);
        System.out.println("Click login button");

        if (isUserActive(un)){
            System.out.println("User in logged in...");
        }else{
            System.out.println("User in inactive..account is blocked");
        }
    }
    private boolean isUserActive(String us){
        System.out.println("Checking user status = "+us);
        return true;
    }
}
