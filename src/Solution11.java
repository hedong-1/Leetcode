public class Solution11 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int ans = 0;
        while (i<j){
            int t = (j-i) * Math.min(height[i],height[j]);
            if (t > ans){
                ans = t;
            }
            if (height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {1,2,1};
        System.out.println(new Solution11().maxArea(height));
    }
}
