package javasessions.noorteck;

public class CountOfOddsAndEvens {
    public static void main(String[] args) {
        CountOfOddsAndEvens countOfOddsAndEvens = new CountOfOddsAndEvens();
        int[] num = {5,2,4,3,6,11,8};
        countOfOddsAndEvens.getEvenOddCount(num);
    }
    public void getEvenOddCount(int[] arr){
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i <=arr.length-1 ; i++) {
            if (arr[i] == 0) {
                continue;
            }else if(arr[i]%2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("Even Count: "+countEven);
        System.out.println("Odd Count: "+countOdd);
    }
}
