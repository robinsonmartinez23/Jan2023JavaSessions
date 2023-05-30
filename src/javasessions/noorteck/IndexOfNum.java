package javasessions.noorteck;

public class IndexOfNum {
    public static void main(String[] args) {
        int[] num = {2,4,6,8};
        int number = 4;
        int position = getIndexPosition(num,number);
        System.out.println(position);
    }
    protected static int getIndexPosition(int[] array, int num){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == num){
                index = i;
                break;
            }else {
                index = -1;
            }
        }
        return index;
    }
}
