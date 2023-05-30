package day28_StringConstantPool_StringObject_Literals_Inmutable_StringBuilder;

public class MutableString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Testing");  // Heap Memory
        System.out.println(sb);
        sb.append("Automation");
        System.out.println(sb); // The same object will be updated
        System.out.println("---------------");

    }
}
