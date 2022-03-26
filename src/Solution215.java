public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int index = k - 1;
        return search(nums, index, 0, nums.length - 1);
    }

    int search(int[] nums, int index, int left, int right){
        int pivot = nums[left];
        int start = left;
        int end = right;
        while(left != right){
            while (left < right && nums[right] <= pivot){
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] >= pivot){
                left++;
            }
            nums[right] = nums[left];
        }
        nums[right] = pivot;
        if (right == index){
            return pivot;
        }else if(right > index){
            return search(nums, index, start, left - 1);
        }else{
            return search(nums, index, right + 1, end);
        }
    }
}
