package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void test1() {
        Assertions.assertArrayEquals(new int[]{0, 1},
                twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void test2() {
        Assertions.assertArrayEquals(new int[]{1, 2},
                twoSum.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    public void test3() {
        Assertions.assertArrayEquals(new int[]{0, 1},
                twoSum.twoSum(new int[]{3, 3}, 6));
    }
}
