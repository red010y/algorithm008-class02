package BinaryTreePreorderTraversal144;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;

/**
 * 从当前节点向下访问先序遍历的前驱节点，每个前驱节点都恰好被访问两次。
 */
public class Moris {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> output = new LinkedList<>();

        TreeNode node = root;
        while (node != null) {
            if (node.left == null) {
                output.add(node.val);
                node = node.right;
            }
            else {
                TreeNode predecessor = node.left;
                while ((predecessor.right != null) && (predecessor.right != node)) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    output.add(node.val);
                    predecessor.right = node;
                    node = node.left;
                }
                else{
                    predecessor.right = null;
                    node = node.right;
                }
            }
        }
        return output;
    }
}
