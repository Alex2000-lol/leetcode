package 二叉树.简单二叉树;

import sun.reflect.generics.tree.Tree;
import 二叉树.TreeNode;

import java.util.Stack;

/**
 * 功能描述
 *
 * 翻转二叉树  前序
 *
 * @author: 刘新宇
 * @date: 2023年05月13日 15:01
 */
public class test226a {

    /**
     * 递归
     *
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {

            return null;

        }

        swapCild(root);

        invertTree(root.left);

        invertTree(root.right);

        return root;

    }

    /**
     * 翻转该节点下的左右节点
     */
    public void swapCild(TreeNode treeNode) {

        TreeNode tmp = treeNode.left;

        treeNode.left = treeNode.right;

        treeNode.right = tmp;

    }


}


class test226b {

    public TreeNode invertTree(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode node = stack.pop();

            swapCild(node);

            if (node.right != null) {

                stack.push(node.right);

            }

            if (node.left != null) {

                stack.push(node.left);

            }

        }
        return root;

    }


    public void swapCild(TreeNode treeNode) {

        TreeNode tmp = treeNode.left;

        treeNode.left = treeNode.right;

        treeNode.right = tmp;

    }

}
