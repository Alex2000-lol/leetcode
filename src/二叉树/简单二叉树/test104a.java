package 二叉树.简单二叉树;

import 二叉树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 功能描述
 * <p>
 * 二叉树的最大深度  递归，迭代
 *
 * @author: 刘新宇
 * @date: 2023年05月16日 14:18
 */
public class test104a {

    public int maxDepth(TreeNode root) {

        //这里求的是节点数，所以返回0，如果求的是条数，返回1即可
        if (root == null) {

            return 0;

        }

        int leftDepth = maxDepth(root.left);

        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;

    }

}


/**
 * 迭代
 */
class test104b {

    public int maxDepth(TreeNode root) {

        int depth = 0;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            depth++;

            int len = queue.size();

            while (len > 0) {

                TreeNode treeNode = queue.poll();

                if (treeNode.left != null) {

                    queue.offer(treeNode.left);

                }
                if (treeNode.right != null) {

                    queue.offer(treeNode.right);

                }

                len--;

            }


        }

        return depth;

    }

}
