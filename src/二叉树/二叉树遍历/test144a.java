package 二叉树.二叉树遍历;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 功能描述
 *
 * 前序遍历 递归和迭代
 *
 * @author: 刘新宇
 * @date: 2023年05月08日 15:27
 */
public class test144a {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        preorder(root, list);

        return list;

    }

    public void preorder(TreeNode treeNode, List list) {

        if (treeNode == null) {

            return;

        }
        //注意这句
        list.add(treeNode.val);
        preorder(treeNode.left, list);
        preorder(treeNode.right, list);


    }


}


class test144b{

    /**
     * 迭代
     */
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        preorder(root, list);

        return list;

    }

    public void preorder(TreeNode treeNode, List list) {

        Stack<TreeNode> treeNodeStack = new Stack<>();

        if (treeNode == null) {

            return;

        }

        treeNodeStack.push(treeNode);

        while (!treeNodeStack.isEmpty()) {

            TreeNode node = treeNodeStack.pop();

            list.add(node.val);

            if (node.right != null) {

                treeNodeStack.push(node.right);

            }
            if (node.left != null) {

                treeNodeStack.push(node.left);

            }

        }


    }


}
