package javasessions.day08_loops_LoopsAndTimeComplexity;

public class Loops {
    public static void main(String[] args) {
        // In the same way we can use float
        for (double d = 1.1; d <= 5; d++) {
            System.out.println(d);      // 1.1,2.1,3.1,4.1
        }
        System.out.println("---------------");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("---------------");
        // Use cases of while loops
        // When number of iteration are not fixed -- while loop
        // e.g.Total number of links/images on a page
        // e.g.Web table pagination
        // e.g.Page load time
        // e.g.Calendar
        // e.g.Build is running / Jenkins

        // Use cases of for loops
        // When number of iteration are fixed -- for loops
        // e.g. month/days dropdowns
        // Arrays, ArrayList

        // Use cases of do while loos
        // When we need an iteration at least once
        // web table pagination, check if the element is already present
        // go and check the element first and then start the while loop

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}
