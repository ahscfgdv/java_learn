package tree;

/*
给定一个二叉树的 根节点 root，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。



示例 1:



输入: [1,2,3,null,5,null,4]
输出: [1,3,4]
示例 2:

输入: [1,null,3]
输出: [1,3]
示例 3:

输入: []
输出: []
 */

import java.util.*;

public class RightSideView {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode();
        root.right.right = new TreeNode(5);
        System.out.println(levelOrderBottom(root));
    }


    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        // 利用链表可以进行 O(1) 头部插入, 这样最后答案不需要再反转
        LinkedList<List<Integer>> ans = new LinkedList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if (root != null) q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size(); // 每一层的节点个数

            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i ++) {
                TreeNode node = q.poll();

                assert node != null;
                temp.add(node.val);

                if (node.left != null) q.offer(node.left);

                if (node.right != null) q.offer(node.right);
            }

            // 新遍历到的层插到头部, 这样就满足按照层次反序的要求
            ans.addFirst(temp);
        }

        return ans;
    }

    /**
     * 解法：队列，迭代。
     * 每次返回每层的最后一个字段即可。
     *
     * 小优化：每层右孩子先入队。代码略。
     */
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> que = new LinkedList<>();

        if (root == null) {
            return list;
        }

        que.offerLast(root);
        while (!que.isEmpty()) {
            int levelSize = que.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode poll = que.pollFirst();

                if (poll.left != null) {
                    que.addLast(poll.left);
                }
                if (poll.right != null) {
                    que.addLast(poll.right);
                }

                if (i == levelSize - 1) {
                    list.add(poll.val);
                }
            }
        }

        return list;
    }
}
