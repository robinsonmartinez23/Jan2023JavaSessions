package javasessions.day08_loops_LoopsAndTimeComplexity;

public class TimeComplexity {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i); // Constant time = Big O (1)

        String name = "Robin";
        System.out.println(name); // Big O (1)

        int n = 10;
        //     1          n      n
        for (int p = 1; p <= n; p++) {
            //                     n
            System.out.println(p);     // Big O (3n+1) We remove the constant part then O (3n) --> O(n)
        }

    }
}
