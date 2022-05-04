public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left) + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
    }

    private int getKth(int[] nums1, int start1, int end1, int[] nums2, int start2, int end2, int k) {
        if (start1 == -1 || start1 == end1 + 1){
            return nums2[start2 + k - 1];
        }
        if (start2 == -1 || start2 == end2 + 1){
            return nums1[start1 + k - 1];
        }
        if ( k == 1 ){
            return Math.min(nums1[start1], nums2[start2]);
        }
        int i = start1 + k/2 - 1;
        int j = start2 + k/2 - 1;
        if (i <= end1 && j <= end2){
            if (nums1[i] < nums2[j]){
                return getKth(nums1, i + 1, end1, nums2, start2, end2, k - k/2);
            }else {
                return getKth(nums1, start1, end1, nums2, j + 1, end2, k - k/2);
            }
        }else if (i > end1){
            i = end1;
            if (nums1[i] < nums2[j]){
                return getKth(nums1, -1, end1, nums2, start2, end2, k - (end1-start1+1));
            }else {
                return getKth(nums1, start1, end1, nums2, j + 1, end2, k - k/2);
            }
        }else {
            j = end2;
            if (nums1[i] < nums2[j]){
                return getKth(nums1, i + 1, end1, nums2, start2, end2, k - k/2);
            }else {
                return getKth(nums1, start1, end1, nums2, -1, end2, k - (end2-start2+1));
            }
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(new Solution4().findMedianSortedArrays(num1,num2));
    }
}
