package javasessions.day11_ArrayLimitation_ForEach_ArrayMemoryAllocation;

public class LoopsWithForEach {
    public static void main(String[] args) {

        // for each loop
        // The limitations of for each loop are that we can NOT manipulate index e.g. initial point
        // end point, etc.
        int num[] = new int[4];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        for (int eachNum : num) {
            System.out.println(eachNum);
        }
        System.out.println("-----------------");
        System.out.println(num[2]);
        System.out.println("-----------------");

        String names[] = new String[5];
        names[0] = "Amanda";
        names[1] = "Ravi";
        names[2] = "Robin";
        names[3] = "Frank";
        names[4] = "Mary";

        for (String eachName : names) {
            System.out.println(eachName);
            if(eachName.equals("Robin")){
                System.out.println(eachName +" is a Tester");
                break;
            }
        }
        System.out.println("-----------------");

        Object employees[] = new Object[5];
        employees[0]="Robin";
        employees[1]=30;
        employees[2]=2.3;
        employees[3]='m';
        employees[4]=true;

        for (Object eachEmp : employees ) {
            System.out.println(eachEmp);
        }

        System.out.println("-----------------");

        int numbers[] = new int[4];
        System.out.println(numbers[0]);
        numbers[0]=1000;
        System.out.println(numbers[0]);

        System.out.println("-----------------");

        int test[] = {10,20,30,40,50,60,70,80};
        System.out.println(test.length);
        System.out.println(test[0]);
        System.out.println(test[2]);
        //System.out.println(test[9]); // Execution OutOutbound
        System.out.println("-----------------");
        test[0] = 100;
        System.out.println(test[0]);
    }
}
