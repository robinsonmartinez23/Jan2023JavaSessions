package day0_InterviewPreparation;

public class ThisVsThisMethod {
        private int value;

        ThisVsThisMethod(int value) {
            this.value = value; // Assigning the value parameter to the instance variable
        }

        void setValue(int value) {
            this.value = value; // Using 'this' to refer to the instance variable
        }

        void display() {
            System.out.println("Value: " + this.value); // Using 'this' to access the instance variable
        }

    public static void main(String[] args) {
        ThisVsThisMethod thisVsThisMethod = new ThisVsThisMethod(10);
        thisVsThisMethod.setValue(50);
        thisVsThisMethod.display();
    }
}
