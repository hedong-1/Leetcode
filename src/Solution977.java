public class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int loc = nums.length - 1;
        while (loc >= 0){
            if (nums[i]*nums[i] > nums[j]*nums[j]){
                ans[loc] = nums[i]*nums[i];
                i += 1;
            }else {
                ans[loc] = nums[j]*nums[j];
                j -= 1;
            }
            loc -= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,3};
        System.out.println(new Solution977().sortedSquares(nums));
    }
}
