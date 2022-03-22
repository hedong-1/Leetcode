public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right =  nums.length - 1;
        int mid = 0;
        while (left <= right){
            mid  = left +(right - left)/2;
            if (nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else if (nums[mid] == target){
                return mid;
            }
        }
        if (nums[mid] < target){ mid = mid +1;}
        return mid;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,7,8,10,11};
        int target = 4;
        System.out.println(new Solution35().searchInsert(nums,target));
    }
}
