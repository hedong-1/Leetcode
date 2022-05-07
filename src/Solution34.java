import java.util.Arrays;

public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length==0){
            return new int[]{-1, -1};
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int lIdx = -1;
        int rIdx = -1;
        while (left < right){
            mid = left + (right - left)/2;
            if (nums[mid] >= target){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        if (nums[left] == target)    lIdx = left;
        left = 0;
        right = nums.length - 1;
        while (left < right){
            mid = left + (right - left)/2 + 1;
            if (nums[mid] <= target){
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        if (nums[right] == target)    rIdx = right;
        int[] ans = {lIdx,rIdx};
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3};
        System.out.println(Arrays.toString(new Solution34().searchRange(nums, 1)));
    }
}
