package javasessions.day18_MethodChaining_StackMemoryStackOverflow_ExcecutionChain;

public class StackMemory {

      /*********************Execution Chain*****************
      * Execution chain is the flow on witch the execution is being processed in stack memory
      * In the example bellow...

      *      m3()  4th
      *      m2()  3rd        m2()  3rd
      *      m1()  2nd        m1()  2nd       m1()  2nd
      *     main() 1st       main() 1st      main() 1st     main() 1st    FINISH!

      * Main is executed first and so on using LIFO (Last In-First Out), it means m3() will be released
      * from stack memory first

      * Remember: Objets are created in HEAP memory and references in STACK memory static variables
      * and methods are created in CAM (Common Access Memory)
      * NOTE: Error when Stack Memory is full is Stack Overflow Error
      *
      *******************************************************/

    /**
     * Non-static can call Non-static methods? YES, No object needed
     * Static can call Static methods? YES, No object needed
     * Non-static can call Static methods? YES, No object needed, through the class
     * Static can call Non-Static methods? YES, OBJECT NEEDED!
     */

    public void m1(){
        System.out.println("m1 method");
        m2();
    }
    public void m2(){
        System.out.println("m2 method");
        m3();
    }
    public void m3(){
        System.out.println("m3 method");

    }

    public static void main(String[] args) {
        StackMemory obj = new StackMemory();
        obj.m1();
    }
}
