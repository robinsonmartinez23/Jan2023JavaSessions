package javasessions.day17_PolymosphismConcept;

public class LoginTest {




    public static void main(String[] args) {
        if(LoginPage.forgotPwdLinkExist()){
            System.out.println("Change your pwd");
        }
        LoginPage lp = new LoginPage();
        lp.doLogin("robin@gmail.com", "Rm1243");
    }
}
