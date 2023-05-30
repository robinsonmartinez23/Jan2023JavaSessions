package javasessions.assiggments.constructorAssignment;

public class Person {
    /*
     * What is the purpose of a constructor in Java?
     * Creation of objects
     * How does a constructor differ from a regular method in Java?
     * Does not return a value and has the same name of the class
     * Can a Java class have multiple constructors? If so, how are they differentiated?
     * Yes, we can overload the constructor
     * What happens if a constructor is not defined in a Java class?
     * Default constructor always is present
     * Can a constructor call other methods or constructors within the same class?
     * Yes with the use of this() keyword, example bellow ->
     *
     *  public class ChainWithinClass{
        ChainWithinClass(){
            System.out.println("\nThis is the no-arg constructor.");
        }
        ChainWithinClass(int y){
            this();
            int var1 = y;
            System.out.println("You passed one argument: " + var1);
        }
        ChainWithinClass(int a, int b){
            this(3);
            int var2 = a;
            int var3 = b;
            System.out.println("You passed two arguments: " + var2 + " and " + var3);
        }
        public static void main(String[] args){
            ChainWithinClass chainObj = new ChainWithinClass(2,4);
        }
      }

     */

    String name;
    int age;
    char gender;
    double height;
    public Person (String name, int age, char gender, double height){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Robin", 43, 'M',6.0);
        Person person2 = new Person("Amanda", 64, 'F',5.3);
    }
}
