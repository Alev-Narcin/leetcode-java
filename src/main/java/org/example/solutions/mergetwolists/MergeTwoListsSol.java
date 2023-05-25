package org.example.solutions.mergetwolists;

public class MergeTwoListsSol {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode resultCurr = head;

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    resultCurr.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else if (list1.val == list2.val) {
                    resultCurr.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    resultCurr.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                resultCurr.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                resultCurr.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            resultCurr = resultCurr.next;
        }

        head = head.next;

        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }

        return head;
    }
}
