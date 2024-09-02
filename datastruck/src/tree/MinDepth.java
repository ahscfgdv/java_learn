package tree;

/*
给定一个二叉树，找出其最小深度。

最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

说明：叶子节点是指没有子节点的节点。



示例 1：


输入：root = [3,9,20,null,null,15,7]
输出：2
示例 2：

输入：root = [2,null,3,null,4,null,5,null,6]
输出：5
 */

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {

//    public int minDepth1(TreeNode root) {
//        return getMinDepth(root);
//    }

    private int getMinDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = getMinDepth(node.left);
        int right = getMinDepth(node.right);

        if (left == 0 && right == 0) {
            return 1;
        } else if (left == 0) {
            return right + 1; //left为0没有左子树，深度为右子树最小深度+1
        } else if (right == 0) {
            return left + 1;
        }

        return Math.min(left, right) + 1;
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            TreeNode cur = null;
            for (int i = 0; i < size; i++) {
                cur = queue.poll();
                //如果当前节点的左右孩子都为空，直接返回最小深度
                if (cur.left == null && cur.right == null) {
                    return depth;
                }
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
        }
        return depth;
    }

}
