package javasessions.noorteck.inheritance;

public class TheDad extends TheGrandpa{
    private int age;
    private int favNumWho;

    public TheDad(String orderOfBirth) {
        super();
    }

    public void setFavNumWho(int favNumWho){
        this.favNumWho = favNumWho;
    }

    public int getFavNumWho(){
        return favNumWho;
    }

    public void setAge(int age) {
        this.age = age;                             // Missing reference this.
    }

    public int getAge() {
        age = age;
        return age;                                 //Missing return value
    }


    public void randomNum() {
        double number [] = {1,43.3,65,8,67.9,23,98,12,12,45,7,0,99, 34,11,54};

        for(int i =0; i < number.length; i++) {    //Missing int and extra ;
            System.out.println(number[i]);
        }
    }
}
