package tree;

public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int targetsum) { // 返回值保证只找到一条路径
        if (root == null) {
            return false;
        }
        targetsum -= root.val;
        // 叶子结点
        if (root.left == null && root.right == null) {
            return targetsum == 0;
        }
        if (root.left != null) {
            boolean left = hasPathSum(root.left, targetsum);
            if (left) {      // 已经找到
                return true;
            }
        }
        if (root.right != null) {
            boolean right = hasPathSum(root.right, targetsum);
            if (right) {     // 已经找到
                return true;
            }
        }
        return false;
    }
}
