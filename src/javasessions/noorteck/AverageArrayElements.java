package javasessions.noorteck;

public class AverageArrayElements {

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8};
        double avg = getArrayAverage(num);
        System.out.println(avg);
    }

    private static double getArrayAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return (sum / arr.length);
    }

}
