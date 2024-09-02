package tree;

/*
给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。

假设二叉树中至少有一个节点。



示例 1:



输入: root = [2,1,3]
输出: 1
示例 2:



输入: [1,2,3,4,null,5,6,null,null,7]
输出: 7
 */

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftValue {

    // 递归法
    private int Deep = -1;
    private int value = 0;

    public int findBottomLeftValue(TreeNode root) {
        value = root.val;
        findLeftValue(root, 0);
        return value;
    }

    private void findLeftValue(TreeNode root, int deep) {
        if (root == null) return;
        if (root.left == null && root.right == null) { // 在深度最大的叶子节点更新值
            if (deep > Deep) {
                value = root.val;
                Deep = deep;
            }
        }
        if (root.left != null) findLeftValue(root.left, deep + 1); // 前序遍历 左右 先对左子树递归 保证了先找到左叶子节点
        if (root.right != null) findLeftValue(root.right, deep + 1);
    }

    public int findBottomLeftValue1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int res = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (i == 0) {
                    res = poll.val;
                }
                if (poll.left != null) {
                    queue.offer(poll.left);
                }
                if (poll.right != null) {
                    queue.offer(poll.right);
                }
            }
        }
        return res;
    }

}
