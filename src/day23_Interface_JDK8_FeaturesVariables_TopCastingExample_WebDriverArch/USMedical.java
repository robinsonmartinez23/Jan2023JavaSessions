package day23_Interface_JDK8_FeaturesVariables_TopCastingExample_WebDriverArch;

public interface USMedical extends WorldHealthOrganization {  // Interfaces extends Interfaces
    //static and final in nature(by default)
    int min_fee = 10;
    boolean isApproved = true;

    // abstract method:
    // no method body
    // only method declaration/method prototype/no business logic
    // We can NOT create the object of interface
    // We can NOT create the const... of the interface

    // abstract methods: 100% abstraction -- OOP
    public void physioService();

    public void cardioService();

    public void dentalService();

    public void emergencyService();

    // after jdk 1.8:
    // 1. We can have static method with method body: It means static
    //    method can NOT be abstract method.
    public static void billing() {
        System.out.println("US Medical -- billing");
    }

    // 2. default key word is used to create methods with method body in an interface.
    //    NOTE: Implementing default methods result in partial abstraction
    default void medicalTest() {
        System.out.println("US medical test");
    }
    default void medicalReport() {
        System.out.println("US medical report");
    }
}
