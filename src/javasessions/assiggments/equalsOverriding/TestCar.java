package javasessions.assiggments.equalsOverriding;


public class TestCar {
    public static void main(String[] args) {
        // Audi car object creation from Class Audi
        Audi audiQ5 = new Audi(55000, "Red",2020,"Q5");
        System.out.println(audiQ5.price);           // Retrieving parent instance variable
        System.out.println(audiQ5.color);           // Retrieving parent instance variable
        System.out.println(audiQ5.year);            // Retrieving parent instance variable
        System.out.println(audiQ5.model);           // Retrieving local instance variable
        System.out.println(audiQ5.getHasIssues());  // Retrieving before set
        audiQ5.setHasIssues(true);                  // Setting value
        System.out.println(audiQ5.getHasIssues());  // Retrieving after set
        System.out.println(audiQ5);
        audiQ5.engine();                    // Retrieving override method
        audiQ5.starter();                   // Retrieving override method
        audiQ5.audioSystem();               // Retrieving instance method
        System.out.println("---------------------------------------------");
        // Audi car object creation referenced by Car (Top Casting)
        Car audiQ4 = new Audi(45000, "Black",2021,"Q4");
        System.out.println(audiQ4.price);           // Retrieving parent instance variable
        System.out.println(audiQ4.color);           // Retrieving parent instance variable
        System.out.println(audiQ4.year);            // Retrieving parent instance variable
        //System.out.println(audiQ4.model);           No possible - Retrieving local instance variable
        //System.out.println(audiQ4.getHasIssues());  No possible - Retrieving before set
        //audiQ4.setHasIssues(true);                  No possible - Setting value
        //System.out.println(audiQ4.getHasIssues());  No possible - Retrieving after set
        System.out.println(audiQ4);
        audiQ4.engine();                    // Retrieving override method
        audiQ4.starter();                   // Retrieving override method
        //audiQ4.audioSystem();             No possible - Retrieving instance method
        System.out.println("---------------------------------------");
        // Using equals method
        Audi car1 = new Audi(20000,"Red",2021,"Q5");
        Audi car2 = new Audi(20000,"Red",2021,"Q5");
        if(car1.equals(car2)){
            System.out.println("Cars are equals");
        }else {
            System.out.println("Cars are NOT equals");
        }
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

    }
}
