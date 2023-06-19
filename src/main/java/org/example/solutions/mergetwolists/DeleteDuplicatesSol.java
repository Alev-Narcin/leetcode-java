package org.example.solutions.mergetwolists;

public class DeleteDuplicatesSol {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currList = head;

        while (currList != null && currList.next != null) {
            if (currList.val == currList.next.val) {
                currList.next = currList.next.next;
            } else {
                currList = currList.next;
            }
        }
        return head;
    }
}
