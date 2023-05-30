package javasessions.assiggments.inheritanceAssignment;

public class TestHospital {
    public static void main(String[] args) {
        System.out.println("----------Parent Class---------");
        Hospital hospital = new Hospital();
        hospital.registerDoctor();      // Only can access to parent methods
        hospital.registerEmployee();    // Only can access to parent methods
        hospital.registerPatient();     // Only can access to parent methods
        System.out.println("--------------Child Class---------------");
        Apolo apolo = new Apolo();
        apolo.apoloIndividualMethod();  // Can access to individual methods
        apolo.registerDoctor();         // Can access to overridden methods
        apolo.registerPatient();        // Can access to overridden methods
        apolo.registerEmployee();       // Can access to parent methods by default
        System.out.println("------------Top Casting-----------------");
        Hospital apolo1 = new Apolo();
        // apolo1.apoloIndividualMethod();  // Can NOT access to individual methods
                                            //due to accessibility is defined by parent class
        apolo1.registerDoctor();         // Can access to overridden methods
        apolo1.registerPatient();        // Can access to overridden methods
        apolo1.registerEmployee();       // Can access to parent methods




    }
}
