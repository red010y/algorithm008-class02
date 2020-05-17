package LowestCommonAncestorBinaryTree236;

import javax.swing.tree.TreeNode;

/**
 * 我们递归遍历整棵二叉树，定义 f_xfx表示 xx 节点的子树中是否包含 pp 节点或 qq 节点，如果包含为 true，否则为 false。那么符合条件的最近公共祖先 xx
 */
public class Recursive {
    private TreeNode ans;

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            ans = root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
