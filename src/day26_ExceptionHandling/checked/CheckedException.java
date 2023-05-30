package day26_ExceptionHandling.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) {
        System.out.println("A");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("B");

        try {
            FileInputStream file = new FileInputStream("c:\\documents\\whatever.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("C");
    }
}
