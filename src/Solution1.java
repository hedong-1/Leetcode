import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map map = new HashMap();
        int[] ans = new int[2];
        for (int i = 0;;i++){
            int key = target - nums[i];
            if (map.containsKey(key)){
                ans[0] = i;
                ans[1] = (int) map.get(key);
                break;
            }else {
                map.put(nums[i],i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,19};
        int target = 26;
        System.out.println(new Solution1().twoSum(nums,target));
    }
}
