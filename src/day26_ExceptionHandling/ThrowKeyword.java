package day26_ExceptionHandling;

import java.rmi.server.ExportException;

public class ThrowKeyword {

    // throws: Used to delegate exception
    // throw: To create our own custom exception

    public static void main(String[] args) {
        try {
            throw new Exception("User is not founded");   //Custom exception - done by me
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("----------------");
        String data = null;
        try {
            throw new Exception("Data not founded");    //Custom exception - done by me
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
