public class Solution31 {
    public void nextPermutation(int[] nums) {
        int i = 0;
        int j = 0;
        if (nums.length > 1){
            for (i = nums.length-2; i > 0; i--){
                if (nums[i] < nums[i+1]){
                    break;
                }
            }
            for (j = nums.length-1; j > 0; j--){
                if (nums[j] > nums[i]){
                    break;
                }
            }
            swap(nums,i,j);
            if (i==0 && j==0){
                i = -1;
            }
            reverse(nums,i+1);
        }
    }

    private void reverse(int[] nums, int i) {
        int left = i;
        int right = nums.length-1;
        while (left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] number = {1};
        new Solution31().nextPermutation(number);
    }
}


