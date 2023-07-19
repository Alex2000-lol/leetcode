package 二叉树.简单二叉树;

import jdk.internal.org.objectweb.asm.tree.LdcInsnNode;
import 二叉树.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

/**
 * 功能描述
 * <p>
 * n叉树的最大深度  递归，迭代
 *
 * @author: 刘新宇
 * @date: 2023年05月16日 15:26
 */


/**
 * n叉树实例
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}


/**
 * 递归
 */
public class test559a {


    public int maxDepth(Node root) {

        if (root == null) {

            return 0;

        }

        int depth = 0;

        if (!root.children.isEmpty()) {

            for (Node node : root.children) {

                depth = Math.max(depth, maxDepth(node));

            }


        }

        return depth + 1;

    }


}


/**
 * 迭代
 */
class test559b {

    public int maxDepth(Node root) {

        if (root == null){

            return 0;

        }

        int depth = 0;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            depth++;

            int len = queue.size();

            while (len > 0) {

                Node node = queue.poll();

                if (!node.children.isEmpty()) {

                    for (Node child : node.children) {

                        queue.offer(child);

                    }

                }

                len--;

            }

        }

        return depth;

    }

}
