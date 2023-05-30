package javasessions.noorteck;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.io.FilterOutputStream;

public class IfElementsExist {
    public static void main(String[] args) {
        IfElementsExist ifElementsExist = new IfElementsExist();
        int[] num = {5,2,4,3,6,11,8};
        int num1 = 5, num2 = 7;
        boolean exist = ifElementsExist.ElementsExist(num, num1,num2);
        System.out.println(num1+" and "+num2+" exist: "+exist);
    }
    boolean ElementsExist(int[] arr,int a, int b){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == a ){
                for(int j = 0; j < arr.length ; j++){
                    if(arr[j] == b ){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
