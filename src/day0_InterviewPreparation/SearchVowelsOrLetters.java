package day0_InterviewPreparation;

public class SearchVowelsOrLetters {
    public static void main(String[] args) {
        String input = "This is an example string";
        StringBuilder vowels = new StringBuilder();

        for (char each : input.toCharArray()) {
            if ("aeiouAEIOU".indexOf(each) >= 0) {
                vowels.append(each);
            }
        }
        System.out.println(vowels);
    }
}
