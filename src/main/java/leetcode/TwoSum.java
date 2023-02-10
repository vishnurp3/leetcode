package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer tmpIndex = map.get(nums[i]);
            if (null != tmpIndex) {
                return new int[]{tmpIndex, i};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{};
    }
}
