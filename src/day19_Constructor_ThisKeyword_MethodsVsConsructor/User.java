package day19_Constructor_ThisKeyword_MethodsVsConsructor;

public class User {
    String firstName;
    String lastName;
    String email;
    String phone;
    String password;
    String city;

    // AC
    // User can be created if you have:
    // Firstname.
    // Firstname, Lastname.
    // Firstname, Lastname, email.
    // Firstname, Lastname, password, phone.
    // Firstname, Lastname, email, phone, password, city.


    public User(String firstName) {
        this.firstName = firstName;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public User(String firstName, String lastName, String password, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.password = password;
    }

    public User(String firstName, String lastName, String email, String phone, String password, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String[] args) {
        User u1 = new User("Robin");
        System.out.println(u1.firstName + " "+ u1.lastName); // Robin null
        System.out.println(u1.toString());
    }
}
