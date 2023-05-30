package javasessions.noorteck.inheritance;

public class TheGrandpa {

    private int age;                //We are setting the age of GrandPa then we need to create the variable
    private String country;
    //private String city;            //We are not using city to create GrandPa obj then we can delete variable, getter and setter

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCountry(String country) {        // There was an extra ;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

//    private void setCity(String city) {             //There was extra ; and string -> String
//        this.city = city;
//    }
//
//    private String getCity() {
//        return city;
//    }

    public void display() {                                 //Extra ;
        System.out.println("Country: " + country);          //Missing ;
//        System.out.println("City: " + city);              //dont used
//        addNum(11, 4);                                    Not using return value of addNum
    }

//    public int addNum(int a, int b) {            //Extra ; and needs to be public is being called in FunDemo
//        int result;                              //Sum of two int produce an int and return value is int
//        result = a + b;                          //so, result variable should be int.
//        return result;                           //Mistyping rsult->result
//                                                 //We are not using the return value in the method then comment
//    }
}
