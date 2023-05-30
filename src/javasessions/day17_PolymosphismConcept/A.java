package javasessions.day17_PolymosphismConcept;

public class A {
    public static void main(String[] args) {
        System.out.println("A-main");
        B.main(args);                  //StackOverFlowError bc A calls B anb vice-versa
    }
}
