public class Solution747 {
    public int dominantIndex(int[] nums) {
        int i;
        int max = nums[0];
        int loc = 0;
        for (i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                loc = i;
            }
        }
        for (int t:nums){
            if(max<2*t&&t!=max){
                return -1;
            }
        }
        return loc;
    }
}
