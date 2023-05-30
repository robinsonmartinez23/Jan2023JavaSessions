package day0_InterviewPreparation;

public class Palindrome {
    public static void main(String[] args) {
        /**
         * input = "caac"        // 4
         * input = "  caac  "
         * input = "ac ac"
         * input = ""
         *
         * output = is palindrome / in not
         */

        String str = "";
        str = str.trim().replace(" ","");
        boolean isPalindrome = true;
        if(str.length()!=0) {
            for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
                if (str.charAt(i) != str.charAt(j)) {
                    isPalindrome = false;
                    System.out.println("in not palindrome");
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("It is palindrome");
            }
        }else{
            System.out.println("String is empty");
        }
    }
}
