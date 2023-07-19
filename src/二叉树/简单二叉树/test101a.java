package 二叉树.简单二叉树;

import 二叉树.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 功能描述
 *
 * 对称二叉树  递归，迭代
 *
 * @author: 刘新宇
 * @date: 2023年05月13日 19:30
 */
public class test101a {

    /**
     * 递归
     */
    public boolean isSymmetric(TreeNode root) {

        return comPare(root.left, root.right);

    }

    public Boolean comPare(TreeNode nodeleft, TreeNode noderight) {

        if (nodeleft.val != noderight.val) {

            return false;

        }

        if (nodeleft == null && noderight != null) {

            return false;

        }

        if (nodeleft != null && noderight == null) {

            return false;

        }

        if (nodeleft == null && noderight == null) {

            return true;

        }

        Boolean compareOutside = comPare(nodeleft.left, noderight.right);

        Boolean compareInside = comPare(nodeleft.right, noderight.left);

        return compareInside && compareOutside;


    }


}

/**
 * 迭代
 */
class test101b {

    public boolean isSymmetric(TreeNode root) {

        return comPare(root.left, root.right);

    }

    public Boolean comPare(TreeNode nodeleft, TreeNode noderight) {

        //双端队列
        Deque<TreeNode> deque = new LinkedList<>();

        deque.offerFirst(nodeleft);
        deque.offerLast(noderight);

        while (!deque.isEmpty()) {

            TreeNode left = deque.pollFirst();
            TreeNode right = deque.pollLast();

            if (left == null && right == null) {

                continue;

            }

            if (left == null || right == null || left.val != right.val) {

                return false;

            }

            deque.offerFirst(left.left);
            deque.offerFirst(left.right);
            deque.offerLast(right.right);
            deque.offerLast(right.left);

        }

        return true;
    }


}