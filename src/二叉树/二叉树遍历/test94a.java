package 二叉树.二叉树遍历;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 功能描述
 *
 * 中序遍历
 *
 * @author: 刘新宇
 * @date: 2023年05月08日 15:45
 */
public class test94a {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list;
    }

    public void inorder(TreeNode treeNode, List list) {

        if (treeNode == null) {

            return;

        }

        inorder(treeNode.left, list);
        //注意这句
        list.add(treeNode.val);
        inorder(treeNode.right, list);

    }

}


class test94b {

    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();

        inorder(root, list);

        return list;

    }

    public void inorder(TreeNode treeNode, List list) {

        Stack<TreeNode> treeNodeStack = new Stack<>();

        //定义指针
        TreeNode cur = treeNode;

        /**
         * 这里需要加上 cur != null 是因为最开始遍历的时候，栈是空的，只有!treeNodeStack.isEmpty()的话根本无法遍历
         */
        while (cur != null || !treeNodeStack.isEmpty()) {

            if (cur != null){

                treeNodeStack.push(cur);

                cur = cur.left;

            //遍历到叶子节点
            }else{

                //回到上一个节点
                cur = treeNodeStack.pop();

                list.add(cur.val);

                cur = cur.right;

            }

        }


    }


}
