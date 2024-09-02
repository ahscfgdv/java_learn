package tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AverageOfLevels {

    /**
     * 解法：队列，迭代。
     * 每次返回每层的最后一个字段即可。
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Deque<TreeNode> que = new LinkedList<>();

        if (root == null) {
            return list;
        }

        que.offerLast(root);
        while (!que.isEmpty()) {

            int levelSize = que.size();
            double levelSum = 0.0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode poll = que.pollFirst();

                levelSum += poll.val;

                if (poll.left != null) {
                    que.addLast(poll.left);
                }
                if (poll.right != null) {
                    que.addLast(poll.right);
                }
            }
            list.add(levelSum / levelSize);
        }
        return list;
    }

}
