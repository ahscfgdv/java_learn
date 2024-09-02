package linkedlist;

/*
给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。



示例 1：


输入：head = [1,2,3,4]
输出：[2,1,4,3]
示例 2：

输入：head = []
输出：[]
示例 3：

输入：head = [1]
输出：[1]
 */

public class SwapPairs {

    /*

     */

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
//        ListNode node1 = new ListNode(1, node2);
        ListNode h = swapPairs(node2);
        ReverseList.forE(h);
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dumyhead = new ListNode(-1); // 设置一个虚拟头结点
        dumyhead.next = head; // 将虚拟头结点指向head，这样方便后面做删除操作
        ListNode cur = dumyhead;
        ListNode temp; // 临时节点，保存两个节点后面的节点
        ListNode firstnode; // 临时节点，保存两个节点之中的第一个节点
        ListNode secondnode; // 临时节点，保存两个节点之中的第二个节点
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next.next.next;
            firstnode = cur.next;
            secondnode = cur.next.next;
            cur.next = secondnode;       // 步骤一
            secondnode.next = firstnode; // 步骤二
            firstnode.next = temp;      // 步骤三
            cur = firstnode; // cur移动，准备下一轮交换
        }
        return dumyhead.next;
    }


//    public ListNode swapPairs(ListNode head) {
//        ListNode dummy = new ListNode(0, head);
//        ListNode cur = dummy;
//        while (cur.next != null && cur.next.next != null) {
//            ListNode node1 = cur.next;// 第 1 个节点
//            ListNode node2 = cur.next.next;// 第 2 个节点
//            cur.next = node2; // 步骤 1
//            node1.next = node2.next;// 步骤 3
//            node2.next = node1;// 步骤 2
//            cur = cur.next.next;
//        }
//        return dummy.next;
//    }

}
