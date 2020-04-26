package NAryTreeLevelOrderTraversal429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 保存每一层的列表，并且在根节点为空时正常工作。
 *
 * 再构造下一层的列表时，我们需要创建新的子列表，然后将该层的所有节点的值插入到列表中。
 * 一个很好的方法时在 while 循环体开始时记录队列的当前大小 size。
 * 然后用另一个循环来处理 size 数量的节点。这样可以保证 while 循环在每一次迭代处理一层。
 */
public class BFS {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                level.add(node.val);
                queue.addAll(node.children);
            }
            result.add(level);
        }
        return result;
    }
}
