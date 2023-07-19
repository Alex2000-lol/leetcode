package 二叉树;

/**
 * 功能描述
 *
 * 二叉树的实例
 *
 * @author: 刘新宇
 * @date: 2023年05月08日 14:33
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
