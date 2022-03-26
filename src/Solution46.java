import java.util.ArrayList;
import java.util.List;

public class Solution46 {
    boolean[] book;
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        book = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++)  book[i] = true;
        dfs(0, nums, new ArrayList<>());
        return ans;
    }

    private void dfs(int step, int[] nums, List<Integer> list) {
        if (step == nums.length){
            ArrayList<Integer> temp = new ArrayList<>(list);
            ans.add(temp);
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if ( book[i] ){
                book[i] = false;
                list.add( nums[i] );
                dfs(step + 1, nums, list);
                book[i] = true;
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(new Solution46().permute(nums));
    }
}
