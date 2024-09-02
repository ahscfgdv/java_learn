package tree;

import java.util.*;

/*
给定一棵二叉树的根节点 root ，请找出该二叉树中每一层的最大值。



示例1：



输入: root = [1,3,2,5,3,null,9]
输出: [1,3,9]
示例2：

输入: root = [1,2,3]
输出: [1,3]
 */

public class LargestValues {

    public List<Integer> largestValues(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int max = Integer.MIN_VALUE;
            for(int i = queue.size(); i > 0; i--){
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            result.add(max);
        }
        return result;
    }
}
