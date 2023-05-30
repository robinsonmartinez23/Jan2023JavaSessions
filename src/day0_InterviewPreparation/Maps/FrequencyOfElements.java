package day0_InterviewPreparation.Maps;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfElements {
    /**
     * aaabbccaabbc
     * a = 5
     * b = 4
     * c = 2
     */
    public static <Entry> void main(String[] args) {
        String s = "aaabbccaabbc";
        String[] sArray = s.split(""); // [a,a,a,b,b,c,c,a,a,b,b,c]
        Map<String,Integer> map = new HashMap<>();

        for ( String each : sArray ) {
           Integer count = map.get(each);
           if (count == null){
               map.put(each,1);
           }else {
               map.put(each,++count);
           }
        }
        System.out.println(map);

     Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        for (Map.Entry<String,Integer> each : entrySet) {
            if(each.getValue() > 1){
                System.out.println(each + " is Repeated");
            }else{
                System.out.println(each +" is unique");
            }
        }


    }


}
