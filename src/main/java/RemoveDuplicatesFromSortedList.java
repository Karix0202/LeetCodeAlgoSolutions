import utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedList {
    public ListNode solution(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        ListNode dummyNode = new ListNode();
        ListNode newHead = dummyNode;

        while (head != null) {
            if (!nums.contains(head.val)) {
                newHead.next = new ListNode(head.val);
                newHead = newHead.next;

                nums.add(head.val);
            }

            head = head.next;
        }

        return dummyNode.next;
    }
}
