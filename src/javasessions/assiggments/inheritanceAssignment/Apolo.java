package javasessions.assiggments.inheritanceAssignment;

public class Apolo extends Hospital{
    public void apoloIndividualMethod(){
        System.out.println("Fortis Individual Method");
    }
    @Override
    public void registerPatient(){
        System.out.println("Registering new patient in Apolo");
    }
    @Override
    public void registerDoctor() {
        System.out.println("Registering new Doctor in Apolo");
    }
}
