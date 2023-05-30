package javasessions.assiggments.inheritanceAssignment;

public class Max extends Hospital{
    public void maxIndividualMethod(){
        System.out.println("Max Individual Method");
    }
    @Override
    public void registerPatient(){
        System.out.println("Registering new patient in Max");
    }
    @Override
    public void registerDoctor() {
        System.out.println("Registering new Doctor in Max");
    }
}
