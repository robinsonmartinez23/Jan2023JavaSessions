package day26_ExceptionHandling;

public class MyException extends RuntimeException{
    // throws: Used to delegate exception
    // throw: To create our own custom exception
    public MyException(String msg){
        super(msg);
    }
}
