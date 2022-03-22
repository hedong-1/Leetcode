import java.util.ArrayList;
import java.util.List;

public class Solution373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int loc1 = 0;
        int loc2 = 0;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= k; i++){
            List<Integer> list = new ArrayList<>();
            list.add(nums1[loc1]);
            list.add(nums2[loc2]);
            ans.add(list);
            if (loc1+1 == nums1.length && loc2 + 1== nums2.length){break;}
            if (loc1 + 1 == nums1.length){
                loc2 = loc2 + 1;
            }else if (loc2 + 1== nums2.length){
                loc1 = loc1 + 1;
            }else if (nums1[loc1+1] < nums2[loc2+1]){
                loc1 = loc1 +1;
            }else if (nums1[loc1+1] >= nums2[loc2+1]){
                loc2 = loc2 + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums1[] = {1,7,11};
        int nums2[] = {2,4,6};
        int k = 30;
        System.out.println(new Solution373().kSmallestPairs(nums1,nums2,k));
    }
}
