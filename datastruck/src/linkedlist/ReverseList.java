package linkedlist;

/*
给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。


示例 1：


输入：head = [1,2,3,4,5]
输出：[5,4,3,2,1]
示例 2：


输入：head = [1,2]
输出：[2,1]
示例 3：

输入：head = []
输出：[]
 */

public class ReverseList {

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode re = reverseList(node1);
        forE(re);
    }

    public static void forE(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prep = head;
        ListNode curr = head.next;
        prep.next = null;
        while (curr.next != null) {
            ListNode temp = curr.next;
            curr.next = prep;
            prep = curr;
            curr = temp;
        }
        curr.next = prep;
        return curr;
    }

}
