package javasessions.assiggments.constructorAssignment;

public class Rectangle {
    /**
     * What is the purpose of a default constructor in Java?
     * Create an object with no parameters
     * How can you differentiate between a default constructor and a constructor that takes in parameters?
     * One takes parameters and another not
     * What is the access level of a constructor in Java?
     * Must be public to be able to create objects but can be private too
     * Can a constructor be private? If so, why would you want to make a constructor private?
     * Yes, It can. In that way we are not able to create objects of the class
     * Can a constructor call a method from another class?
     * Yes, it can by using className.methodName(); if method is static. If it is
     * non-static method and instancing the class and calling though the object obj.methodName();
     */
    double length;
    double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(Rectangle rectangle) { // Method that receive an object
        double area = rectangle.length * rectangle.width;
        return area;
    }

    public double calculateArea(double length, double width) { // Method that receive values' objects
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        double area1 = rectangle1.calculateArea(rectangle1); // Calling by reference
        System.out.println(area1);
        rectangle1.length = 2;
        rectangle1.width = 4;
        area1 = rectangle1.calculateArea(rectangle1.length, rectangle1.width); // Calling by value
        System.out.println(area1);
        System.out.println("------------------------------------------");
        Rectangle rectangle2 = new Rectangle(6, 8);
        double area2 = rectangle2.calculateArea(rectangle2);    // Calling by reference
        System.out.println(area2);
        rectangle2.length = 10;
        rectangle2.width = 12;
        area2 = rectangle2.calculateArea(rectangle2.length, rectangle2.width); // Calling by value
        System.out.println(area2);
    }
}
