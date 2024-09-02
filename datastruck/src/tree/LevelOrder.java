package tree;

import java.util.*;

public class LevelOrder {

    public List<List<Integer>> resList = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        checkFun01(root,0);
//        checkFun02(root);

        return resList;
    }

    //BFS--递归方式
    public void checkFun01(TreeNode node, Integer deep) {
        if (node == null) return;
        deep++;

        if (resList.size() < deep) {
            //当层级增加时，list的Item也增加，利用list的索引值进行层级界定
            List<Integer> item = new ArrayList<Integer>();
            resList.add(item);
        }
        resList.get(deep - 1).add(node.val);

        checkFun01(node.left, deep);
        checkFun01(node.right, deep);
    }

    //BFS--迭代方式--借助队列
    public void checkFun02(TreeNode node) {
        if (node == null) return;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(node);

        while (!que.isEmpty()) {
            List<Integer> itemList = new ArrayList<Integer>();
            int len = que.size();

            while (len > 0) {
                TreeNode tmpNode = que.poll();
                itemList.add(tmpNode.val);

                if (tmpNode.left != null) que.offer(tmpNode.left);
                if (tmpNode.right != null) que.offer(tmpNode.right);
                len--;
            }

            resList.add(itemList);
        }

    }

    /**
     * N叉树的层序遍历
     * 解法1：队列，迭代。
     */
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<Node> que = new LinkedList<>();

        if (root == null) {
            return list;
        }

        que.offerLast(root);
        while (!que.isEmpty()) {
            int levelSize = que.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node poll = que.pollFirst();

                levelList.add(poll.val);

                List<Node> children = poll.children;
                if (children == null || children.size() == 0) {
                    continue;
                }
                for (Node child : children) {
                    if (child != null) {
                        que.offerLast(child);
                    }
                }
            }
            list.add(levelList);
        }

        return list;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
