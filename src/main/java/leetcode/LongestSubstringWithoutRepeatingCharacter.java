package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {

    public int lengthOfLongestSubstring(String s) {
        char[] inputChars = s.toCharArray();
        int maxLength = 0;
        for (int i = 0; i < inputChars.length; i++) {
            int tmpLength = 0;
            Set<Character> tmpSet = new HashSet<>();
            for (int j = i; j < inputChars.length; j++) {
                if (!tmpSet.add(inputChars[j])) {
                    break;
                }
                tmpLength++;
                if (tmpLength > maxLength) {
                    maxLength = tmpLength;
                }
            }
            if (maxLength >= (inputChars.length - i)) {
                break;
            }
        }
        return maxLength;
    }
}
