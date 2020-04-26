package NAryTreePreorderTraversal589;

import java.util.LinkedList;
import java.util.List;

public class Recursive {
    private List<Integer> res;
    public List<Integer> preorder(Node root) {
        res = new LinkedList<>();
        dfs(root);
        return res;
    }
    private void dfs(Node root) {
        if(root == null)    return;
        res.add(root.val);
        for(var child : root.children)
            dfs(child);
    }
}
