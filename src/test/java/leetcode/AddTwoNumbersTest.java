package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void test1() {
        Assertions.assertEquals("807",
                getSum(addTwoNumbers
                        .addTwoNumbers(buildNode(new int[]{2, 4, 3}),
                                buildNode(new int[]{5, 6, 4}))));
    }

    @Test
    public void test2() {
        Assertions.assertEquals("0",
                getSum(addTwoNumbers
                        .addTwoNumbers(buildNode(new int[]{0}),
                                buildNode(new int[]{0}))));
    }

    @Test
    public void test3() {
        Assertions.assertEquals("10009998",
                getSum(addTwoNumbers
                        .addTwoNumbers(buildNode(new int[]{9, 9, 9, 9, 9, 9, 9}),
                                buildNode(new int[]{9, 9, 9, 9}))));
    }

    private String getSum(ListNode resultNode) {
        StringBuilder sb = new StringBuilder();
        while (resultNode != null) {
            sb.append(resultNode.val);
            resultNode = resultNode.next;
        }
        return sb.reverse().toString();
    }

    private ListNode buildNode(int[] nums) {
        ListNode resultNode = new ListNode();
        ListNode tmpNode = resultNode;
        for (int i = 0; i < nums.length; i++) {
            tmpNode.val = nums[i];
            if (i + 1 < nums.length) {
                tmpNode.next = new ListNode();
                tmpNode = tmpNode.next;
            }
        }
        return resultNode;
    }
}
