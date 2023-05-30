package javasessions.day17_PolymosphismConcept;

public class LoginPage {
    public static boolean forgotPwdLinkExist(){
        System.out.println("Checking forgot pwd link on the page");
        return true;
    }
    public void doLogin(String user, String pwd){
        System.out.println("Login with: "+user+" : "+pwd);
        System.out.println("Logged in");
    }
}
