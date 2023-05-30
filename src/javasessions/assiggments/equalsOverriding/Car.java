package javasessions.assiggments.equalsOverriding;

import java.util.Objects;

public class Car {
    int price;          // Instance variable
    String color;       // Instance variable
    int year;           // Instance variable

    public Car(int price, String color, int year) {
        this.price = price;
        this.color = color;
        this.year = year;
    }

    public void engine(){       // // Instance method
        System.out.println("Type of engine");
    }
    public void starter(){
        System.out.println("Type of starter");  // Instance method
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && year == car.year && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
