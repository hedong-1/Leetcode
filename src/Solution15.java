import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < len; i++){
            if (i>0 && nums[i]==nums[i-1])  continue;
            int target = -nums[i];
            int left = i+1;
            int right = len-1;
            while (left < right){
                if (nums[left] + nums[right] == target){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }else if (nums[left] + nums[right] > target){
                    right--;
                } else {
                    left++;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -1,0,1,2,-1,-4};
        System.out.println(new Solution15().threeSum(nums));
    }
}
