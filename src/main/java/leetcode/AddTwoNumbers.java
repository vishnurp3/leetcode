package leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }
}

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        ListNode tmpNode = resultNode;
        int carryOver = 0;
        while (l1 != null || l2 != null || carryOver != 0) {
            int a = 0, b = 0;
            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }
            int sum = a + b + carryOver;
            carryOver = sum / 10;
            tmpNode.val = sum % 10;
            if (l1 != null || l2 != null || carryOver != 0) {
                tmpNode.next = new ListNode();
                tmpNode = tmpNode.next;
            }
        }
        return resultNode;
    }
}