import java.util.HashMap;

public class Solution437 {

    int ans;
    int target;
    HashMap<Integer, Integer> map = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        ans = 0;
        target = targetSum;
        map.put(0,1);
        dfs(root, root.val);
        return ans;
    }

    void dfs(TreeNode node, int sum){
        if (node == null)   return;
        if (map.containsKey(sum - target)) ans += map.get(sum - target);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        if (node.left != null ) dfs(node.left, sum + node.left.val);
        if (node.right != null ) dfs(node.right, sum + node.right.val);
        map.put(sum, map.getOrDefault(sum, 0) - 1);
    }
}
