public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int right = -1;
        int left = - 1 ;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < max){
                right = i;
            }else {
                max = nums[i];
            }

            if (nums[nums.length-i-1] > min){
                left = nums.length-i-1;
            }else {
                min = nums[nums.length-i-1];
            }
        }
        if (left == -1 || right == -1){
            return 0;
        }else {
            return right-left+1;
        }
    }
}
