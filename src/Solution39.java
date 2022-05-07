import java.util.ArrayList;
import java.util.List;

public class Solution39 {
    List<List<Integer>> ans = new ArrayList<>();
    int[] nums;
    int target;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        nums = candidates;
        this.target = target;
        dfs(0,0,new ArrayList<>());
        return ans;
    }

    public void dfs(int start, int sum, List<Integer> list){
        if (sum == target){
            ans.add(list);
            return;
        }
        if (sum > target){
            return;
        }
        for (int i = start; i < nums.length; i++){
            sum += nums[i];
            List<Integer> temp = new ArrayList<>(list);
            temp.add(nums[i]);
            dfs(i, sum, temp);
            sum -= nums[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,5};
        System.out.println(new Solution39().combinationSum(nums,8));
    }
}
