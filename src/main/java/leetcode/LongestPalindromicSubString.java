package leetcode;

public class LongestPalindromicSubString {

    public String longestPalindrome(String s) {
        String longestPalindrome = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String value = s.substring(i, j + 1);
                if (isPalindrome(value) && value.length() > longestPalindrome.length()) {
                    longestPalindrome = value;
                }
            }
        }
        return longestPalindrome;
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return s.equals(sb.toString());
    }
}
