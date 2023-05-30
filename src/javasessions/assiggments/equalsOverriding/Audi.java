package javasessions.assiggments.equalsOverriding;

import java.util.Objects;

public class Audi extends Car{
    String model;       // Instance variable
    private boolean hasIssues;  // Private variable


    public Audi(int price, String color, int year, String model) {
        super(price, color, year);
        this.model = model;
    }

    public void setHasIssues(boolean hasIssues){
        this.hasIssues = hasIssues;
    }
    public boolean getHasIssues(){
        return hasIssues;
    }

    public void audioSystem(){      //
        System.out.println("The audio system is JBL");
    }
    @Override                       // Override Method
    public void engine(){
        System.out.println("Six cylinder engine");
    }

    @Override                       // Override Method
    public void starter() {
        System.out.println("Electronic starter");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audi car = (Audi) o;
        return  model.equals(car.model) &&
                price == car.price &&
                year == car.year &&
                color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price, color, year);
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
