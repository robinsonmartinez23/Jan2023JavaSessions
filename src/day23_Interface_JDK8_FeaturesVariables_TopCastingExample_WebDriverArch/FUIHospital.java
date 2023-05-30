package day23_Interface_JDK8_FeaturesVariables_TopCastingExample_WebDriverArch;

public class FUIHospital extends Medical implements USMedical, UKMedical, IndianMedical {

    int extra_fee = 50;

    //US
    @Override
    public void physioService() {
        System.out.println("FH - physioService");
    }
    @Override
    public void cardioService() {
        System.out.println("FH - cardioService");
    }
    @Override
    public void dentalService() {
        System.out.println("FH - dentalService");
    }

    //UK
    @Override
    public void neuroServices() {
        System.out.println("FH - neuroServices");
    }
    @Override
    public void pediaServices() {
        System.out.println("FH - pediaServices");
    }

    //India
    @Override
    public void oncologyServices() {
        System.out.println("FH - oncologyServices");
    }
    @Override
    public void orthoServices() {
        System.out.println("FH - orthoServices");
    }
    //common:
    @Override
    public void emergencyService() {
        System.out.println("FH -- emergencyService");
    }

    //individual:
    public void medicalTraining() {
        System.out.println("FH -- medicalTraining");
    }
    public void medicalClaim() {
        System.out.println("FH -- medicalClaim");
    }

    // Overriding from grandpa
    @Override
    public void covidVaccinationCamp() {
        System.out.println("FH -- covidVaccination");
    }

    // Method hiding: Same static method in parent and child.
    // NOTE: We can NOT override static methods
    public static void billing() {
        System.out.println("FH -- billing");
    }
    @Override           // It is an override method of USMedical default method medicalTest()
    public void medicalTest() {
        System.out.println("FUI medical test");
    }
    @Override           // It is an override method of USMedical default method medicalReport()
    public void medicalReport() {
        System.out.println("US medical report");
    }
}
