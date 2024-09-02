package tree;

/*
给定二叉树的根节点 root ，返回所有左叶子之和。



示例 1：



输入: root = [3,9,20,null,null,15,7]
输出: 24
解释: 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
示例 2:

输入: root = [1]
输出: 0
 */

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int leftValue = sumOfLeftLeaves(root.left);    // 左
        int rightValue = sumOfLeftLeaves(root.right);  // 右

        int midValue = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            midValue = root.left.val;
        }
        int sum = midValue + leftValue + rightValue;  // 中
        return sum;
    }

}
