package BinaryTreeInorderTraversal94;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Recursive {
    public List< Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList< >();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List < Integer > res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }
}