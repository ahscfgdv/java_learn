package tree;

public class IsValidBST {
    // 二叉搜索树保证元素在中序遍历后满足从小到大的顺序
    // 递归
    TreeNode max; //记录前一个节点用做比较
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 左
        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }
        // 中序遍历，验证遍历的元素是不是从小到大
        if (max != null && root.val <= max.val) {
            return false;
        }
        max = root;
        // 右
        boolean right = isValidBST(root.right);
        return right;
    }

}
