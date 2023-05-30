package javasessions.assiggments.inheritanceAssignment;

public class Fortis extends Hospital{
    public void fortisIndividualMethod(){
        System.out.println("Fortis Individual Method");
    }
    @Override
    public void registerPatient(){
        System.out.println("Registering new patient in Fortis");
    }
    @Override
    public void registerDoctor() {
        System.out.println("Registering new Doctor in Fortis");
    }
}
