package javasessions.noorteck;

import java.util.Arrays;

public class CommonStrings {
    public static void main(String[] args) {
        CommonStrings cm = new CommonStrings();
        String[] s1 = {"Reston", "VA", "CA", "sport", "Java", "soccer", "A", "B", "C",};
        String[] s2 = {"Sterling", "football", "math", "school", "VA", "tv", "Reston"};
        cm.getCommonElement(s1, s2);
    }

    void getCommonElement(String[] arr1, String[] arr2) {
        if (arr1.length >= arr2.length) {
            String[] commonElem = new String[arr2.length];
            int k = 0;
            for (int i = 0; i <= arr1.length - 1; i++) {
                for (int j = 0; j <= arr2.length - 1; j++) {
                    if (arr1[i].equals(arr2[j])) {
                        commonElem[k] = arr1[i];
                        k++;
                    }
                }
            }
            System.out.println(Arrays.toString(commonElem));
        } else {
            String[] commonElem = new String[arr1.length];
            int k = 0;
            for (int i = 0; i <= arr1.length - 1; i++) {
                for (int j = 0; j <= arr2.length - 1; j++) {
                    if (arr1[i].equals(arr2[j])) {
                        commonElem[k] = arr1[i];
                        k++;
                    }
                }
            }
            System.out.println(Arrays.toString(commonElem));
        }
    }
}
