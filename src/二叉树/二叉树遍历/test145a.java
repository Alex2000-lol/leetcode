package 二叉树.二叉树遍历;

import 二叉树.TreeNode;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 功能描述
 *
 * 后序遍历
 *
 * @author: 刘新宇
 * @date: 2023年05月08日 16:16
 */
public class test145a {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        postorder(root, list);

        return list;

    }

    public void postorder(TreeNode treeNode, List list) {

        if (treeNode == null) {

            return;

        }

        postorder(treeNode.left, list);
        postorder(treeNode.right, list);
        list.add(treeNode.val);

    }

}

class test145b {


    /**
     * 使用前序遍历，更改左右节点的入栈顺序，反转一下数组，即后序遍历
     */
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        postorder(root, list);

        return list;

    }

    public void postorder(TreeNode treeNode, List list) {

        Stack<TreeNode> treeNodeStack = new Stack<>();

        treeNodeStack.push(treeNode);

        while (!treeNodeStack.isEmpty()) {

            TreeNode node = treeNodeStack.pop();

            list.add(node.val);

            if (node.left != null) {

                treeNodeStack.push(node.left);

            }
            if (node.right != null) {

                treeNodeStack.push(node.right);

            }

        }

        Collections.reverse(list);

    }


}

