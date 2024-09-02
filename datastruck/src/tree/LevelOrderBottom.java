package tree;

/*
给你二叉树的根节点 root ，返回其节点值 自底向上的层序遍历 。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）



示例 1：


输入：root = [3,9,20,null,null,15,7]
输出：[[15,7],[9,20],[3]]
示例 2：

输入：root = [1]
输出：[[1]]
示例 3：

输入：root = []
输出：[]
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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

}
