package day23_Interface_JDK8_FeaturesVariables_TopCastingExample_WebDriverArch;

public class TestHospital {
    public static void main(String[] args) {
        FUIHospital fui = new FUIHospital();
        System.out.println("---US Implementations---");
        fui.physioService();
        fui.cardioService();
        fui.dentalService();
        System.out.println("---UK Implementations---");
        fui.neuroServices();
        fui.pediaServices();
        System.out.println("---India Implementations---");
        fui.oncologyServices();
        fui.orthoServices();
        System.out.println("---Individual Methods of FUIHospital---");
        fui.medicalClaim();
        fui.medicalTraining();
        System.out.println("---Inherited Method from parent Medical---");
        fui.medicalRD();
        System.out.println("---Common methods---");
        fui.emergencyService();
        System.out.println("--Override method a default method--");
        fui.medicalTest();

        System.out.println("---Final & Static variables---");
        System.out.println(USMedical.min_fee);  // min_fee is static and final by in an Interface
                                                // by default, that's why I can call it by Interface name
        //USMedical.min_fee = 100;              // Error, min_fee is final by default in an interface
        System.out.println(fui.extra_fee);       // It will call extra_fee from object FUIHospital
        System.out.println(FUIHospital.min_fee); // can be called by the class where USMedical is implemented
        System.out.println(USMedical.isApproved);   // From interface
        System.out.println(FUIHospital.isApproved); // From class

        // Top casting: child class object can be referred by parent interface ref variable:
        System.out.println("---Top Casting of Parent---");
        USMedical us = new FUIHospital();
        us.physioService();                 // Implementations of USMedical Interface
        us.dentalService();                 // Implementations of USMedical Interface
        us.cardioService();                 // Implementations of USMedical Interface
        us.emergencyService();              // Implementations of USMedical Interface
        us.medicalTest();                   // Default method
        System.out.println("---Top Casting of Grandparent---");
        WorldHealthOrganization wh = new FUIHospital();
        wh.covidVaccinationCamp();          // Only implementations of WHO grandpa Interface

        // Down casting: Not possible
        System.out.println("---Down casting: Not possible---");

        System.out.println("---Calling static methods---");
        // Calling static method:
        USMedical.billing();        // Billing static method from interface (USMedical)
        FUIHospital.billing();      // Billing static method from class (FUIHospital)


    }
}
