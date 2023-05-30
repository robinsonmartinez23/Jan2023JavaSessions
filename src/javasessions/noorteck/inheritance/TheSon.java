package javasessions.noorteck.inheritance;

public class TheSon extends TheDad{

    private char grade;
    private String city;

    public final boolean IS_JAVA_FUN = true; // Initialize final variable
    public final String MY_STATE = "VA";

    public TheSon(String orderOfBirth) {
        super(orderOfBirth);
    }


    public void setGrade(char grade) {   // Delete ;
        this.grade = grade;
    }

    public char getGrade() {
        System.out.println(grade);
        return grade;
    }

    public void setCity(String city){
        this.city= city;
    }
    public String getCity(){
        return city;
    }


    public void trapZone() {     // To be called it needs to be public. Still there is a away to call a private method importing java.lang.reflect.Method
        char myGrade = getGrade(); // We need to define value of myGrade calling grade variable using getGrade bc is private above

        int myFavNumber = 7;        //We need to initialize variable bc is being used bellow in println
        System.out.println("My FavNumber: " + myFavNumber);

        String teamName = "Bulls";
        System.out.println("My Team Name: " + teamName);

        String schoolName = "America";       //static variables are not allowed in any method
        System.out.println("My School Name: "+ schoolName);

        //grade = myGrade;
        System.out.println("My Grade: " + myGrade);

        int age = 12;
        System.out.println("My age: " + age);

        String country = "USA";
        System.out.println("Country :" + country);

        //boolean IS_JAVA_FUN = false; // It is final and can NOT be initialized as "Yes"

    }

    public void moreTrap() {
        //grade = grade;    // Grade is set in trapZone that will be call inside this method below
                            // Local variable needs to be char but either way is not used in the method
                            // so, we can comment it out
        //MY_STATE = "CA";  // MY_STATE is set in trapZone that will be call inside this method below
                            // Doesn't need to be renamed
                            // so, we can comment it out
        //setCountry("USA"); //String country = setCountry(); We can not save in variable, by other hand we need to set the country
                             //We already set country in trapZone() and it will be called bellow so comment all
        //String country = getCountry(); //String country = getCountry("USA"); no parameters need for get
                                         //We are not using local variable country so comment all
        //setCity("R"); //String city = setCity('R');
                        //Again City will be set for trapZone
        //String city = getCity(); // char city = getCity('R');
                                   // Local variable city not used
        //setAge(12);   // double age = setAge(12.2); Can not be saved, Can't be double bc age is int, Can't be 12.2 bc needs to be integer it means 12
                        //int age = getAge(); // int age = getAge(22); doesn't need parameters and, we are not using local variable age then we can comment th entire line
                        //12 has been set in trap zone already then comment it out
        //addNum(3,4);  //We are not using return value of addNum
        display();   //display(3, 5); Doesn't need parameters
        trapZone();
    }
}
