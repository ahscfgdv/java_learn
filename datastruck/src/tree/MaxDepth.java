package tree;

/*
给定一个二叉树 root ，返回其最大深度。

二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。



示例 1：





输入：root = [3,9,20,null,null,15,7]
输出：3
示例 2：

输入：root = [1,null,2]
输出：2
 */

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {

    public int maxDepth1(TreeNode root) {
        if (root == null) return 0;
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return Math.max(lh, rh) + 1;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)   return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int depth = 0;
        while (!que.isEmpty())
        {
            int len = que.size();
            while (len > 0)
            {
                TreeNode node = que.poll();
                if (node.left != null)  que.offer(node.left);
                if (node.right != null) que.offer(node.right);
                len--;
            }
            depth++;
        }
        return depth;
    }

}
