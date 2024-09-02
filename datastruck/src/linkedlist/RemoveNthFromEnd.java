package linkedlist;

/*

给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。



示例 1：


输入：head = [1,2,3,4,5], n = 2
输出：[1,2,3,5]
示例 2：

输入：head = [1], n = 1
输出：[]
示例 3：

输入：head = [1,2], n = 1
输出：[1]

 */

public class RemoveNthFromEnd {

    public static void main(String[] args) {
//        ListNode node5 = new ListNode(5);
//        ListNode node4 = new ListNode(4, node5);
//        ListNode node3 = new ListNode(3, node4);
//        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1);
        ListNode h = removeNthFromEnd(node1,1);
        ReverseList.forE(h);
    }

    /*
    双指针的经典应用，如果要删除倒数第n个节点，让fast移动n步，然后让fast和slow同时移动，直到fast指向链表末尾。删掉slow所指向的节点就可以了。
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode quick = dummy;
        ListNode slow = dummy;
        for (int i = 0; i < n; i++) {
            quick = quick.next;
        }
        while (quick.next != null) {
            quick = quick.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
//        return head;
        return dummy.next;
    }

}
