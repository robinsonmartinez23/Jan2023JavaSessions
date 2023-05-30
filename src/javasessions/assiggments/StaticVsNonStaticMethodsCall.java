package javasessions.assiggments;

public class StaticVsNonStaticMethodsCall {

    //Static calling Static Method
    public static void staticMethod1(){
        staticMethod2();                // directly
    }
    // Static calling Non-Static Method
    public static void staticMethod2(){
        StaticVsNonStaticMethodsCall obj = new StaticVsNonStaticMethodsCall();
        obj.nonStaticMethod1();         // creat a object is a MUST
    }
    // Non-Static calling Static Method
    public void nonStaticMethod1(){
        StaticVsNonStaticMethodsCall.staticMethod1(); // Using class name
        staticMethod1();  // Or directly
    }
    // Non-Static calling Non-Static Method
    public void nonStaticMethod2(){
        nonStaticMethod1(); // directly
    }
}
