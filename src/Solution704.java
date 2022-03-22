public class Solution704 {

    public int search(int[] nums, int target) {
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
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,7,8,10,11};
        int target = 3;
        System.out.println(new Solution704().search(nums,target));
    }
}
