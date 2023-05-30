package day22_FinalKeyword_StaticPrivateMethodOverriding_Interface;

public class FUIHospital extends Medical implements USMedical, UKMedical, IndianMedical {

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

}
