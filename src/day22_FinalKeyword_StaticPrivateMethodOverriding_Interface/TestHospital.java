package day22_FinalKeyword_StaticPrivateMethodOverriding_Interface;

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

        // Top casting: child class object can be referred by parent interface ref variable:
        System.out.println("---Top Casting of Parent---");
        USMedical us = new FUIHospital();
        us.physioService();                 // Only implementations of USMedical Interface
        us.dentalService();                 // Only implementations of USMedical Interface
        us.cardioService();                 // Only implementations of USMedical Interface
        us.emergencyService();              // Only implementations of USMedical Interface

        System.out.println("---Top Casting of Grandparent---");
        WorldHealthOrganization wh = new FUIHospital();
        wh.covidVaccinationCamp();          // Only implementations of WHO grandpa Interface

        // Down casting: Not possible
        System.out.println("---Down casting: Not possible---");

    }
}
