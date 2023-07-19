package 二叉树.二叉树遍历;

import 二叉树.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 功能描述
 *
 * 层序遍历
 *
 * @author: 刘新宇
 * @date: 2023年05月07日 21:12
 */
public class test102 {

    List<List<Integer>> lists = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        checkFun(root);

        return lists;

    }

    public void checkFun(TreeNode treeNode) {

        //空树
        if (treeNode == null) {
            return;
        }

        //创建队列，取出节点
        Queue<TreeNode> queue = new LinkedList<>();

        //先把根节点加进来
        queue.offer(treeNode);

        //遍历结束的条件
        while (!queue.isEmpty()) {

            //每一层的节点存在list中
            LinkedList<Integer> list = new LinkedList<>();

            //每层的节点数
            int len = queue.size();

            //遍历每一层节点
            while (len > 0) {

                TreeNode tmpnode = queue.poll();

                list.add(tmpnode.val);

                if (tmpnode.left != null) {

                    queue.offer(tmpnode.left);

                }
                if (tmpnode.right != null) {

                    queue.offer(tmpnode.right);

                }

                len--;

            }

            lists.add(list);

        }


    }

}
