package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode linkNode2 = new ListNode(4);
        ListNode linkNode3 = new ListNode(3);

        node1.next = linkNode2;
        linkNode2.next = linkNode3;

        ListNode node2 = new ListNode(5);
        ListNode linkNode5 = new ListNode(6);
        ListNode linkNode6 = new ListNode(4);

        node2.next = linkNode5;
        linkNode5.next = linkNode6;

        Solution solution = new Solution();
        printList(solution.addTwoNumbers(node1, node2));
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        int carry = 0;
        ListNode cur = dummy;
        while (l1 != null || l2 != null || carry != 0) {
            int s = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = s / 10;
            cur.next = new ListNode(s % 10);
            cur = cur.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return dummy.next;
    }
}