import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null) return ans;
        queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            List<Integer> list  = new ArrayList<>();
            for (int i = 0; i < n; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)  queue.add(node.left);
                if (node.right != null)  queue.add(node.right);
            }
            ans.add(list);
        }
        return ans;
    }

}
