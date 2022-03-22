import java.util.HashMap;

public class Solution128 {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
        int res = 0;
        for (int num : nums) {
            if (!map.containsKey(num)){
                int left = map.getOrDefault(num-1,0);
                int right = map.getOrDefault(num+1,0);
                int len = left+right+1;
                res = Math.max(len,res);
                map.put(num,len);
                map.put(num-left,len);
                map.put(num+right,len);
            }
        }
        return res;
    }
}
