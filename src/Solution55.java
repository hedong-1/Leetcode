public class Solution55 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (max >= i){
                int temp = i + nums[i];
                max = Math.max(temp, max);
            }
        }
        if (max >= nums.length - 1){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(new Solution55().canJump(nums));
    }
}
