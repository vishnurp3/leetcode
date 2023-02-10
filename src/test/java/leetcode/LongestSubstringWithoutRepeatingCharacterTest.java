package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharacterTest {

    LongestSubstringWithoutRepeatingCharacter obj = new LongestSubstringWithoutRepeatingCharacter();

    @Test
    public void test1() {
        Assertions.assertEquals(3, obj.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1, obj.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() {
        Assertions.assertEquals(3, obj.lengthOfLongestSubstring("pwwkew"));
    }
}
