package javasessions.day13_ArrayList_ClassAndObjects_ObjectReferences;

public class User {
    String name;
    int age;
    String city;

    public static void main(String[] args) {
        User user1 = new User();
        user1.name = ("Robin");
        user1.age = (43);
        user1.city = ("FL");

        User user2 = new User();
        user2.name = ("Amanda");
        user2.age = (64);
        user2.city = ("NY");

        User user3 = new User();
        user3.name = ("Frank");
        user3.age = (73);
        user3.city = ("CS");

        System.out.println(user1.name+" "+user1.age+" "+user1.city); // Robin 43 FL
        System.out.println(user2.name+" "+user2.age+" "+user2.city); // Amanda 64 NY
        System.out.println(user3.name+" "+user3.age+" "+user3.city); // Frank 73 CS

        System.out.println("-------------");
        user1 = user2;
        System.out.println(user1.name+" "+user1.age+" "+user1.city); // Amanda 64 NY
        System.out.println(user2.name+" "+user2.age+" "+user2.city); // Amanda 64 NY
        System.out.println(user3.name+" "+user3.age+" "+user3.city); // Frank 73 CS
        System.out.println("-------------");
        user2 = user3;
        System.out.println(user1.name+" "+user1.age+" "+user1.city); // Amanda 64 NY
        System.out.println(user2.name+" "+user2.age+" "+user2.city); // Frank 73 CS
        System.out.println(user3.name+" "+user3.age+" "+user3.city); // Frank 73 CS
        System.out.println("-------------");
        user3 = user1;
        System.out.println(user1.name+" "+user1.age+" "+user1.city); // Amanda 64 NY
        System.out.println(user2.name+" "+user2.age+" "+user2.city); // Frank 73 CS
        System.out.println(user3.name+" "+user3.age+" "+user3.city); // Amanda 64 NY
    }
}
